public class Transaction implements Comparable<Transaction> {
    public static int counter = 0;
    private int id;
    private Account accDebit;
    private Account accCredit;
    private double amount;
    private CurrencyCode currencyCode;

    public Transaction(Account accDebit, Account accCredit, double amount, CurrencyCode currency) {
        this.accDebit = accDebit;
        this.accCredit = accCredit;
        this.amount = amount;
        this.currencyCode = currency;
        counter++;
        id = counter;
    }

    @Override
    public String toString() {
        return "\nTransaction № " + id + "\n Sender: " + accDebit + "\n Receiver: " + accCredit + "\n Amount and currency: " + amount + " " + currencyCode;
    }
    public double getAmount() {
        return amount;
    }

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    @Override
    public int compareTo(Transaction o) {

        return o.id - this.id;
    }

    public Account getAccDebit() {
        return accDebit;
    }

    public Account getAccCredit() {
        return accCredit;
    }
}
