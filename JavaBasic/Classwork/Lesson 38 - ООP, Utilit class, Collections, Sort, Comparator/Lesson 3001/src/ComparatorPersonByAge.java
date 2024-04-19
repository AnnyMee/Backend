import java.util.Comparator;

public class ComparatorPersonByAge implements Comparator<Person> {
    /*
    если результат положительный -> o1 больше о2
    если результат 0 -> o1 равен о2
    если результат отрицательный -> o1 меньше о2
     */

    @Override
    public int compare(Person o1, Person o2){
        if(o1.getAge()<o2.getAge()) return 100000;
        if(o1.getAge()>o2.getAge()) return -100000;

        return o1.getAge()- o2.getAge();
    }
}
