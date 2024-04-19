import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] qwe = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(qwe));
        System.out.println("*".repeat(60));

        qwe = Arrays.copyOf(qwe, 20);       //увеличение массива
        System.out.println(Arrays.toString(qwe));
        System.out.println("*".repeat(60));

        qwe = Arrays.copyOf(qwe, 6);        //уменьшение массива (с потерей значений)
        System.out.println(Arrays.toString(qwe));
        System.out.println("*".repeat(60));

        qwe = Arrays.copyOfRange(qwe, 1, 4);  //выведет заданный интервал на экран (это аналог метода substring, но для массива)
        System.out.println(Arrays.toString(qwe));
        System.out.println("*".repeat(60));
    }
}
