import java.util.Scanner;                           //импорт сканера


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello there!");         //оставила приветствие
        System.out.println("My name is ");          //сначала вывела текст до запроса

        Scanner scanner = new Scanner(System.in);   //объявила использование сканера

        String name = scanner.nextLine();          //задействовала сканер name

        System.out.println(name + ",");            //вывела на экран возможность написать имя, добавила запятую
        System.out.println("and I am from ");      //снова вывела текст до запроса

        String location = scanner.nextLine();       //задействовала сканер location

        System.out.println(location + ".");         //вывела на экран возможность написать место, добавила точку


    }
}