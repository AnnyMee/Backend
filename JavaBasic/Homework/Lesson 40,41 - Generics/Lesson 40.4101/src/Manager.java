public class Manager extends Employee{

    public Manager(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Manager " + getName();
    }
}
