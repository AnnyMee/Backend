import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
Дан List<Task>. Task - класс, который состоит из {int id, String title, int days, Programmer performer}.
Поле days - определяет, сколько дней задача находится в работе. Класс Programmer содержит два поля, имя программиста и город.
Необходимо написать методы:
1. который получает список из 3 самых долго висящих задач для заданного программиста.
2. список задач всех программистов из заданного города, отсортированный по имени программиста, который за них отвечает.
 */
public class Main {
    public static void main(String[] args) {
        List<Task> list = new ArrayList<>(List.of(
                new Task(111, "Write program in Java language",20,new Programmer("Mike","London")),
                new Task(112, "Update app1",30,new Programmer("Mike","London")),
                new Task(113, "Test program functionality",10,new Programmer("Linda","Berlin")),
                new Task(114, "Modify code",3,new Programmer("Nick","Berlin")),
                new Task(115, "Rewrite code to C++",20,new Programmer("Nick","Berlin")),
                new Task(116, "Write program in C++ language",25,new Programmer("Nick","Berlin")),
                new Task(117, "Update app2",60,new Programmer("Mike","London")),
                new Task(118, "Develop new functionality for app1",70,new Programmer("Linda","Berlin")),
                new Task(119, "Develop new functionality for app2",90,new Programmer("Linda","Berlin")),
                new Task(120, "Update app2",35,new Programmer("Mike","London"))
        ));
        System.out.println("-".repeat(40)+ "Task 1" + "-".repeat(40));
        System.out.println(getTaskProcessingTime(list,"Mike"));
        System.out.println("-".repeat(40)+ "Task 2" + "-".repeat(40));
        System.out.println(getTaskByCity(list,"Berlin"));

    }
    public static List<String> getTaskProcessingTime (List<Task> list, String name){
        List<String> result = list.stream()
                .filter(task -> task.getPerformer().getName().equals(name))
                .sorted((o1, o2) -> o2.getDays()-o1.getDays())
                .limit(3)
                .map(task -> "\n" + task.getTitle() +": "+ task.getDays() +" - "+ task.getPerformer().getName())
                .collect(Collectors.toList());

        return result;
    }
    public static List<String> getTaskByCity (List<Task> list, String city) {
        List<String> result = list.stream()
                .filter(task -> task.getPerformer().getCity().equals(city))
                .sorted((o1, o2) -> o1.getPerformer().getName().compareTo(o2.getPerformer().getName()))
                .map(task -> "\n" + task.getPerformer().getCity() +" - "+ task.getPerformer().getName() +": "+ task.getTitle())
                .collect(Collectors.toList());

        return result;
    }
}