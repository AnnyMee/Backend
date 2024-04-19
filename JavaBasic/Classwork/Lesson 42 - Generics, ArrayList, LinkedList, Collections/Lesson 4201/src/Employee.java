public abstract class Employee {

private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee name " + name;
    }

    public String getName() {
        return name;
    }
}
