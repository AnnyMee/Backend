/*
Пользователь вводит 3 числа int: день (day) месяц (month) и год (year).
Задача вашей программы определить, могут ли эти цифры быть корректной датой.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert day: ");
        int day = scanner.nextInt();
        System.out.println("Please insert month: ");
        int month = scanner.nextInt();
        System.out.println("Please insert year: ");
        int year = scanner.nextInt();


        if (year < 1 || month < 1 || month > 12) {                                  //обозначаю условие для года и месяца, в котором дата будет неверна (наоборот делать мозг взрывался)
            System.out.println("The date format is invalid.");
        } else {                                                                    //после else добавляю все инструкции условия в случае которого дата верна
            int maximumDays = 31;                                                   //создаю переменную int, которую далее можно будет менять для последующих if, для обозначения максимум дней разрешенных в месяце

            if (month == 4 || month == 6 || month == 9 || month == 11) {            //выражаю условие для месяцев дни которых равны 30
                maximumDays = 30;                                                   //меняю значение переменной int
            } else if (month == 2) {                                                //создаю условие для месяца февраля
                if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {          //вставляю условие для високосного года с первого задания
                    maximumDays = 29;                                               //снова меняю int уже на максимум 29 дней
                } else {
                    maximumDays = 28;                                               //меняю int на максимум 28 дней
                }
            }
            if (day >= 1 && day <= maximumDays) {                                   //создаю новое условие для интеграции переменной maximumDays
                System.out.println("The date format is valid.");
            } else {                                                                //ну и если число для day не подпадает в рамки - дата неверна
                System.out.println("The date format is invalid.");
            }
        }
    }
}