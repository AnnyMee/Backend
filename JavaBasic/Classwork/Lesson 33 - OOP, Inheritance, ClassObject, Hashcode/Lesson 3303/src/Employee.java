public abstract class Employee extends Person{

    public void print(){
        System.out.println("Employee");
    }

    @Override
    public String toString() {
        return "Employee{}";
    }
}
