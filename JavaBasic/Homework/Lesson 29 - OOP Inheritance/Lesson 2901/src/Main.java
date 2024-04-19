/*
1.
В коде классной работы (проект Employee) реализовать класс SupportEngineer, сделать его наследником Employee.
Реализовать в нем метод work()
В коде классной работы (проект Employee) реализовать класс Manager, сделать его наследником Employee.
Реализовать в нем метод work(). Добавить в класс Manager поле bonus.
Реализовать метод paySalary таким образом, что бы Manager получал зарплату + bonus
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Programmer p1 = new Programmer("Jack",4000);
        Programmer p2 = new Programmer("Lena",5000);
        QAEngineer q1 = new QAEngineer("John", 5500);
        QAEngineer q2 = new QAEngineer("Ira", 4500);
        SupportEngineer se1 = new SupportEngineer("Michael", 3500);
        SupportEngineer se2 = new SupportEngineer("Marta", 3000);
        Manager m1 = new Manager("Ivan", 5500,1500);
        Manager m2 = new Manager("Maria", 6000, 2000);


        Employee[] employees = {p1,p2,q1,q2,se1,se2,m1,m2};
        System.out.println(Arrays.toString(employees));
        System.out.println("*".repeat(150));

        for (Employee employee : employees){
            System.out.println(employee);
            employee.paySalary();
            employee.work();
        }
    }
}