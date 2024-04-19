import java.util.Objects;

public class Account {

    private final Person client;
    private final String IBAN;
    private double balance;

    public Account(Person client, String IBAN, double balance) {
        this.client = client;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "client=" + client +
                ", IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Person getClient() {
        return client;
    }

    public String getIBAN() {
        return IBAN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (!Objects.equals(client, account.client)) return false;
        return Objects.equals(IBAN, account.IBAN);
    }

    @Override
    public int hashCode() {
        int result = client != null ? client.hashCode() : 0;
        result = 31 * result + (IBAN != null ? IBAN.hashCode() : 0);
        return result;
    }
}
