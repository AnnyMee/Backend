import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        students.add(new Student("Mario Giovanini", 5, true));
        students.add(new Student("Alina Amma", 0, false));
        students.add(new Student("Obito Uchiha", 8, false));
        students.add(new Student("Madara Uchiha", 1, true));
        students.add(new Student("Baal Gaavriilov", 4, true));
        students.add(new Student("Ariel Boneless", 0, false));
        students.add(new Student("Ino Yamanaka", 5, false));
        students.add(new Student("Kara Lin", 2, true));

        System.out.println("Please input 1 to print the list of the students.");
        System.out.println("Please input 2 to print the list of the students sorted by attendance.");
        System.out.println("Please input 3 to print the list of the students sorted by name length.");
        System.out.println("Please input 4 to print the list of the students financed by JobCenter.");

        int choice = scanner.nextInt();

        if(choice==1){
            System.out.println(students);
        }
        if(choice==2){
            Collections.sort(students, new ComparatorStudentsByMissedLessons());
            System.out.println("Sort according missed lessons amount: " + students);
        }
        if(choice==3){
            Collections.sort(students, new ComparatorByStudentsNameLength());
            System.out.println("Sort according name length: " + students);
        }
        if(choice==4){
            Collections.sort(students, new JobcenterSort());
            System.out.println("Sort according finance option: " + students);
        }
    }
}
