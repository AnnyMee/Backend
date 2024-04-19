/*
Немного азартных игр. Написать метод, который принимает 3 строки,
каждая из которых текстом записанная цифра например так ("one","five","six").
В рамках данной задачи строки всегда корректны и могут быть только: one,two, three, four, five, six, seven, eight, nine.
Ваш метод должен возвращать int обозначающий выйгрыш:

        1000 - если комбинация 777,
        500 - если комбинация, цифры идущие в обратном порядке, например 876 или 765 или 987
        250 - если комбинация, цифры идущие в прямом порядке, например 678 или 567 или 789 во всех остальных случаях, 0
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your combination using letters only: ");

        int amountWon = calcWin(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        if (amountWon==0){
            System.out.println("Maybe better luck if you try again?");
        }else {
            System.out.println("You won " + amountWon + "! Congratulations!");
        }


    }

    public static int calcWin(String first, String second, String third) {
        int num1 = transformToNumbers(first);
        int num2 = transformToNumbers(second);
        int num3 = transformToNumbers(third);

        if (num1 == 7 && num2 == 7 && num3 == 7) {
            return 1000;
        } else if (num2 == num1-1 && num3 == num2-1){   //((num1 == 9 && num2 == 8 && num3 == 7) || (num1 == 8 && num2 == 7 && num3 == 6) || (num1 == 7 && num2 == 6 && num3 == 5) || (num1 == 6 && num2 == 5 && num3 == 4) || (num1 == 5 && num2 == 4 && num3 == 3) || (num1 == 4 && num2 == 3 && num3 == 2) || (num1 == 3 && num2 == 2 && num3 == 1)) {
            return 500;
        } else if (num2 == num1+1 && num3 == num2+1){   //((num1 == 1 && num2 == 2 && num3 == 3) || (num1 == 2 && num2 == 3 && num3 == 4) || (num1 == 3 && num2 == 4 && num3 == 5) || (num1 == 4 && num2 == 5 && num3 == 6) || (num1 == 5 && num2 == 6 && num3 == 7) || (num1 == 6 && num2 == 7 && num3 == 8) || (num1 == 7 && num2 == 8 && num3 == 9)) {
            return 250;
        } else {
            return 0;

        }

    }

    public static int transformToNumbers(String numberName) {
        int number = 0;
        switch (numberName) {
            case "one": number = 1; break;          //вместо number = 1; break; можно написать просто return=1;
            case "two": number = 2; break;          //вместо number = 2; break; можно написать просто return=2;
            case "three": number = 3; break;        //вместо number = 3; break; можно написать просто return=3;
            case "four": number = 4; break;         //вместо number = 4; break; можно написать просто return=4;
            case "five": number = 5; break;         //вместо number = 5; break; можно написать просто return=5;
            case "six": number = 6; break;          //вместо number = 6; break; можно написать просто return=6;
            case "seven": number = 7; break;        //вместо number = 7; break; можно написать просто return=7;
            case "eight": number = 8; break;        //вместо number = 8; break; можно написать просто return=8;
            case "nine": number = 9; break;         //вместо number = 9; break; можно написать просто return=9;
        }
        return number;
    }
}