import java.util.*;
/*
2.* Дан лист строк, необходимо получить Map<String, Integer> такой,
что ключом является строка из исходного листа, значением, сколько раз она встречается в листе.
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("Mouse","Cat","Dog","Chicken","Cat");

        System.out.println(count(list));
    }
    public static Map<String,Integer> count(List<String> list){
        Map<String,Integer> map = new HashMap<>();

        for (String el : list){
            if (map.containsKey(el)) {          //containsKey(el) условие, которое указывает на то есть ли данный key в данном Map или нет
                Integer v = map.get(el);
                map.put(el, v==null?1:v+1);     //сравниваем с null и если такого key не существует в Map, устанавливаем его value как 1, если же такой key уже есть, прибавляем к его значению 1
            } else {
                map.put(el, 1);                 //иначе просто добавляем key и его Value будет равно 1
            }
        }
        return map;
    }
}