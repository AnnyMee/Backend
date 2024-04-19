import java.util.List;
import java.util.Objects;

public class Programmer {
    private String name;
    private List<Task> tasks;
    private  String city;

    public Programmer(String name, List<Task> tasks, String city) {
        this.name = name;
        this.tasks = tasks;
        this.city = city;
    }

    @Override
    public String toString() {
        return name + "\n Tasks (" + tasks +
                ") ";
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
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
        if (!Objects.equals(tasks, that.tasks)) return false;
        return Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (tasks != null ? tasks.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
