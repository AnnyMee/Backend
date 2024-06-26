import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        intList.add(10);
        intList.add(1);
        intList.add(0);
        intList.add(5);

        Collections.sort(intList);

        System.out.println(intList);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jack", 28));
        people.add(new Person("John", 16));
        people.add(new Person("Ann", 20));
        people.add(new Person("Lena", 28));

        //Collections.sort(people); - не сработает, ведь переменную Person невозможно сравнить как переменную int/Integer

        Collections.sort(people, new ComparatorPersonByAge());
        System.out.println(people);



    }
}