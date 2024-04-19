import java.util.Scanner;
/*
Допустим, у вас есть прибор, у которого есть 2 колбы.
Каждая колба имеет датчик температуры (в программе температура задается переменными).
Считается, что прибор работает правильно, если температура в каждой из колб (в любой из может в первой, а может во второй !)
меньше 100 а в другой более 200 градусов. Напишите программу проверки корректности работы такого прибора.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert temperature in flask 1: ");
        int temperatureFlask1 = scanner.nextInt();
        System.out.println("Please insert temperature in flask 2: ");
        int temperatureFlask2 = scanner.nextInt();

        if((temperatureFlask1<100 && temperatureFlask2>200) || (temperatureFlask2<100 && temperatureFlask1>200)){
            System.out.println("Temperature in flask 1 is " + temperatureFlask1 + "C and temperature in flask 2 is " + temperatureFlask2 + "C. The device works properly.");
        }else{
            System.out.println("There is a problem. Please check temperature in the flasks as device doesn't work properly");
        }
    }
}