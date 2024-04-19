import java.util.ArrayList;
import java.util.List;

public class ListManager {
    public static void printConstantList(){         //метод константных чисел

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(7);
        numbers.add(7);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        System.out.println("Минимальное число в списке: " + NumberUtils.getMinValue(numbers));
        System.out.println("Максимальное число в списке: " + NumberUtils.getMaxValue(numbers));
        System.out.println("Сумма всех чисел в списке: " + NumberUtils.getSum(numbers));
    }
    public static void printRandomList(){           //метод рандомных чисел

        List<Integer> numbers = new ArrayList<>();

        numbers = ObjectGenerator.initiateRandom();

        System.out.println("Минимальное число в списке: " + NumberUtils.getMinValue(numbers));
        System.out.println("Максимальное число в списке: " + NumberUtils.getMaxValue(numbers));
        System.out.println("Сумма всех чисел в списке: " + NumberUtils.getSum(numbers));
    }

    public static void printListFromScanner(){           //метод чисел со сканера

        List<Integer> numbers = new ArrayList<>();

        numbers = ObjectGenerator.read();

        System.out.println("Минимальное число в списке: " + NumberUtils.getMinValue(numbers));
        System.out.println("Максимальное число в списке: " + NumberUtils.getMaxValue(numbers));
        System.out.println("Сумма всех чисел списке: " + NumberUtils.getSum(numbers));
    }

}
