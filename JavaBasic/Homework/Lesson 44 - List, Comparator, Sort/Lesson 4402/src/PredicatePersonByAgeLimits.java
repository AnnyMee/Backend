import java.util.function.Predicate;

public class PredicatePersonByAgeLimits implements Predicate<Person> {
    private int ageMin;
    private int ageMax;

    public PredicatePersonByAgeLimits(int ageMin, int ageMax) {
        this.ageMin = ageMin;
        this.ageMax = ageMax;
    }

    @Override
    public boolean test(Person person) {
        return person.getAge()<ageMin || person.getAge()>ageMax;
    }
}
