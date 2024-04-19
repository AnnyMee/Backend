import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
/*
Дан список BankAccount {Person owner, String IBAN, double balance). Класс Person состоит из {String fName, String lName String email)

1. Используя stream необходимо получить List всех аккаунтов, баланс которых составляет менее 100.

2. Используя stream необходимо получить set из всех клиентов банка, баланс счета которых превышает 100000;

3. Используя stream, сформировать отсортированный по lName лист строк вида “Lennon J.;IBAN: DE19************43;lennon@gmail.com”
(т.е. ФИО; замаскированный счет, в котором открыты только первые 2 и последние 2 символа, email) для всех клиентов, чей баланс более 100000

4. Используя stream необходимо получить Map<String, Double> где ключ - это fName+lName клиента значение - баланс для всех счетов, баланс которых не равен 0
 */
public class Main {
    public static void main(String[] args) {
        List<BankAccount> list = new ArrayList<>(List.of(
                new BankAccount(new Person("Mary","Bloody","bloody.99@mail.com"),"DE5698425315",10_000),
                new BankAccount(new Person("Greg","House","ghouse@mail.com"),"DE8754965231",60),
                new BankAccount(new Person("Alice","Winchester","alice.winner@mail.com"),"DE8546952314",50),
                new BankAccount(new Person("Larry","Donk","donkey@mail.com"),"DE5642331200",0),
                new BankAccount(new Person("Nina","Dobrev","ninanina91@mail.com"),"DE0012245869",0),
                new BankAccount(new Person("Dan","Balan","crazy.loop@mail.com"),"DE7854699923",500_000),
                new BankAccount(new Person("Rock","Lee","power.of.youth@mail.com"),"DE3326554210",750_000)

        ));

        List<BankAccount> newList = list.stream()
                        .filter(bankAccount -> bankAccount.getBalance()<100)        //1
                        .toList();
        Set<Person> newSet = list.stream()
                        .filter(bankAccount -> bankAccount.getBalance()>100_000)    //2
                        .map(BankAccount::getOwner)  //bankAccount -> bankAccount.getOwner()
                        .collect(Collectors.toSet());
        List<String> sortedList = list.stream()
                        .filter(bankAccount -> bankAccount.getBalance()>100_000)    //3
                        .sorted((o1, o2) -> o1.getOwner().getLastName().compareTo(o2.getOwner().getLastName()))
                        .map(bankAccount -> "\n" + bankAccount.getOwner().getLastName()+" " +bankAccount.getOwner().getFirstName().charAt(0)+". IBAN: "+bankAccount.secureIban()+ "; "+bankAccount.getOwner().getEmail())
                        .toList();
        Map<String, Double> newMap = list.stream()
                        .filter(bankAccount -> bankAccount.getBalance()!=0)         //4                                                         //bankAccount -> bankAccount.getBalance()
                        .collect(Collectors.toMap(bankAccount -> bankAccount.getOwner().getFirstName()+" "+bankAccount.getOwner().getLastName(), BankAccount::getBalance));


        System.out.println("-".repeat(40)+"Task 1"+"-".repeat(40));
        System.out.println(newList);
        System.out.println("-".repeat(40)+"Task 2"+"-".repeat(40));
        System.out.println(newSet);
        System.out.println("-".repeat(40)+"Task 3"+"-".repeat(40));
        System.out.println(sortedList);
        System.out.println("-".repeat(40)+"Task 4"+"-".repeat(40));
        System.out.println(newMap);
    }
}