import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
1. Дан лист Person. Необходимо определить, есть ли в данном листе повторяющиеся объекты.

3. Дано два списка с Person необходимо получить Set с персонами которые присутствуют и в том и в другом списке

4. * [по желанию] Дан список пользователей. Необходимо написать метод, который вернет Set из пользователей, которые в данном списке встречаются более одного раза

 */
public class Main {
    public static void main(String[] args) {

        List<Person> people1 = new ArrayList<>();
        people1.add(new Person("Maya", 15));
        people1.add(new Person("Nick", 19));
        people1.add(new Person("Alice", 21));
        people1.add(new Person("Rick", 25));
        people1.add(new Person("Maya", 15));


        System.out.println(hasDuplicate(people1));
        System.out.println("-".repeat(20) + "Task 3" + "-".repeat(20));

        List<Person> people2 = new ArrayList<>();
        people2.add(new Person("Rick", 25));
        people2.add(new Person("Alina", 22));
        people2.add(new Person("Micky", 28));
        people2.add(new Person("Gaya", 19));
        people2.add(new Person("Maya", 15));

        Set<Person> setOfDuplicate = showDuplicate(people1,people2);
        System.out.println(setOfDuplicate);
        System.out.println("-".repeat(20) + "Task 4" + "-".repeat(20));
        System.out.println(getDuplicate(people1));

    }
    public static boolean hasDuplicate(List<Person> people){
        Set<Person> set = new HashSet<>(people);
        if(people.size() == set.size()){
            return false;
        }
        return true;
    }
    public static Set<Person> showDuplicate(List<Person> list1, List<Person> list2){
        Set<Person> set = new HashSet<>(list1);
        set.retainAll(list2);    //метод retainAll оставит в изначальном списке (set1) только те объекты, которые присутствуют и в list(set)1 и в list(set)2
        return set;
    }
    public static Set<Person> getDuplicate(List<Person> list){
        Set<Person> set = new HashSet<>();
        Set<Person> setResult = new HashSet<>();

        for(Person p : list){
            if(!set.add(p)){
                setResult.add(p);
            }
        }
        return setResult;
    }
}