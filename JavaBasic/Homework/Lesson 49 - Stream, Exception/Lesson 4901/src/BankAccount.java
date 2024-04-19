import java.util.Objects;

public class BankAccount {
    private Person owner;
    private String IBAN;
    private double balance;

    public BankAccount(Person owner, String IBAN, double balance) {
        this.owner = owner;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return owner + "\n    IBAN: " + IBAN + " (" + balance + ") ";
    }

    public Person getOwner() {
        return owner;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankAccount that = (BankAccount) o;

        if (Double.compare(balance, that.balance) != 0) return false;
        if (!Objects.equals(owner, that.owner)) return false;
        return Objects.equals(IBAN, that.IBAN);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = owner != null ? owner.hashCode() : 0;
        result = 31 * result + (IBAN != null ? IBAN.hashCode() : 0);
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    public String secureIban(){
        return IBAN.substring(0,4) + "****" + IBAN.substring(IBAN.length()-2);
    }
}
