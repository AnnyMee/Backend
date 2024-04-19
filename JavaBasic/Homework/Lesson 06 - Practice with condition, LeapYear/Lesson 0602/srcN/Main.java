import java.util.Scanner;
/*
Пользователь вводит 3 числа int: день (day) месяц (month) и год (year).
Задача вашей программы определить, могут ли эти цифры быть корректной датой.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert day: ");
        int day = scanner.nextInt();
        System.out.println("Please insert month: ");
        int month = scanner.nextInt();
        System.out.println("Please insert year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = year % 400 == 0 || year % 100 != 0 && year % 4 == 0;


        if (month>=1 && month<=12) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day >= 1 && day <= 31) {
                    System.out.println("The date format is correct.");
                }
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day >= 1 && day <= 30) {
                    System.out.println("The date format is correct.");
                }
            }
            if (month == 2) {
                if (day >= 1 && day <= 28) {
                    System.out.println("The date format is correct.");
                }
                if (month == 2 && isLeapYear) {
                    if (day >= 1 && day <= 29) {
                        System.out.println("The date format is correct.");
                    }
                }
            }
        }
        else{
            System.out.println("The date format is incorrect.");
        }
    }
}