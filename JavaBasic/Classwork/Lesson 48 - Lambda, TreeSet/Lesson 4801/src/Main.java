import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jack", 32);
        Person p2 = new Person("Lena",27);

        Map<Person, String> map = new HashMap<>();
        map.put(p1,"Jack");
        map.put(p2,"Lena");

        p1.setAge(33);
        System.out.println(map);
        System.out.println(p1 + "present in Map: " + map.containsKey(p1));


    }
}