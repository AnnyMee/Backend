import java.util.Scanner;

/*
Реализовать программу, которая запрашивает у пользователя год
(int, например 1997) и определяет високосный это год или нет.

високосный год:

год, номер которого кратен 400, — високосный;
остальные годы, номер которых кратен 100, — не високосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
остальные годы, номер которых кратен 4, — високосные;
все остальные годы — не високосные.
Viki

*Для тех кому сложно все условия, реализуйте упрощенный вариант, "виcокосный, любой год, номер которого делится на 4 без остатка".
В комментарии укажите, какой вариант решаете
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert year: ");
        int yearToCheck = scanner.nextInt();

        boolean isLeapYear = yearToCheck % 400 == 0 || yearToCheck % 100 != 0 && yearToCheck % 4 == 0;

        if(isLeapYear){
            System.out.println(yearToCheck + " - is leap year.");
        }else{
            System.out.println(yearToCheck + " - is not leap year.");
        }
    }
}