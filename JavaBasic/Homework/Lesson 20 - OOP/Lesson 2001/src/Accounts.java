public class Accounts {
    Account[] allAccounts;          //вызов массива Account и его наименование

    public Accounts(Account[] allAccounts) {        //конструктор

        this.allAccounts = allAccounts;
    }

    public String toString() {                      //toString
        String result = "";
        for (Account account : allAccounts) {
            result = result + account + "\n";
        }
        return result;
    }

    public void checkLowBalance(double threshold) {                 //метод, который выводит на экран все счета, с балансом меньше заданного числа
        for (Account account : allAccounts) {                       //перебор идентичный методу toString
            if(account.balance < threshold){                       //условие, если баланс меньше заданного числа
                System.out.println("Account number with low balance: " + account.iban + ", \n Balance: " + account.balance);       //вывод
            }
        }
    }
    public double getSumOfAllAccount () {                       //метод, который считает сумму всех остатков, на всех счетах банка
        double amount = 0;                                      //создаю переменную, куда буду складывать баланс каждого счёта
        for (Account account : allAccounts) {                   //перебор идентичный методу toString
            amount = amount + account.balance;              //суммируем со следующим результатом
        }
        return amount;
    }

}