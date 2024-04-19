import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return name + " (" + grades + ") ";
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
