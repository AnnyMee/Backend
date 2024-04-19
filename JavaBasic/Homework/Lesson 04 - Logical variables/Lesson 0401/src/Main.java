import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperatureLimit = 3;
        System.out.println("Please insert the temperature outside: ");
        int temperature = scanner.nextInt();
        boolean isTemperatureLow = temperature < temperatureLimit;
        if (isTemperatureLow) {
            System.out.println("It seems like it's too cold outside and you can't drive on summer tires.");
        } else {
            System.out.println("The temperature outside is nice today. Please drive safe!");
        }

    }
}