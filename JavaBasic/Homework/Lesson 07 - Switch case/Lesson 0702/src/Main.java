/*
Реализовать программу естественно, используя switch...case,
которая запрашивает у пользователя номер месяца (int),
а выводит количество дней в этом месяце.

Подсказка: определение високосности года
(o! у пользователя нужно узнать и год ) у вас уже реализовано.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert month number: ");
        int month = scanner.nextInt();
        System.out.println("Please insert year: ");
        int year = scanner.nextInt();
        /*
        а можно и так
        int year=0;
        if (month==2){
        System.out.println("Please insert year: ");
        year = scanner.nextInt();
        }
         */

        int numberOfDays = 0;

        //boolean isValidMonth = (month >= 1 && month <= 12);
        //boolean isLeapYear = year % 400 == 0 || year % 100 != 0 && year % 4 == 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: numberOfDays = 31; break;
            case 4:
            case 6:
            case 9:
            case 11: numberOfDays = 30; break;
            //case 2: numberOfDays = 28; break;
            /*
            можно if вставить уже в сам case. к примеру:
            */
            case 2:
                boolean isYearLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400==0);
                if (isYearLeap){
                    numberOfDays=29;
                } else {
                    numberOfDays=28;
                }; break;
        }
        System.out.println("The month inserted has " + numberOfDays + " days.");
        // в таком случае нам не нужна переменная boolean и последующие вычисления if else
        /*
        if (isValidMonth && isLeapYear && month == 2) {
            numberOfDays = 29;
            System.out.println("The month number you've inserted has " + numberOfDays + " days.");
        } else if (isValidMonth) {
            System.out.println("The month number you've inserted has " + numberOfDays + " days.");
        } else {
            System.out.println("Invalid month number.");
         */

    }
}