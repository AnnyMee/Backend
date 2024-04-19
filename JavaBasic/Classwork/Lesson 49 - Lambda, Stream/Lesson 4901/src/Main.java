import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("q1","q2","qw3","qwe4","qqwer","asdf");
        Map<String, Integer> res = list.stream()

                    //s - элемент, который отправляется в параметры -> что делать с этим элементом s
                .filter(s->s.length()>3)                        //фильтрует стрим  -- где s это параметр, который передаётся в метод класса Predicate
                .map(s -> "(" + s.toUpperCase() + ")")          //преобразовать стрим
                .sorted((o1, o2) -> o1.length()-o2.length())    //отсортировать стрим
                .limit(3)                               //ограничить количество элементов

                //.collect(Collectors.toList());   //можно просто после точки написать toList
                .collect(Collectors.toMap(s -> s,s->s.length()));
        System.out.println(res);
    }
}