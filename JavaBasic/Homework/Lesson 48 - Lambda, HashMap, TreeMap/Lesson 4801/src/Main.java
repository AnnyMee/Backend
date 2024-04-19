import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Допустим, у вас есть список строк вида: “Jack:in”, “John:in”, “Jack:out”, “Lena:in”,“John:out”.
Каждая строка означает, что сотрудник зашел (in) или вышел (out) из офиса.
Необходимо написать метод, который вернет список имен сотрудников, которые находятся в офисе.
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Jack:in","John:in","Jack:out","Lena:in","John:out"));

        //test - System.out.println(processRecords(list));
        System.out.println(getListOfWorkaholics(processRecords(list)));
    }
    public static List<String> getListOfWorkaholics(Map<String,Integer> map){
        List<String> listOfWorkaholics = new ArrayList<>();
            //Map.Entry<String, Integer> - такой же "объект" как и String, Person и т.д.
        for (Map.Entry<String, Integer> el : map.entrySet()) {    //entrySet для выполнения переборов пар key-value
            if (el.getValue() > 0) {
                listOfWorkaholics.add(el.getKey());
            }
        }
        return listOfWorkaholics;
    }
    public static Map<String, Integer> processRecords(List<String> list){  //обработка входов и выходов с работы
        Map<String, Integer> map = new HashMap<>();

        for (String el : list) {
            String[] str = el.split(":");

            int temp = map.getOrDefault(str[0], 0);

            if (str[1].equals("in")) {
                map.put(str[0], temp + 1);      //к defaultValue(0) добавляем 1
            } else if (str[1].equals("out")) {
                map.put(str[0], temp - 1);      //отнимаем 1 у defaultValue
            }
        }
        return map;
        //вывод - value для сотрудников которые вошли и вышли, будет равняться нулю (или ниже нуля, если вдруг что-то пошло не так при входе на работу)
    }
}