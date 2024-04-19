public class Main {
    public static void main(String[] args) {

        Student.count();

        Student p1 = new Student("Jack", new MyDate(20,2,2000));
        Student p2 = new Student("John", new MyDate(3,4,2002));

        System.out.println(Student.GROUP);  //обращение к классу (к группе всех объектов)
        System.out.println(p1.GROUP);       //обращение к одному объекту, но по факту, тут тоже обращение ко всей группе
        p1.GROUP = "33";                    //к примеру, поменяв название группы через первого объекта
        System.out.println(p2.GROUP);       //имя группы поменяется и у второго объекта

        Student.count();

        System.out.println("-".repeat(40));

        Student p3 = new Student("Jack1", new MyDate(20,2,2000));
        Student p4 = new Student("John1", new MyDate(3,4,2002));

        Student.count();

        System.out.println("-".repeat(70));

        System.out.println(p1);
        System.out.println(p4);

        Group group = Group.instance;

        Group2 g1 = Group2.getInstance("33");
        System.out.println(g1);

        Group2 g2 = Group2.getInstance("34");
        System.out.println(g2);


    }
}