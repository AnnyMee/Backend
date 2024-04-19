import java.util.*;
/*
1. Дан List<Person>. Каждый Person имеет имя и возраст.
Написать метод, который сформирует Map<Person, String>, где ключ это Person, значение Имя

2. Дан List<Person>. Каждый Person имеет имя и возраст.
Реализовать несколько Comparator<Person> : по имени (по алфавиту), по длине имени, по возрасту.
Каждый компаратор реализовать используя анонимный класс и используя лямбда-выражение. Проверить, вызывая метод sort

3. Дан List<Person>. Каждый Person имеет имя и возраст.
Написать метод, который сформирует Map<Integer, List<Person> >, где ключ это возраст, значение список людей этого возраста

 */
public class Main {
    public static void main(String[] args) {
        List<Person> peopleList = List.of(new Person("Jack", 22),
                new Person("John", 25),
                new Person("Ann", 22),
                new Person("Lena", 26));

        System.out.println(createMap1(peopleList));
        System.out.println("-".repeat(100));

        //==============================================END TASK 1==============================================

        List<Person> peopleArrayList = new ArrayList<>();
                peopleArrayList.add(new Person("Mark", 22));
                peopleArrayList.add(new Person("Allen", 28));
                peopleArrayList.add(new Person("Mila", 25));
                peopleArrayList.add(new Person("Kaddy", 22));
                peopleArrayList.add(new Person("Illy", 28));
                peopleArrayList.add(new Person("Nina", 28));

        //-------------анонимным классом--------------

        Comparator<Person> byName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Comparator<Person> byNameLength = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().length()-o2.getName().length();
            }
        };
        Comparator<Person> byAge = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()- o2.getAge();
            }
        };

        peopleArrayList.sort(byName);
        System.out.println("Anonymous Class by name alphabetical order: "+peopleArrayList);

        peopleArrayList.sort(byNameLength);
        System.out.println("Anonymous Class by name length: "+peopleArrayList);

        peopleArrayList.sort(byAge);
        System.out.println("Anonymous Class by age: "+peopleArrayList);
        System.out.println("-".repeat(100));

        //---------------лямбда--------------------

        peopleArrayList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("Lambda by name alphabetical order: "+peopleArrayList);
        peopleArrayList.sort((o1, o2) -> o1.getName().length()-o2.getName().length());
        System.out.println("Lambda by name length: "+peopleArrayList);
        peopleArrayList.sort((o1, o2) -> o1.getAge()- o2.getAge());
        System.out.println("Lambda by age: "+peopleArrayList);
        System.out.println("-".repeat(100));

        //==============================================END TASK 2==============================================

        System.out.println(listToMap(peopleArrayList));

    }
    public static Map<Person,String> createMap1(List<Person> list){
        Map<Person,String> people = new HashMap<>();

        for(Person p : list){
            people.put(p,p.getName());
        }
        return people;
    }
    public static Map<Integer,List<Person>> listToMap(List<Person> list){
        Map<Integer,List<Person>> map = new HashMap<>();
        if(list!=null){
            for(Person p:list){
                int key=p.getAge();
                List<Person> value = map.getOrDefault(key,new ArrayList<>());
                value.add(p);
                map.put(key,value);
            }
        }
        return map;
    }
    public static Map<Integer,List<Person>> listToMap2(List<Person> list){
        Map<Integer,List<Person>> map = new HashMap<>();
        if(list!=null && !list.isEmpty()){
            for(Person p:list){
                int key=p.getAge();
                List<Person> value = map.getOrDefault(key,new ArrayList<>());
                value.add(p);
                map.put(key,value);
            }
        }
        return map;
    }
}