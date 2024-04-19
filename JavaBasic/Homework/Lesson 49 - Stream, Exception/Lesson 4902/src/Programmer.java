import java.util.Objects;

public class Programmer {
    private String name;
    private String city;

    public Programmer(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return name + " (" + city + ") ";
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Programmer that = (Programmer) o;

        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
