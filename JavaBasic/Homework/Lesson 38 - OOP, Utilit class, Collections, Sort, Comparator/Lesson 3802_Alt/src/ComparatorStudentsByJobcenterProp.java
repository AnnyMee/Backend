import java.util.Comparator;

public class ComparatorStudentsByJobcenterProp implements Comparator<Student> {

     @Override
     public int compare(Student o1, Student o2) {
         if(o1.isJobcenter() && !o2.isJobcenter()) return -1;
         if(!o1.isJobcenter() && o2.isJobcenter()) return 1;

         return 0;
     }
 }
