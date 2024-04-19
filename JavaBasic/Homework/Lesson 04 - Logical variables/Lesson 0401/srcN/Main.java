import java.util.Scanner;

/*
Написать программу, которая спрашивает сколько сейчас градусов на улице,
и если меньше 3, тогда выводит на экран надпись "вы не можете ехать на летней резине",
иначе выводит надпись "можно ехать"
 */
public class Main {
    public static void main(String[] args) {

        int temperatureLimit = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert outside's temperature: ");
        int temperature = scanner.nextInt();

        boolean isTemperatureOk = temperature >= temperatureLimit;

        if(isTemperatureOk){
            System.out.println("Temperature is OK. Have a safe drive!");
        }else{
            System.out.println("The temperature outside is low. You can't drive on summer tires!");
        }
    }
}