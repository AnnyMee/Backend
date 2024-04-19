import java.util.ArrayList;
import java.util.List;

/*
5. Дан List<Student>. У каждого студента есть имя и список оценок.
Необходимо получить список строк вида: John, 4.76 т.е. имя, средний балл
 */
public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>(List.of(
                new Student("Jack", List.of(7,8,6,6,10,9)),
                new Student("John", List.of(5,5,8,7,6,6)),
                new Student("Anna", List.of(9,9,8,8,9,9)),
                new Student("Olya", List.of(7,7,6,7,7,8)),
                new Student("Lilu", List.of(4,5,5,5,4,4)),
                new Student("Mia", List.of(6,6,9,8,5,5)),
                new Student("Oleg", List.of(7,7,5,2,4,8)),
                new Student("Kakashi", List.of(9,9,9,8,7,10))));

        System.out.println(getStringFormatList(list));

    }
    public static List<String> getStringFormatList(List<Student> students){
        List<String> listWithMarks = new ArrayList<>();

        for (Student el:students){
            listWithMarks.add("\n" + el.getName() + " (" + getAvgMark(el.getGrades()) + ") ");
        }
        return listWithMarks;
    }

    public static double getAvgMark(List<Integer> grades){
        double sum = 0.0;
        for (Integer grade: grades){
            sum+=grade;
        }
        return sum/grades.size();
    }
}