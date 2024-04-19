/*
Реализовать программу естественно, используя switch...case,
которая запрашивает у пользователя цифру от 0 до 9 и выводить на экран ее текстом
        Например:
        1 -> "one"
        2 -> "five"
        ...
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert number: ");
        int number = scanner.nextInt();

        String numberName= " ";

        switch (number){
            case 0: numberName = "zero"; break;
            case 1: numberName = "one"; break;
            case 2: numberName = "two"; break;
            case 3: numberName = "three"; break;
            case 4: numberName = "four"; break;
            case 5: numberName = "five"; break;
            case 6: numberName = "six"; break;
            case 7: numberName = "seven"; break;
            case 8: numberName = "eight"; break;
            case 9: numberName = "nine"; break;
        }
        boolean isValidNumber = number>=0 && number<=9;

        if (isValidNumber) {
            System.out.println(number + " - " + numberName);
        }else{
            System.out.println("Invalid number.");
        }
    }
}