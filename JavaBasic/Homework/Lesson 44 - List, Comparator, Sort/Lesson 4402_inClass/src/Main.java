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

        List<Person> list = new ArrayList<>(List.of(   //если написать только List.of, система создаст список, который никак нельзя изменить. Поэтому нужно добавить перед List.of new ArrayList.
                new Person("Jack", 10),
                new Person("John", 15),
                new Person("Ana", 17),
                new Person("Olya", 15),
                new Person("Lilu", 21),
                new Person("Mia", 23),
                new Person("Oleg", 29),
                new Person("Kakashi", 28)));

        System.out.println(list);

        remove(list, Person.getPredicateByAge(10, 25));
        remove(list, Person.getPredicateByNameSubstring("a").negate());   //negate вернёт обратное значение стандартного условия в Predicate
        System.out.println(list);

        System.out.println("-".repeat(20) + " Task 4 " + "-".repeat(20));
        List<String> listStr = List.of(
                "Jack, 19",
                "Nick, 20",
                "Lena, 19",
                "Sten, 16");

        System.out.println(listStr);
        System.out.println(createList(listStr));
    }
    public static void remove(List<Person> list, Predicate<Person> predicate){
        list.removeIf(predicate);
    }
    public static List<Person> createList(List<String> listStr){
        List<Person> result = new ArrayList<>();
        for(String str: listStr){
            result.add(new Person(str));
        }
        return result;
    }
}
