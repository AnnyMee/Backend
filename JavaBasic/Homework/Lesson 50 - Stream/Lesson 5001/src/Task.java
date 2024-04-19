import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Task {
    private int id;
    private String title;
    private int days;
    private Status status;

    public Task(int id, String title, int days, Status status) {
        this.id = id;
        this.title = title;
        this.days = days;
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " - " + title +
                " days in process: " + days +
                " status: " + status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDays() {
        return days;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (id != task.id) return false;
        if (days != task.days) return false;
        if (!Objects.equals(title, task.title)) return false;
        return status == task.status;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + days;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
