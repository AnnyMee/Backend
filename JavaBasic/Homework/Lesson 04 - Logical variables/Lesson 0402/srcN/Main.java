import java.util.Scanner;

/*
Напишите программу, которая просит пользователя ввести 2 целых числа.
Первое означает ограничение скорости,
второе - скорость с которой ехал автомобиль.
Если реальная скорость превышает лимит более чем на 10 километров,
программа должна выводить фразу “вы превысили скорость на …. километров. Оплатите штраф.
Если скорость не превышена, или превышение менее 10 километров - “нарушение отсутствует”
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert the speed limit: ");
        int speedLimit = scanner.nextInt();
        System.out.println("Please insert the your actual: ");
        int actualSpeed = scanner.nextInt();

        int speedLimitAllowance = 10;
        boolean speeding = actualSpeed > speedLimit + speedLimitAllowance;
        int speedLimitViolation = actualSpeed-speedLimit;

        if(speeding){
            System.out.println("You were speeding " + speedLimitViolation + " km. Please pay the fine.");
        }else{
            System.out.println("There were no speed violation.");
        }
    }
}