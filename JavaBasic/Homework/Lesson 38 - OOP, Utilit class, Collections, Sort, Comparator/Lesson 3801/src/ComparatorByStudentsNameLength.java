import java.util.Comparator;

public class ComparatorByStudentsNameLength implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getName().length()<o2.getName().length()) return 100000;
        if(o1.getName().length()>o2.getName().length()) return -100000;

        return o1.getName().length()- o2.getName().length();
    }
}
