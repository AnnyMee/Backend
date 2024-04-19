public class TransactionPredicateByCreditAcc implements TransactionPredicate {

    private String iban;

    public TransactionPredicateByCreditAcc(String creditIban) {
        this.iban = creditIban;
    }

    public boolean test(Transaction transaction) {
        return transaction.getAccCredit().getIban().equals(iban);
    }
}
