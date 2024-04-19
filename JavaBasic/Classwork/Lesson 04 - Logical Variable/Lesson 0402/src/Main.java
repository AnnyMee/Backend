import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ageLimit = 18;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input age: ");
        int ageOfUser = scanner.nextInt();

        boolean isUserAdult = ageOfUser >= ageLimit;

        if (isUserAdult) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Access denied");
        }

        /*

        if ( условие/boolean ) {

            код, если условие true

        } else {

           код, если условие false

        }

        */

    }
}