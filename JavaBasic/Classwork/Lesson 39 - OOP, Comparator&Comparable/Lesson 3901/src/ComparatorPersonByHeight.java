import java.util.Comparator;

public class ComparatorPersonByHeight implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        //return (int)(o1.getHeight()-o2.getHeight());    // --> сравнение double - лучше так не делать.. результат не всегда правдивый
        //правильно будет так:
        if(o1.getHeight()> o2.getHeight()){
            return 1;
        }
        if(o1.getHeight()<o2.getHeight()){
            return -1;
        }
        return 0;
    }
}
