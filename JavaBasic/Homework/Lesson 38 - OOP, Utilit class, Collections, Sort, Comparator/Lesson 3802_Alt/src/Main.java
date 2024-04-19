import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
Для примера возьмем класс Student {String name (имя), int missedLessons (количество пропущенных уроков),
boolean jobcenter (true если финансирование осуществляется через Jobcenter).
Необходимо создать список из нескольких студентов.
Ваша программа должна предлагать пользователю выбрать режим отображения списка:
- без сортировки
- сортировка по количеству пропущенных уроков (начиная с большего)
- сортировка по длине, т.е. количеству символов в имени

*В первую очередь отображаются все кто финансируется через Jobcenter, потом остальные.

Подсказка: естественно, для каждого случая необходимо будет реализовать и использовать свой Comparator
 */
public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Mario Giovanini", 5, true));
        students.add(new Student("Alina Amma", 0, false));
        students.add(new Student("Obito Uchiha", 8, false));
        students.add(new Student("Madara Uchiha", 1, true));
        students.add(new Student("Baal Gaavriilov", 4, true));
        students.add(new Student("Ariel Boneless", 0, false));
        students.add(new Student("Ino Yamanaka", 5, false));
        students.add(new Student("Kara Lin", 2, true));

        System.out.println("\nUnsorted list: ---------------");
        print(students);

        System.out.println("\nSorted by attendance: ---------------");
        print(students,new ComparatorStudentsByMissedLessons().reversed());

        System.out.println("\nSorted by name length: ---------------");
        print(students, new ComparatorStudentsByNameLength());

        System.out.println("\nSorted by financial option and attendance: ---------------");
        print(students, new ComparatorStudentsByJobcenterProp().thenComparing(new ComparatorStudentsByMissedLessons()));   //thenComparing - сначала сортирует по первому признаку а потом сортирует по другому признаку
    }

    public static void print(List<Student> list){
        for(Student student : list){
            System.out.println(student);
        }
    }
    public static void print(List<Student> list, Comparator<Student> comparator){
        //как создать копию списка для работы с ней
        List<Student> copyList = new ArrayList<>(list);

        if(comparator !=null){
            Collections.sort(copyList, comparator);      //возвращает обратный компаратор
        }
        print(copyList);
    }
}