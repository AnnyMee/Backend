/*
Пользователь вашей программы вводит три int: день, месяц и год.
Ваша программа должна получить и вывести на экран дату следующую за той,
что ввел пользователь. Например: ввели 31.12.2000 следующая дата 1.1.2001
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);               //настраиваем сканер для запроса данных

        System.out.println("Please insert day: ");
        int day = scanner.nextInt();

        System.out.println("Please insert month: ");
        int month = scanner.nextInt();

        System.out.println("Please insert year: ");
        int year = scanner.nextInt();


        int nextDay = 0;                                       //объявляю переменные. все переменные должны быть int, чтобы была возможность считать последующие дни
        int nextMonth = 0;                                     //помимо переменных от пользователя, мне потребовались так же и переменные для следующего дня/месяца/года
        int nextYear = 0;

        if (day < getDaysInMonth(month, year)) {               //создаю условие для следующего дня, если пользователь ввёл день меньше, чем максимальное количество дней в месяце

            nextDay = day + 1;
            nextMonth = month;
            nextYear = year;
        } else if (month < 12) {                               //создаю условие для следующего дня, если пользователь ввёл месяц меньше, чем максимальное количество месяцев в году

            nextDay = 1;
            nextMonth = month + 1;
            nextYear = year;
        } else {                                               //в остальных случаях день и месяц "обнулятся" и поменяется только год

            nextDay = 1;
            nextMonth = 1;
            nextYear = year + 1;
        }

        System.out.println("If today is : " + day + "/" + month + "/" + year +",");                         //выводим первую строчку с изначальными данными
        System.out.println("Then tomorrow is: " + nextDay + "/" + nextMonth + "/" + nextYear + ".");        //выводим вторую строчку с результатом

    }
    public static int getDaysInMonth(int month, int year) {                     //создаём отдельный метод для указания максимального количества дней с учётом месяцев и високосных годов
        //ну эту формулу мы проходили множество раз, поэтому copy paste
        int daysInMonth = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        }
        if (month == 2) {
            boolean isYearLeap = (year % 400 == 0 || year % 100 != 0 && year % 4 == 0);
            if (isYearLeap) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
        }
        return daysInMonth;

    }
}