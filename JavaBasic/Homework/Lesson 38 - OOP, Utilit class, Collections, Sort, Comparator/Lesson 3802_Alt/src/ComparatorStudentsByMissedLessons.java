import java.util.Comparator;

public class ComparatorStudentsByMissedLessons implements Comparator<Student> {

public int compare(Student o1, Student o2){
    return (o1.getMissedLessons()-o2.getMissedLessons());
}
}
