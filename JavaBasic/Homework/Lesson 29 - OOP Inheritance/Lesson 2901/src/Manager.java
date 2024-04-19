public class Manager extends Employee{

    private int bonus;
    public Manager(String name, int salary, int bonus) {

        super(name, salary);
        this.bonus = bonus;

    }

    @Override
    public String toString() {

        return "\nManager: " + getName() + " (" + getSalary() + " + " + bonus + ") ";

    }
    public int getBonus(){

        return bonus;

    }
    public void paySalary(){

        System.out.println("    " + getName() + " gets " + (getSalary()+bonus) + " Euro ");

    }
    public void work(){

        System.out.println(getName() + ": I am a Manager. I manage team member's work.");

    }
}
