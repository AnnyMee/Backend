public class Box2 <T>{

    private T value;

    private int intValue;


    public Box2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box2{" +
                "value=" + value + " (" + value.getClass().getSimpleName() + ")" +
                '+';
    }
}
