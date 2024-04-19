public class Accounts {                                         //в рамках ДЗ в этом классе был создан геттер для переменной-массива Accounts[]
    private Account[] allAccounts;                                                  //вызов массива Account и его наименование

    private boolean isSecure;                                                       //создаю переменную boolean для использования для переключателя secure

    public Accounts(Account[] allAccounts) {
        this.allAccounts = allAccounts;
        isSecure = false;
    }
    public void setSecure(boolean secure) {
        isSecure = secure;
    }
    public Account[] getAllAccounts(){
        return allAccounts;
    }
    public String toSecureModeSwitcher(Account acc){                        //по сути переключатель для secure (true) и не secure (false)
        return isSecure ? acc.toSecureModeString() : acc.toString();        //true - счёт со звездочками : false - счёт без звездочек
    }
    public String toString(){
        String result = "";
        for (Account account : allAccounts) {
            result = result + toSecureModeSwitcher(account) + "\n";         //внести метод toSecureModeSwitcher нужно тут
        }
        return result;
    }
    public void checkLowBalance(double threshold){
        for (Account account : allAccounts){
            if(account.getBalance() < threshold){                               //внести метод toSecureModeSwitcher нужно тут
                System.out.println("Account number with low balance: " + toSecureModeSwitcher(account) + ", \n Balance: " + account.getBalance());
            }
        }
    }
    public double getSumOfAllAccount (){
        double amount = 0;
        for (Account account : allAccounts){
            amount = amount + account.getBalance();
        }
        return amount;
    }
}
