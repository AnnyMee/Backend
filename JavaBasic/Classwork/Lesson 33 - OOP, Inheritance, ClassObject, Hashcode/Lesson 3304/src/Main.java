public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Jack",20, 10);
        Person p2 = new Person("Oleg",20, 10);
        Person p3 = p1;

        //equals это метод, который позволяет определить равенство объектов между собой

        System.out.println("== "+ (p1==p2));
        System.out.println("equals "+(p1.equals(p2)));
        System.out.println("-".repeat(20));
        System.out.println("== "+ (p1==p3));
        System.out.println("equals "+(p1.equals(p3)));
    }
}