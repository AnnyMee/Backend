import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NumberReader {
    //Типы как List (collection/interface) не могут содержать примитивные типы переменных (int, boolean, double, long..).
    // Обойти это можно используя такие классы как Integrer (int), Double(double), Boolean(boolean) и т.д.
    public List<Integer> read(){
        List<Integer> result = new LinkedList<>(); //или ArrayList<>(); в данном случае это не меняет результата. Разница в том, что Array работает с массивом, а LinkedList работает по принципу связей

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number to save or 0 to exit");
        int num = 0;
        do{
            num = scanner.nextInt();
            if(num != 0){
                result.add(num);
            }
        }while (num != 0);

        return result;
    }
}
