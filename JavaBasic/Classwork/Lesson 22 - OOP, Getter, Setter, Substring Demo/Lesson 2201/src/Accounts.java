public class Accounts {
    Account[] allAccounts;          //вызов массива Account и его наименование
    boolean isSecure;               //вводим новую переменную boolean
    public Accounts(Account[] allAccounts) {        //конструктор

        this.allAccounts = allAccounts;
        isSecure = false;
    }
    public String accountToString(Account acc){             //создаём метод, который отвечает за безопасность
        return isSecure ? acc.toSafeModeString() : acc.toString();
    }
    public String toString() {                      //toString
        String result = "";
        for (Account account : allAccounts) {
            result = result + accountToString(account) + System.lineSeparator();
        }
        return result;
    }
    public void checkLowBalance(double threshold) {                 //метод, который выводит на экран все счета, с балансом меньше заданного числа
        for (Account account : allAccounts) {                       //перебор идентичный методу toString
            if(account.getBalance() < threshold){                       //условие, если баланс меньше заданного числа
                System.out.println("Account number with low balance: " + accountToString(account) + ", \n Balance: " + account.getBalance());       //вывод
            }
        }
    }
    public double getSumOfAllAccount () {                       //метод, который считает сумму всех остатков, на всех счетах банка
        double amount = 0;                                      //создаю переменную, куда буду складывать баланс каждого счёта
        for (Account account : allAccounts) {                   //перебор идентичный методу toString
            amount = amount + account.getBalance();              //суммируем со следующим результатом
        }
        return amount;
    }
}
