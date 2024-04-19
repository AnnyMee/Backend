import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Stream.of("qwe1","qwe2","qwe3","qwe4").forEach(s-> System.out.println(s));

        System.out.println("============ 2: toList()");
        System.out.println(Stream.of("qwe1", "qwe2", "qwe3", "qwe4").collect(Collectors.toList()));

        System.out.println("============ 3: toSet()");
        System.out.println(Stream.of("qwe1", "qwe2", "qwe3", "qwe4").collect(Collectors.toSet()));

        System.out.println("============ 4: toCollection()");
        LinkedList<String> value1 = Stream.of("qwe1", "qwe2", "qwe3", "qwe4").collect(Collectors.toCollection(() -> new LinkedList<>()));

        System.out.println(value1);

        System.out.println("============ 5: toCollection(new TreeSet)");
        TreeSet<String> value2 = Stream.of("qwe1rr", "qwe2k", "qwe3lkhl;ksda", "qwe4jjd")
                .collect(Collectors.toCollection(() -> new TreeSet<>((s1,s2)->s1.length()-s2.length())));

        System.out.println(value2.headSet("qwe3k2"));

        System.out.println("============ 6: joining()"); //joining позволяет склеивать все элементы в одну строку
        String value3 = Stream.of("qwe1", "qwe2", "qwe3", "qwe4").collect(Collectors.joining());
        String value3a = Stream.of("qwe1", "qwe2", "qwe3", "qwe4").collect(Collectors.joining("-"));  //можно задать так же делимитер
        String value3b = Stream.of("qwe1", "qwe2", "qwe3", "qwe4").collect(Collectors.joining("-","[start: "," :end]"));  //можно создать делимитер, префикс и суффикс

        System.out.println(value3);
        System.out.println(value3a);
        System.out.println(value3b);

        System.out.println("============ 7: joining()+collectingAndThen()"); //collectingAndThen позволяет работать с полученной коллекцией уже после того, как отработал collect()
        int value4 = Stream.of("qwe1", "qwe2", "qwe3", "qwe4").collect(Collectors.collectingAndThen(Collectors.joining(), s->s.length()));
        System.out.println(value4);

        System.out.println("============ 8: collectingAndThen()+tailSet()"); //tailSet возвращает все элементы после заданного (хвост)
        SortedSet<String> value5 = Stream.of("qwe1", "qwe2", "qwe3", "qwe4").collect(Collectors.collectingAndThen(
                Collectors.toCollection(() -> new TreeSet<>()),
                tSet -> tSet.tailSet("qwe2")));
        System.out.println(value5);

        System.out.println("============ 9: toMap()");
        Map<String, Integer> map1 = Stream.of("aa", "bbb", "cccccc", "ddd").collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(map1);

        System.out.println("============ 10: toMap() + how to change the value of an already preset key");
        //Map<String, Integer> map2 = Stream.of("aa", "bbb", "cccccc", "ddd","aa").collect(Collectors.toMap(s -> s, s -> s.length())); //не прокатит. в данном случае обновления value не происходит, как обычно в Map
        Map<String, Integer> map2 = Stream.of("aa", "bbb", "cccccc", "ddd","aa").collect(Collectors.toMap(s -> s, s -> s.length(), (i1,i2)->i1+i2)); //для обхождения этой ошибки, нужно дополнить третьим параметром (Binary operator)
        System.out.println(map2);

        System.out.println("============ 11: groupingBy()"); //groupingBy позволяет обозначить Key для каждого элемента в строке, а сами элементы строки будут values
        Map<Integer, List<String>> map3 = Stream.of("aa", "bbb", "сс", "ddd", "uuuui").collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(map3);

        System.out.println("============ 12: partitioningBy()"); //partitioningBy() возвращает boolean по условию, которое мы запишем как Predicate. Более того, этот метод разделит злементы на 2 часть(true, false)
        Map<Boolean, List<String>> map4 = Stream.of("aa", "bbb", "cccccc", "ddd").collect(Collectors.partitioningBy(s -> s.length() > 2));
        System.out.println(map4);

    }
}
