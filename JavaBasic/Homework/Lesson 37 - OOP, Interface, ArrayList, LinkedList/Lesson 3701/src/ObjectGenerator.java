import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ObjectGenerator {
    public static List<Integer> initiateRandom(){       //метод ограничивает количество генерируемых чисел
        List<Integer> numbers = new ArrayList<>();

        for(int i =0; i<5; i++) {
            numbers.add(generateRandom());
        }
        return numbers;
    }
    public static Integer generateRandom(){         //метод генерирует рандомно числа от -50 до 50
        Integer randomNum = -50 + (int)(Math.random() * 100);

        return randomNum;
    }
    public static List<Integer> read(){             //метод считывает со сканера
        List<Integer> result = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите 5 чисел, которые Вы хотите добавить в собственный список: ");

        for(int i =0; i<5; i++) {                 //ограничиваем количество введённых чисел так же как для рандома
            int usersNumbers = scanner.nextInt();
            result.add(usersNumbers);
        }
        return result;
    }
}
