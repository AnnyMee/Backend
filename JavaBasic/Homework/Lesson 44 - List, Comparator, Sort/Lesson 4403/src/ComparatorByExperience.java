import java.util.Comparator;

public class ComparatorByExperience implements Comparator<Employee> {

     @Override
     public int compare(Employee o1, Employee o2) {
         return o1.getExperience()- o2.getExperience();
     }
 }
