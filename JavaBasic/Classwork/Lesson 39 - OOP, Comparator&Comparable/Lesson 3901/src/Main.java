import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<Integer> list = List.of(1,4,6,7,2,6,0,-1);     //создаётся константный список. добавить туда или удалить оттуда элемент обычным способом нельзя
        //для того, чтобы обойти это ограничение, пишем это так:
        List<Integer> list = new ArrayList<>(List.of(1,4,6,7,2,6,0,-1));
        System.out.println(list);
        list.add(1);
        System.out.println(list);

        //List<String> listStr = Arrays.asList("szd","sdg","dfgfg","dfgf");  //ситуация та же, как и в строчке 8. Обход этого ограничения такой же
        List<String> listStr = new ArrayList<>(Arrays.asList("sdg","dfgfg","dfgf"));
        System.out.println(listStr);
        listStr.add("rg");
        System.out.println(listStr);

        Collections.sort(list);         //сортировка будет работать даже если мы сами не создали класс для сортировки. Это всё благодаря классу Comparable, который прикручен в Collections
        System.out.println(list);

        Collections.sort(listStr);
        System.out.println(listStr);

        ArrayList<Person> people = new ArrayList<>(List.of(
                new Person("Jack",10,178.5),
                new Person("Jack",20,165.3),
                new Person("Pavel", 16,185.4),
                new Person("Svetlana",21,165.8)
        ));

        Collections.sort(people, new ComparatorPersonByHeight());
        System.out.println(people);
    }
}