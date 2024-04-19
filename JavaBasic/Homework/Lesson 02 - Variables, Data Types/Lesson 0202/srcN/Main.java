/*
Написать программу аналогично п.1, но имя вводить с клавиатуры
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert your name:");
        String userName = scanner.nextLine();

        System.out.println("Please insert your city:");
        String cityName = scanner.nextLine();

        System.out.println("My name is " + userName);
        System.out.println("I live in " + cityName);

    }
}