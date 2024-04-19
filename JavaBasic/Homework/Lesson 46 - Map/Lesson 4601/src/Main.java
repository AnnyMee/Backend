/*
1. Дан map<String, Integer>.
Если в данной map есть ключи “add1” и “add2” (именно такие) необходимо сформировать новой ключ “summ” со значением суммы значений из ключа “add1” и “add2”.
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();


        map.put("add1",10);
        map.put("add2",5);

        printSum(map,"add1","add2");

    }
    public static int getSumValue(Map<String, Integer> map){
        int result = 0;

        for(String el : map.keySet()) {
            result += map.get(el);
        }
        return result;
    }
    public static void printSum(Map<String, Integer> map, String key1, String key2){
        if(map.containsKey(key1)&& map.containsKey(key2)){
            map.put("summ", getSumValue(map));
        }
        System.out.println(map);
    }
}