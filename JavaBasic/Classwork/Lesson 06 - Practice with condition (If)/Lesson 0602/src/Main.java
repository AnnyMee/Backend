/*
Пользователь должен ввести 3 числа
Программа должна вывести самое большое число
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please insert second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Please insert third number: ");
        int number3 = scanner.nextInt();



        int max = number1;

        if (max < number2){
            max = number2;
        }
        if (max < number3){
            max = number3;
        }

        System.out.println("number1: " + number1 + " number2: " + number2 + " number3: " + number3);
        System.out.println(max + " самое большое");

        /*
        Альтернативное решение 1:

        if (number1>=number2 && number1>=number3){          //не забывать >=
            System.out.println(number1);
        } if (number2>=number1 && number2>=number3){
            System.out.println(number2);
        } if (number3>=number1 && number3>=number2){
            System.out.println(number3);
        }
            System.out.println("number1: " + number1 + " number2: " + number2 + " number3: " + number3);

        Альтернативное решение 2:

        int max = number1;

        if (max < number2){
            max = number2;
        }
        if (max < number3){
            max = number3;
        }

        if (number1>=number2 && number1>=number3){          //не забывать >=
            System.out.println(number1 + " - самое большое");
        } else if (number2>=number1 && number2>=number3){
            System.out.println(number2 + " - самое большое");
        } else if (number3>=number1 && number3>=number2){
            System.out.println(number3 + " - самое большое");
        }
            System.out.println("number1: " + number1 + " number2: " + number2 + " number3: " + number3);
        */
    }
}