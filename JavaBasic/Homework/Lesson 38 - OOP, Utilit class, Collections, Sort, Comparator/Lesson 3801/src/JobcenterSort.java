import java.util.Comparator;

public class JobcenterSort implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.isJobcenter()){
            return -100;
        }else return 100;

    }
}
