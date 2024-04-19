//abstract - закрывает возможность создать неопределённого Employee, говоря нам, что можно задавать объект только для дочерних классов
public abstract class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {  //не смотря на то, что данный класс абстрактный, в нём всё ещё может быть конструктор, ведь он нужен при создании дочерних классов
        this.name = name;
        this.salary = salary;
    }
    public void paySalary(){
        System.out.println("    " + name + " gets " + salary + " Euro ");
    }
    //тут abstract будет иметь тот же смысл (нужно убрать фигурные скобки для правильной работы)
    public abstract void work();               //STEP 6: создаём такой void, благодаря которому, сможем выводить work в Main
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
}