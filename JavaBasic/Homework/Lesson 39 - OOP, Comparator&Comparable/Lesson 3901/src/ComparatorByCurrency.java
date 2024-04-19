import java.util.Comparator;

public class ComparatorByCurrency implements Comparator<Transaction> {
    @Override
    public int compare(Transaction o1, Transaction o2) {

        return o1.getCurrencyCode().compareTo(o2.getCurrencyCode());
    }
}
