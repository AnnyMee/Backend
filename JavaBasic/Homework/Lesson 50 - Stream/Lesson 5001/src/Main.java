import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
Дан List<Programmer>. Programmer {name, List<Task>, String city}
Task - класс, который состоит из {int id, String title, int days, Status status },
Status: DONE, PROCESSED, CANCELED.
Причем, одна задача может находиться в списках у нескольких программистов. За задачу отвечают все, у кого она в списке.

Необходимо:
1. Написать метод, который вернет список всех задач в работе (статус DONE),
отсортированный по количеству дней в работе (от большего к меньшему)
2. Написать метод, который вернет MAP<Boolean, List<Task>>,
где ключу true соответствует List задач в состояние DONE, а ключу false - остальные
3. Написать метод, который вернет MAP, где ключ - задача, а значение - список ответственных за нее программистов.
 */
public class Main {
    public static void main(String[] args) {


        List<Programmer> list = new ArrayList<>(List.of(
                new Programmer("Mike",List.of(
                        new Task(111,"Write program in Java language",20,Status.DONE),
                        new Task(112, "Update app1",30,Status.PROCESSED),
                        new Task(117, "Update app2",60,Status.PROCESSED),
                        new Task(120, "Update app2",35,Status.CANCELED)),"London"),
                new Programmer("Nick",List.of(
                        new Task(114, "Modify code",3,Status.DONE),
                        new Task(115, "Rewrite code to C++",20,Status.PROCESSED),
                        new Task(116, "Write program in C++ language",25,Status.CANCELED)),"Berlin"),
                new Programmer("Linda",List.of(
                        new Task(113, "Test program functionality",10,Status.DONE),
                        new Task(118, "Develop new functionality for app1",70,Status.PROCESSED),
                        new Task(119, "Develop new functionality for app2",90,Status.CANCELED)),"Berlin")));

        System.out.println("Task 1: ");
                print(getFinishedTasks(list));
        System.out.println("Task 2: \n" + checkByStatus(list));
        System.out.println("Task 3: ");
        Map<Task, List<Programmer>> mapProgrammersByTask = getMapProgrammersByTask(list);
        for(var entry : mapProgrammersByTask.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().stream()
                    .map(programmer -> programmer.getName() + "|" + programmer.getCity())
                    .collect(Collectors.joining(", ")));;
        }

    }
    public static List<Task> getFinishedTasks(List<Programmer> list){
        List<Task> result = list.stream()
                .flatMap(programmer -> programmer.getTasks().stream()
                        .filter(task -> task.getStatus() == Status.DONE))
                .sorted((o1, o2) -> o2.getDays()-o1.getDays())
                .collect(Collectors.toList());
        return result;
    }
    public static Map<Boolean, List<Task>> checkByStatus(List<Programmer> list){
        Map<Boolean, List<Task>> map = list.stream()
                .flatMap(programmer -> programmer.getTasks().stream())
                .collect(Collectors.partitioningBy(task -> task.getStatus() == Status.DONE));
        return map;
    }
    public static Map<Task,List<Programmer>> getMapProgrammersByTask(List<Programmer> list){

        class TaskProgrammer{
            private Task task;
            private Programmer programmer;

            public TaskProgrammer(Task task, Programmer programmer) {
                this.task = task;
                this.programmer = programmer;
            }

            public Task getTask() {
                return task;
            }

            public Programmer getProgrammer() {
                return programmer;
            }
        }

        Map<Task, List<TaskProgrammer>> map = list.stream()
                .flatMap(programmer -> programmer.getTasks()
                        .stream()
                        .map(task -> new TaskProgrammer(task, programmer)))
                .collect(Collectors.groupingBy(taskProgrammer -> taskProgrammer.getTask()));

        Map<Task, List<Programmer>> result = new HashMap<>();
        for (var entry : map.entrySet()){
            Task key = entry.getKey();
            List<Programmer> value = entry.getValue().stream()
                    .map(taskProgrammer -> taskProgrammer.getProgrammer())
                    .collect(Collectors.toList());
            result.put(key,value);
        }
        return result;


    }

    public static <T> void print(Collection<T> collection){

        collection.forEach((element)-> System.out.println(element));

        }
}