public enum EnumSingletonDemo {         //enum это класс, который имеет свои заданные объекты
    INSTANCE("Value one");

    private String value;

    EnumSingletonDemo(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EnumSingletonDemo{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
