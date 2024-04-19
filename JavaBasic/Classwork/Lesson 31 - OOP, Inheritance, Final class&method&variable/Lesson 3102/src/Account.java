public class Account {
    private final Person owner;
    private final String iban;
    private double balance;

    public Account(Person owner, String iban) {
        this.owner = owner;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdrawal(double amount){
        if(amount>=balance){
            balance-= amount;
            return true;
        }else{
            return false;
        }
    }
}
