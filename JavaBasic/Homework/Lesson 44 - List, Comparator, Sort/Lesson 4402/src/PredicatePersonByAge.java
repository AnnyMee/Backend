import java.util.function.Predicate;

public class PredicatePersonByAge implements Predicate<Person> {
    private int age;

    public PredicatePersonByAge(int age) {
        this.age = age;
    }

    @Override
    public boolean test(Person person) {
        return person.getAge()==age;
    }
}
