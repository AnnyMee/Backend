public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public void paySalary(){
        System.out.println("    " + name + " gets " + salary + " Euro ");
    }
    public void work(){};               //STEP 6: создаём такой void, благодаря которому, сможем выводить work в Main
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
}

