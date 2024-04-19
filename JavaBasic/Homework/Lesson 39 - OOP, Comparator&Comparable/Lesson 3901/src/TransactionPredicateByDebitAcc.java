public class TransactionPredicateByDebitAcc implements TransactionPredicate{

    private String iban;

    public TransactionPredicateByDebitAcc(String debitIban){
        this.iban = debitIban;
    }
    public boolean test(Transaction transaction){
        return transaction.getAccDebit().getIban().equals(iban);
    }
}
