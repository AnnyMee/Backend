import java.util.ArrayList;
import java.util.List;

/*
1. Есть два списка одинаковой длины с числами. Написать функцию, которая
вернет список с элементами True или False, где значение на i-том месте зависит от того, равны ли элементы двух списков под номером i.
Например, {1, 2, 3, 4} и {5, 2, 3, 8} вернет {False, True, True, False}
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(List.of(5, 2, 3, 8));

        System.out.println(list1 + "\n" + list1 + "\n" + comparePresence(list1, list2));
    }

    public static List<Boolean> comparePresence(List<Integer> list1, List<Integer> list2){
        List<Boolean> result = new ArrayList<>();

        for(int i=0; i<list1.size(); i++){
            result.add(list1.get(i).equals(list2.get(i)));
        }
        return result;
    }
}