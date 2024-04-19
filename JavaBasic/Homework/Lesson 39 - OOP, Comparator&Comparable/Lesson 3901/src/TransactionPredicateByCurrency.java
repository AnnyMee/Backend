public class TransactionPredicateByCurrency implements TransactionPredicate{

    private CurrencyCode currency;

    public TransactionPredicateByCurrency(CurrencyCode currency){
        this.currency = currency;
    }
    public boolean test(Transaction transaction){
        return transaction.getCurrencyCode().equals(currency);
    }
}
