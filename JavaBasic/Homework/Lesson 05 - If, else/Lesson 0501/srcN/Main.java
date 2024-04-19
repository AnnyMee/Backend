import java.util.Scanner;

/*
Допустим мы пишем программу для начисления штрафов. Исходные данные программы: ограничение скорости, реальная скорость машины. Необходимо реалтзовать следующую таблицу штрафов:

0 - 5 км/ч 0 евро предупреждение
6 - 20 км/ч 30 евро
21 - 40 км/ч 70 евро
41 - 100 км/ч 270 евро
100 > км/ч 1270 евро
Программа должна выводить информацию о штрафе или о его отсутствие
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert the speed limit: ");
        int speedLimit = scanner.nextInt();
        System.out.println("Please insert the your actual: ");
        int actualSpeed = scanner.nextInt();

        int speedLimitViolation = actualSpeed-speedLimit;

        int violationFine1 = 30;
        int violationFine2 = 70;
        int violationFine3 = 270;
        int violationFine4 = 1270;

        if(speedLimitViolation<=5){
            System.out.println("There were no speed violation. Please drive safely.");
        }
        if(speedLimitViolation>=6 && speedLimitViolation<=20){
            System.out.println("You have exceeded speed limit by " + speedLimitViolation + " km/h. Please proceed with paying " + violationFine1 + " euro fine.");
        }
        if(speedLimitViolation>=21 && speedLimitViolation<=40){
            System.out.println("You have exceeded speed limit by " + speedLimitViolation + " km/h. Please proceed with paying " + violationFine2 + " euro fine.");
        }
        if(speedLimitViolation>=41 && speedLimitViolation<=100){
            System.out.println("You have exceeded speed limit by " + speedLimitViolation + " km/h. Please proceed with paying " + violationFine3 + " euro fine.");
        }
        if (speedLimitViolation>100){
            System.out.println("You have exceeded speed limit by " + speedLimitViolation + " km/h. Please proceed with paying " + violationFine4 + " euro fine.");

        }
    }
}