public class Programmer extends Employee{

    public Programmer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Programmer " + getName();
    }
}
