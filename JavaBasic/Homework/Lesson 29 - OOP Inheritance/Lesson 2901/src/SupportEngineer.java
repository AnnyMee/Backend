public class SupportEngineer extends Employee{
    public SupportEngineer(String name, int salary) {

        super(name, salary);

    }

    @Override
    public String toString() {

        return "\nSupport Engineer: " + getName() + " (" + getSalary() +") ";

    }
    public void work(){

        System.out.println(getName() + ": I am a Support Engineer. I support the community.");

    }
}
