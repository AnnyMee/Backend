import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jack",10);
        map.put("John",15);
        map.put("Ann",17);
        map.put("Nick",16);

        Integer value1 = map.putIfAbsent("Jack", 20);

        System.out.println(value1);
        System.out.println(map);
        System.out.println("-".repeat(100));
        //------------------------------------------------------------------------------------------------------------------------------
        map.forEach(new BiConsumer1());

        List<Integer> list = List.of(1,2,3,4);
        list.forEach(new Consumer1());
        System.out.println("-".repeat(100));
        //-------------------------------------------------------------------------------------------------------------------------------
        list.forEach(new Consumer<Integer>() {      //это анонимный класс (без имени) и его можно уложить в переменную
            @Override
            public void accept(Integer integer) {
                System.out.println("значение: "+integer);
            }
        });
        //--------------------------------------------------------------------------------------------------------------------------------
        Consumer<Integer> cons = new Consumer<>() {      //это анонимный класс (без имени) и его можно уложить в переменную
            @Override
            public void accept(Integer integer) {
                System.out.println("значение: " + integer);
            }
        };
        //--------------------------------------------------------------------------------------------------------------------------------
        list.forEach(cons);

        //--------------------------------------------------------------------------------------------------------------------------------
        list.forEach((Integer i)->{System.out.println("значение: " + i); });
        list.forEach(i->System.out.println("значение: " + i));

        list.sort(((o1, o2) -> {return o2.compareTo(o1);}));

    }
    public static Map<String,Integer> count(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for (String el : list){
                Integer v = map.putIfAbsent(el,1);
                if(v!=null){
                    map.put(el,v+1);
                }
        }
        return map;
    }
}