public class Programmer extends Employee {
    public Programmer(String name, int salary) {

        super(name, salary);

    }

    @Override
    public String toString() {

        return "\nProgrammer: " + getName() + " (" + getSalary() +") ";

    }
    public void work(){

        System.out.println(getName() + ": I am a Programmer. I write code.");
    }
}
