import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the speed limit in your area: ");
        int speedLimit = scanner.nextInt();
        System.out.println("Please insert the speed you were driving at: ");
        int actualSpeed = scanner.nextInt();

        // исходный код остался тем же
        int exceededSpeed = actualSpeed-speedLimit; //создала новую переменную, чтобы легче писалось далее при её использовании

        int finePrice1 = 30;                        //создала отдельные переменные на суммы штрафов
        int finePrice2 = 70;
        int finePrice3 = 270;
        int finePrice4 = 1270;


        if (exceededSpeed<=5){                      //условие если превышение скорости до 5 км в час
            System.out.println("There were no speed violation. Please follow traffic rules.");
        }
        if (exceededSpeed>=6 && exceededSpeed<=20){ //условие если превышение от 6 до 20 км в час
            System.out.println("You have exceeded the speed limit by " + (actualSpeed-speedLimit) + " km/h! Please proceed with paying " + finePrice1 + " euro fine.");
        }
        if (exceededSpeed>=21 && exceededSpeed<=40){ //условие если превышение от 21 до 40 км в час
            System.out.println("You have exceeded the speed limit by " + (actualSpeed-speedLimit) + " km/h! Please proceed with paying " + finePrice2 + " euro fine.");
        }
        if (exceededSpeed>=41 && exceededSpeed<=100){ //условие если превышение от 41 до 100 км в час
            System.out.println("You have exceeded the speed limit by " + (actualSpeed-speedLimit) + " km/h! Please proceed with paying " + finePrice3 + " euro fine.");
        }
        if (exceededSpeed>100){                     //условие если превышение выше 100 км в час
            System.out.println("You have exceeded the speed limit by " + (actualSpeed-speedLimit) + " km/h! Please proceed with paying " + finePrice4 + " euro fine.");
        }                                           //посчитала что использование else здесь бесполезно, по скольку все случаи о превышении от 0 были описаны оператором if

    }
}