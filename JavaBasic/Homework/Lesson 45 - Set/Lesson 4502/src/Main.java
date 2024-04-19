import java.util.*;
/*
2. Дана строка с именами вида Jack,John,Nick,John.
Необходимо написать метод, который удалит из этой строки повторяющиеся имена.
Т.е. например, в случае строки  “Jack,John,Nick,John” вернет строку  с именами  Jack,John,Nick
 */
public class Main {
    public static void main(String[] args) {

        String str = "Jack, John, Nick, John";

        System.out.println(getString(str));
    }
    public static String getString(String str){
        HashSet<String> set = new HashSet<>();
        String result = "";
        for(String name : str.split(", ")){
            set.add(name);
        }
        return result.join(", ",set);
    }
    //LinkedHashSet - тот же сет, но сохраняет порядок элементов.
}