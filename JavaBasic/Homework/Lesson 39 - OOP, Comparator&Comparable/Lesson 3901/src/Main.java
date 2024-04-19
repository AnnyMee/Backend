import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
Допустим у нас есть список студентов, у каждого студента есть имя, группа к которой он принадлежит, список оценок.
Для каждой группы заданы номер группы и ответственный преподаватель. Оценки - список Double.

Ваша программа должна иметь следующие возможности:

Допустим у нас есть список банковских транзакций. Каждая транзакция состоит из следующих полей:
- int id
- Account accDebit
- Account accCredit
- double amount
- currencyCode
id - должен создаваться автоматически, по мере создания транзакции.

Класс Account состоит из двух полей String iban, Person owner.
Соответственно accDebit - счет отправителя, а accCredit - счет получателя
currecyCode - код валюты, который может принимать следующие значения {EUR, USD, GPB}

По-умолчанию, транзакции должны сортироваться по-полю id, причем транзакции с большим id должны идти в первую очередь.

Ваша программа должна уметь выводить
все транзакции в натуральном порядке т.е. с сортировкой по умолчанию
все транзакции отсортированные по сумме (сначала большие, потом меньшие)
все транзакции отсортированные по коду валюты и сумме

Ну и немного труднее:

Ваша программа должна уметь выводить:
все транзакции с заданным счетом отправителя
все транзакции с заданным счетом получателя
все транзакции с заданной валютой
Подумайте, как можно организовать решение. Маленькая подсказка на следующей странице.

Подсказка 1:
данную задачу можно решить одним методом, в который в качестве параметра передавать список и способ (условие),
по которому мы отбираем транзакции из этого списка.
Естественно, способ - это будет интерфейс, который будет содержать метод, например такой boolean test(Transaction t).

Подсказка 2:
класс реализующий интерфейс условие отбора может иметь поля и конструктор с данными для сравнения.
 */
public class Main {
    public static void main(String[] args) {

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Account("DE16500105175529698113", new Person("Ann", "Gold")), new Account("PL91109024029811451196248746", new Person("Neli", "Rammi")), 450.8, CurrencyCode.EUR));
        transactions.add(new Transaction(new Account("DE16500105175529698113", new Person("Ann", "Gold")), new Account("SK9645522174157817885793", new Person("Lora", "Deena")), 780.6, CurrencyCode.USD));
        transactions.add(new Transaction(new Account("DE16500105175529698113", new Person("Ann", "Gold")), new Account("GL6421945647324149", new Person("John", "Mike")), 1500.50, CurrencyCode.GBP));
        transactions.add(new Transaction(new Account("IT68Q0300203280279591421232", new Person("Mary", "Lin")), new Account("DE16500105175529698113", new Person("Ann", "Gold")), 509.5, CurrencyCode.EUR));
        transactions.add(new Transaction(new Account("IT68Q0300203280279591421232", new Person("Mary", "Lin")), new Account("PL91109024029811451196248746", new Person("Neli", "Rammi")), 1200.5, CurrencyCode.EUR));
        transactions.add(new Transaction(new Account("IT68Q0300203280279591421232", new Person("Mary", "Lin")), new Account("SK9645522174157817885793", new Person("Lora", "Deena")), 400.8, CurrencyCode.USD));
        transactions.add(new Transaction(new Account("SK9645522174157817885793", new Person("Lora", "Deena")), new Account("IT68Q0300203280279591421232", new Person("Mary", "Lin")), 490.5, CurrencyCode.USD));
        transactions.add(new Transaction(new Account("SK9645522174157817885793", new Person("Lora", "Deena")), new Account("GL6421945647324149", new Person("John", "Mike")), 2740.9, CurrencyCode.GBP));
        transactions.add(new Transaction(new Account("SK9645522174157817885793", new Person("Lora", "Deena")), new Account("DE16500105175529698113", new Person("Ann", "Gold")), 649.3, CurrencyCode.USD));
        transactions.add(new Transaction(new Account("SK9645522174157817885793", new Person("Lora", "Deena")), new Account("PL91109024029811451196248746", new Person("Neli", "Rammi")), 5077.2, CurrencyCode.EUR));
        transactions.add(new Transaction(new Account("PL91109024029811451196248746", new Person("Neli", "Rammi")), new Account("GL6421945647324149", new Person("John", "Mike")), 122.1, CurrencyCode.GBP));
        transactions.add(new Transaction(new Account("PL91109024029811451196248746", new Person("Neli", "Rammi")), new Account("SK9645522174157817885793", new Person("Lora", "Deena")), 562.4, CurrencyCode.USD));
        transactions.add(new Transaction(new Account("PL91109024029811451196248746", new Person("Neli", "Rammi")), new Account("DE16500105175529698113", new Person("Ann", "Gold")), 3400.0, CurrencyCode.EUR));
        transactions.add(new Transaction(new Account("GL6421945647324149", new Person("John", "Mike")), new Account("SK9645522174157817885793", new Person("Lora", "Deena")), 996.5, CurrencyCode.GBP));
        transactions.add(new Transaction(new Account("GL6421945647324149", new Person("John", "Mike")), new Account("IT68Q0300203280279591421232", new Person("Mary", "Lin")), 623.2, CurrencyCode.EUR));

        print(transactions);
        System.out.println("-------------------default-------------------");
        sortAndPrint(transactions);
        System.out.println("------------------by amount-------------------");
        sortAndPrint(transactions, new ComparatorByAmount().reversed());
        System.out.println("-------------------by currency and amount-------------------");
        sortAndPrint(transactions, new ComparatorByCurrency().thenComparing(new ComparatorByAmount().reversed()));
        System.out.println("-------------------filter by debit acc-------------------");
        List<Transaction> resList1 = filter(transactions, new TransactionPredicateByDebitAcc("PL91109024029811451196248746"));
        System.out.println(resList1);
        System.out.println("-------------------filter by credit acc-------------------");
        List<Transaction> resList2 = filter(transactions, new TransactionPredicateByCreditAcc("PL91109024029811451196248746"));
        System.out.println(resList2);
        System.out.println("-------------------filter by currency-------------------");
        List<Transaction> resList3 = filter(transactions, new TransactionPredicateByCurrency(CurrencyCode.EUR));
        System.out.println(resList3);
    }
    public static void print(List<Transaction> list){
        for(Transaction t : list){
            System.out.println(t);
        }
    }
    public static void sortAndPrint (List<Transaction> list){
        sortAndPrint(list,null);
    }
    public static void sortAndPrint (List<Transaction> list, Comparator<Transaction> comparator){

        List<Transaction> tempList = new ArrayList<>(list);
        if(comparator==null) {
            Collections.sort(tempList);
        }else {
            Collections.sort(tempList, comparator);
        }
        print(tempList);
    }
    public static List<Transaction> filter(List<Transaction> list, TransactionPredicate predicate){
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : list){
            if(predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }
}