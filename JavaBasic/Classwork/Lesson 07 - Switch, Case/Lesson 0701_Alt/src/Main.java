/*
конструкция
switch (управляющая переменная) {
case значение_1: действие_1; break;
case значение_2: действие_2; break;
case значение_3: действие_3; break;
case значение_4: действие_4; break;
}
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert month: ");
        String monthTitle = scanner.nextLine();
        monthTitle=monthTitle.toLowerCase();
        /*
        monthTitle.toLowerCase()
        даёт гибкость при вводе с клавиатуры к примеру, если пользователь введёт месяц с большой буквы
        В А Ж Н О, имена месяцев должны все быть все одного типа букв (маленькие)
         */

        int monthNumber = 0;

        switch (monthTitle){
            case "january": monthNumber = 1; break;
            case "february": monthNumber = 2; break;
            case "march": monthNumber = 3; break;
            case "april": monthNumber = 4; break;
            case "may": monthNumber = 5; break;
            case "june": monthNumber = 6; break;
            case "july": monthNumber = 7; break;
            case "august": monthNumber = 8; break;
            case "september": monthNumber = 9; break;
            case "october": monthNumber = 10; break;
            case "november": monthNumber = 11; break;
            case "december": monthNumber = 12; break;
            default: monthNumber = 0;   //это значение можно и не указывать потому, что оно стоит в начале
        }

        String season = "";

        switch (monthNumber){
            case 12:
            case 1:
            case 2: season = "Winter"; break;
            case 3:
            case 4:
            case 5: season = "Spring"; break;
            case 6:
            case 7:
            case 8: season = "Summer"; break;
            case 9:
            case 10:
            case 11: season = "Autumn"; break;
            default: season = "Unknown season";
        }

        if (monthNumber == 0) {
            System.out.println(monthTitle + " - unknown month");
        }else {
            System.out.println(monthTitle + " - month number " + monthNumber);
        }
        System.out.println("It's " + season);
    }
}