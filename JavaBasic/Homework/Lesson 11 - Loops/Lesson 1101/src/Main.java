/*
Реализовать метод (точнее три метода, используя while, do..while, for),
который выводит на экран четные числа начиная от number1 до number2.
Например:
number1 = 10
number2 = 15
Вывод:

10
12
14
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1 = getFromScanner("Please insert number you'd like to start with: ");
        int num2 = getFromScanner("Please insert limit number: ");

        methodWhile(num1, num2);
        methodDoWhile(num1, num2);
        methodFor(num1, num2);
    }
    public static void methodWhile (int number1, int number2){

        int actualNumber = number1;

        while (actualNumber <= number2){
            if (actualNumber%2==0) {
                System.out.println(actualNumber);
            }
            actualNumber++;
        }

    }
    public static void methodDoWhile (int number1, int number2){

        int actualNumber = number1;

        do{
            if(actualNumber%2==0){
                System.out.println(actualNumber);
            }
            actualNumber++;

        }while (actualNumber <= number2);

    }
    public static void methodFor (int number1, int number2){

        int actualNumber;

        for(actualNumber=number1; actualNumber <= number2; actualNumber++){
            if(actualNumber%2==0){
                System.out.println(actualNumber);
            }
        }
    }
    public static int getFromScanner(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextInt();
    }
}