import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Programmer p1 = new Programmer("Jack",4000);
        Programmer p2 = new Programmer("Lena",5000);
        QAEngineer q1 = new QAEngineer("John", 5500);
        QAEngineer q2 = new QAEngineer("Ira", 4500);
        /*
        Programmer[] programmerArray = {p1,p2};
        QAEngineer[] qaEngineerArray = {q1,q2};

        for (Programmer programmer : programmerArray){
            programmer.work();
            programmer.paySalary();
        }
        for (QAEngineer qaEngineer : qaEngineerArray){
            qaEngineer.work();
            qaEngineer.paySalary();
        }
         */

        SupportEngineer se1 = new SupportEngineer("Michael", 3500);
        SupportEngineer se2 = new SupportEngineer("Marta", 3000);
        Manager m1 = new Manager("Ivan", 5500,1500);
        Manager m2 = new Manager("Maria", 6000, 2000);
        //Employee e1 = new Employee("Kaya", 7000); //-> выдаёт ошибку после того, как мы к классу Employee добавили слово abstract

        Employee[] employees = {p1,p2,q1,q2,se1,se2,m1,m2};
        System.out.println(Arrays.toString(employees));             //вывод массива происходит через Array.toString
        System.out.println("*".repeat(150));

        for (Employee employee : employees){
            System.out.println(employee);
            employee.paySalary();                                  //вывод salary для каждого employee. метод paySalary одинаковый для обоих типов employee
            employee.work();                                       //простой вывод work для каждого employee не сработает. метод work разный у обоих типов employee
        }                                                          //todo для этого мы создали МЕТОД public void work(){}; в классе Employee,
        //который собирает данные work из классов Programmer и QAEngineer, передаёт их в Employee, а оттуда в Main
    }
}