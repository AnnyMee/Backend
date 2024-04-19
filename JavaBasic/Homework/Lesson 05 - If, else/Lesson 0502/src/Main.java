import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);               //"(в программе температура задается переменными)" немного не поняла как это... поэтому было легче создать сканер
        System.out.print("Please insert temperature in flask nr. 1: ");
        int flaskTemperature1 = scanner.nextInt();              //запрос на температуру первой колбы

        System.out.print("Please insert temperature in flask nr. 2: ");
        int flaskTemperature2 = scanner.nextInt();              //запрос на температуру второй колбы

        //можно условия ниже выразить так же через переменную boolean
        if ((flaskTemperature1 < 100 && flaskTemperature2 > 200) || (flaskTemperature1 > 200 && flaskTemperature2 < 100)) {     //задала два условия используя как "AND" так и "OR" вместе
            System.out.println("The device is working correctly.");
        } else {
            System.out.println("Attention! The device is not working correctly. Please check temperature in the flasks!");
        }

    }
}