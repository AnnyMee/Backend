import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new TreeMap<>();        //TreeMap выводит Map сразу отсортировано по ключам
        map1.put(10,"a");
        map1.put(-20,"b");
        map1.put(-67,"b");
        map1.put(5,"c");
        map1.put(11,"d");

        System.out.println(map1);

        System.out.println("-".repeat(100));

        Person p1 = new Person("Jack", 32);
        Person p2 = new Person("Lena",27);

        Map<Person, String> map2 = new TreeMap<>();   //((o1, o2) -> o1.getAge()- o2.getAge());
                                                      //В данной ситуации TreeMap не будет работать без Comparable в Person. Или же при создании TreeMap необходимо создать Comparator (через lambda)
                                                      //Тут HashCode и Equals не помогут. Только Comparable c методом compareTo
        map2.put(p1,"Jack");
        map2.put(p2,"Lena");
        System.out.println(map2);

        System.out.println("-".repeat(100));

        TreeSet<Person> set = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));

        Set<Map.Entry<Integer,String>> entries = map1.entrySet();  //возвращает Set из Entry
        for(Map.Entry<Integer,String> entry : entries) {            //Entry - это специальный объект, который хранит сразу Key и Value
            System.out.println("key: "+ entry.getKey() + ", value = " + entry.getValue());
            if(entry.getKey()>10){
                entry.setValue("aaa");
            }
        }
        System.out.println(map1);
    }
}
/*
для структуры HashMap необходимы hashCode и equals
для структуры TreeMap необходимы Comparable и/или comparator
 */