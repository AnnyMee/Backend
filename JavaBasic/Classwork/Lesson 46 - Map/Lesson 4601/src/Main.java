import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();    //map всегда хранит два объекта, где первое значение (key) это своего рода идентификатор(они уникальны), по которому можно найти объект, а второе значение это инфа

        map.put("John",4);
        map.put("Pavel",5);
        map.put("Nick",4);

        System.out.println(map);

        Map<String, List<Integer>> students = new HashMap<>();
        students.put("John",List.of(4,5,4,4));
        students.put("Jack",List.of(4,5));
        students.put("Lena",List.of(4,5,4));
        students.put("Nick",List.of(4,5,4,3,4));

        students.put("Nick",List.of(4,5));  //--> если добавить объект с одинаковым key, map перепишет предыдущую информацию новой

        System.out.println(students);
        System.out.println(students.get("Lena"));
        System.out.println("-".repeat(80));

        System.out.println(students.keySet());   //получаем таким образом set из keys
        System.out.println("-".repeat(80));

        for(String s : students.keySet()){
            System.out.println("Key: " + s + ", value: " + students.get(s));
        }


    }
}