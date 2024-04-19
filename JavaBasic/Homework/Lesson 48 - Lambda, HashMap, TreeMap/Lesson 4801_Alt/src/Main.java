import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("Jack:in",
                "John:in",
                "Jack:out",
                "Lena:in",
                "John:out",
                "John:in",
                "Nick:in",
                "Nick:out");

        System.out.println(getListOfWorkaholics(strings));

    }
    public static List<String> getListOfWorkaholics(List<String> list) {
        List<String> result = new ArrayList<>();
        if (list == null || list.isEmpty()) {
            //throw new RuntimeException;
            return result;
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            String[] splittedArray = s.split(":");
            if (splittedArray.length != 2 || !(splittedArray[1].equals("in") || splittedArray[1].equals("out"))) {
                throw new RuntimeException();
            }
            String key = splittedArray[0];
            int value = splittedArray[1].equals("in") ? 1 : -1;
            Integer newValue = map.merge(key, value, (i1, i2) -> i1 + i2);
            if(newValue<0 || newValue>1){
                throw new RuntimeException("Incorrect list");
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(var entry:entries){               //вместо Map.Entry<String,Integer> можно воспользоваться var - тип данной переменной определится автоматически
            if(entry.getValue()>0){
                result.add(entry.getKey());
            }
        }
        return result;
    }

}