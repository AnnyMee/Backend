import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);                                   //добавила сканер, чтобы программа считывала данные о скорости с клавиатуры
        System.out.println("Please insert the speed limit in your area: ");         //вывела текст для запроса ограничения по скорости от пользователя
        int speedLimit = scanner.nextInt();                                         //значение переменной speedLimit будет задано пользователем с клавиатуры
        System.out.println("Please insert the speed you were driving at: ");        //вывела текст для запроса скорости с которой ехал автомобиль от пользователя
        int speedOfUser = scanner.nextInt();                                        //значение переменной speedOfUser будет задано пользователем с клавиатуры
        int coefficientOfSpeed = 10;                                                //создала переменную "коэффициент скорости" для добавление в дальнейший boolean

        boolean isOverSpeed = speedOfUser > speedLimit+coefficientOfSpeed;          //объявляю переменную типа boolean для создания условия

        if (isOverSpeed) {                                                          //даю указания программе о выводе результата при выполнении или не выполнении условия
            System.out.println("You have exceeded the speed limit by " + (speedOfUser-speedLimit) + " km/h! Please proceed with paying the fine.");
        } else {
            System.out.println("There were no speed violations.");
        }
    }
}