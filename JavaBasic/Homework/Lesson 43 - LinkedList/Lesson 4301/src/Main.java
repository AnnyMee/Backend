import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
1. Реализовать метод, который добавляет в List<Integer>  1000000 случайных целых чисел.
2. Реализовать метод, который добавляет в List<Integer>  1000000 случайных целых чисел,
но каждое следующее значение должно добавляться в случайную позицию листа.
3. Дан лист <Person>. Необходимо написать метод, который возвращает List<String>
который содержит имена всех пользователей старше 20 лет
4. Дан List<Person>. Необходимо написать метод, который вернет, сколько раз заданный Person встречается в данном листе.

*Для желающих: В MyLinedList реализовать метод добавления в заданную позицию.
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> listOfRandomNumbers = generateRandomList(1000000);
        //System.out.println(listOfRandomNumbers);

        List<Integer> list = new LinkedList<>();

        long start = System.currentTimeMillis();
        ListCreator.fillIntegerList(list,true);
        long finish = System.currentTimeMillis();

        System.out.println("-".repeat(50));
        for(int i=0; i<20; i++){
            System.out.print(list.get(i) + "   ");
        }
        System.out.println("  .........");
        System.out.println("Time: " + (finish-start));

        List<Person> people = new ArrayList<>();
        people.add(new Person("Yuki", 14));
        people.add(new Person("Kitsune", 13));
        people.add(new Person("Bester", 29));
        people.add(new Person("Usui", 35));

        System.out.println(people);
        System.out.println("-".repeat(50));
        System.out.println(getNameList(people, new PersonFilterByAge(10)));
        System.out.println(getNameList(people, new PersonFilterByName("Yuki")));

        System.out.println(people.get(1) + " was nominated " + checkDuplicatesAmount(people, people.get(1)) + " time(s) in the list");

    }

    public static List<Integer> generateRandomList(int count) {
        List<Integer> randomNumbers = new ArrayList<>();
        int min = -count;
        int max = count;

        for (int i = 0; i < count; i++) {
            randomNumbers.add(getRandomInteger(min, max));
        }
        return randomNumbers;
    }

    public static int getRandomInteger(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static List<String> getNameList(List<Person> people, PersonFilter filter) {
        List<String> listOfNames = new ArrayList<>(people.size());

        for (Person el : people) {
            if (filter.test(el))
                listOfNames.add(el.getName());
        }
        return listOfNames;
    }

    public static int checkDuplicatesAmount(List<Person> people, Person person) {
        int temp = 0;
        for (Person el : people) {
            if (el.getName().equals(person.getName())) {
                temp++;
            }
        }
        return temp;
    }
}

class PersonFilterByAge implements PersonFilter {

    private int ageLimit;

    public PersonFilterByAge(int age) {
        this.ageLimit = age;
    }

    @Override
    public boolean test(Person person) {
        return person.getAge() > ageLimit;
    }
}

class PersonFilterByName implements PersonFilter {

    private String name;

    public PersonFilterByName(String name) {
        this.name = name;
    }

    @Override
    public boolean test(Person person) {
        return person.getName().equals(name);
    }
}