import java.util.Iterator;

public class Temp implements Iterable<Integer>{

    private int counter;

    private int value;

    public Temp(int counter, int value) {
        this.counter = counter;
        this.value = value;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteratorTemp();
    }
    class IteratorTemp implements Iterator<Integer>{

        int innerCounter = counter;

        @Override
        public boolean hasNext() {
            return innerCounter>=0;
        }

        @Override
        public Integer next() {
            return value;
        }
    }
}
