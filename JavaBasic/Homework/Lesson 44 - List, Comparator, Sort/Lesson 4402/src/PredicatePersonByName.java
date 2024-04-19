import java.util.function.Predicate;

public class PredicatePersonByName implements Predicate<Person> {
    private String name;

    public PredicatePersonByName(String name) {
        this.name = name;
    }

    @Override
    public boolean test(Person person) {
        return person.getName().toLowerCase().contains(name);
    }
}
