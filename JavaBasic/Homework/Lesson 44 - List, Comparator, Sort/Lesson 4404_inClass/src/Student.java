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
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
    public double getAvgMark(){
        double sum = 0.0;
        for (Integer grade: grades){
            sum+=grade;
        }
        return sum/grades.size();
    }

    public String getName() {
        return name;
    }
}
