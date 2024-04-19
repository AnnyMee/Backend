import java.util.Comparator;

public class ComparatorStudentsByMissedLessons implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {

        if(o1.getMissedLessons()<o2.getMissedLessons()) return 100000;
        if(o1.getMissedLessons()>o2.getMissedLessons()) return -100000;

        return o1.getMissedLessons() - o2.getMissedLessons();
    }
}
