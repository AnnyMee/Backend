import java.util.ArrayList;
import java.util.List;
/*
3. Дан List<Employee>. У каждого Employee задано имя и стаж работы в фирме.
Руководство решило премировать N сотрудников, которые работают дольше всех.
Учтите, что если например, нужно премировать 3 сотрудника, но при этом в компании 5 старейших сотрудников с одинаковым стажем,
необходимо премировать всех пятерых.
Или например, есть 2 старейших сотрудника со стажем 10 лет, и еще 5 со стажем 9 лет - премируем всех семерых.
Необходимо написать метод, который вернет новый List<Employee> премируемых сотрудников.
(* Если нет идей, можно отсортировать список по стажу работы.)
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>(List.of(
                new Employee("Jack", 10),
                new Employee("John", 5),
                new Employee("Ana", 10),
                new Employee("Olya", 9),
                new Employee("Lilu", 3),
                new Employee("Mia", 2),
                new Employee("Oleg", 5),
                new Employee("Kakashi", 1)));

        System.out.println(getListForBonus(3,list));
    }
    public static List<Employee> getListForBonus(int count, List<Employee> employees){

        List<Employee> sorted = new ArrayList<>(employees);
        sorted.sort(new ComparatorByExperience().reversed());

        List<Employee> result = new ArrayList<>();
        for (int i=0; i<sorted.size() && (result.size()<count || result.get(result.size()-1).getExperience() == sorted.get(i).getExperience()); i++) {
            result.add(sorted.get(i));
        }
        return result;
    }
}