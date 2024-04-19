public class Box3<T>{

    int intValue;
    private T value1;
    private T value2;

    public Box3(int intValue,T value1, T value2){
        this.intValue = intValue;
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    @Override
    public String toString() {
        return "Box3{" +
                "value1=" + value1 + " (" + value1.getClass().getSimpleName() + ")" +
                " value2=" + value2 + " (" + value2.getClass().getSimpleName() + ")" +
                '+';
    }
}
