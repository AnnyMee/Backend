/*
Создайте программу для проверки пароля, введенного пользователем.
Пароль считается валидным, если он не короче 8 символов и содержит хотя бы одну цифру.
Естественно, используйте цикл и charAt для анализа каждого символа пароля.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your password: ");
        String password = scanner.nextLine();

        int check1 = numberCheck(password);
        int check2 = lengthCheck(password);

        if (check1 > 0 && check2 > 7) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password invalid. Your password needs at least 8 characters and at least one number.");
        }
    }
    public static int lengthCheck(String password){
        //password = passwordCollect();
        if(password.length()>=8){
            return password.length();
        }
        return password.length();
    }
    public static int numberCheck(String password) {

        int counterOfNumbers = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= '0' && ch <='9') {
                counterOfNumbers++;
            }
        }
        return counterOfNumbers;
    }
}