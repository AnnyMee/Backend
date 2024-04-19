import java.util.Scanner;

public class NumberConsole {

    public static void startChatWithUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какой список Вы бы хотели сгенерировать?");
        System.out.println("Нажмите 1 для генерирования тестового списка");
        System.out.println("Нажмите 2 для генерирования рандомного списка");
        System.out.println("Нажмите 3 для генерирования собственного списка");

        int preferredList = scanner.nextInt();

        if(preferredList == 1){
            ListManager.printConstantList();
        }else if(preferredList == 2){
            ListManager.printRandomList();
        }else if(preferredList == 3){
            ListManager.printListFromScanner();
        }else{
            System.out.println("Пожалуйста, выберите из заданных вариантов");
        }
    }
}
