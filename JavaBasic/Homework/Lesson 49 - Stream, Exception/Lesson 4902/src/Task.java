import java.util.Objects;

public class Task {
    private int id;
    private String title;
    private int days;
    private Programmer performer;

    public Task(int id, String title, int days, Programmer performer) {
        this.id = id;
        this.title = title;
        this.days = days;
        this.performer = performer;
    }

    @Override
    public String toString() {
        return "Task id: " + id +
                ", title: " + title + '\'' +
                ", progress: " + days +
                ", performer: " + performer;
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

    public Programmer getPerformer() {
        return performer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (id != task.id) return false;
        if (days != task.days) return false;
        if (!Objects.equals(title, task.title)) return false;
        return Objects.equals(performer, task.performer);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + days;
        result = 31 * result + (performer != null ? performer.hashCode() : 0);
        return result;
    }
}
