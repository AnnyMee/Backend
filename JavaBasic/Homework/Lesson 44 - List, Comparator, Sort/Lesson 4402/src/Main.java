import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
2. Дан List<Person>. Ваша задача, написать метод, который удаляет из листа всех Person:
- заданного возраста;
- возраста, который больше максимально допустимого и меньше минимально допустимого
(например, заданы границы от 4 до 8, то все чей возраст меньше 4 и больше 8 удаляются из списка)
- с именами, не содержащими заданную подстроку, без учета регистра. Например,
если задана подстрока “ол” в списке должны остаться “Оля”, “Коля”, “Николай” а, например, “Сергей” должен быть удален.

Подсказка: вы можете использовать метод removeIf, просто реализуя разные Predicate<Person>

4. Дан список строк вида “John,18” т.е. имя, возраст. Необходимо получить список Person.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(List.of(
                new Person("Jack", 10),
                new Person("John", 15),
                new Person("Ana", 17),
                new Person("Olya", 15),
                new Person("Lilu", 21),
                new Person("Mia", 23),
                new Person("Oleg", 29),
                new Person("Kakashi", 28)));

        System.out.println(list);

        delete(list, new PredicatePersonByAge(15));
        System.out.println(list);

        delete(list, new PredicatePersonByAgeLimits(17,28));
        System.out.println(list);

        delete(list, new PredicatePersonByName("ol"));
        System.out.println(list);

        System.out.println("-".repeat(40) + "Task 4" + "-".repeat(40));

        List<String> listStr = List.of(
                "Lina, 23",
                "Mike, 20",
                "Dorian, 25",
                "Miriam, 28");

        System.out.println(createPerson(listStr));
    }
    public static void delete(List<Person> list, Predicate<Person> condition){

        list.removeIf(condition);
    }
    public static List<Person> createPerson(List<String> list){
        List<Person> listOfPeople = new ArrayList<>();

        for(String el:list){
            String[] split = el.split(", ");
            listOfPeople.add(new Person(split[0],Integer.valueOf(split[1])));
        }
        return listOfPeople;
    }
}