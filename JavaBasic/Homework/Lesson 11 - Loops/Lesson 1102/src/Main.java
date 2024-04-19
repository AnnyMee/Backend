/*
Реализовать метод (точнее три метода, используя while, do..while, for),
который считает сумму четных числа начиная от number1 до number2.
Например:
number1 = 10
number2 = 15
Вывод:

36
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1 = getFromScanner("Please insert number you'd like to start with: ");
        int num2 = getFromScanner("Please insert limit number: ");

        int resultWhile = methodWhile(num1, num2);
        System.out.println(resultWhile);
        int resultDoWhile = methodDoWhile(num1, num2);
        System.out.println(resultDoWhile);
        int resultFor = methodFor(num1, num2);
        System.out.println(resultFor);
    }

    public static int methodWhile(int number1, int number2) {

        int sum = 0;

        while (number1 <= number2) {
            if (number1 % 2 == 0) {
                sum += number1;
            }
            number1++;
        }
        return sum;

    }

    public static int methodDoWhile(int number1, int number2) {

        int sum = 0;

        do {
            if (number1 % 2 == 0) {
                sum += number1;
            }
            number1++;

        } while (number1 <= number2);

        return sum;

    }

    public static int methodFor(int number1, int number2) {

        int sum = 0;

        for (int i = number1; i <= number2; i++) { //как я поняла, изначальное условие необходимо и без него не написать данный способ. Пришлось объявить новую переменную со значением первого номера
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int getFromScanner (String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextInt();
    }
}