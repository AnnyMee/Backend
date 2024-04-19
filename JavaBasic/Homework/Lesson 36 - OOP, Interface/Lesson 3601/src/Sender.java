import java.util.Scanner;
public class Sender{

        MailDeliveryService[] deliveryService;

    public static void send (MailDeliveryService[] service){
        for (MailDeliveryService el : service){
            el.sendMail();
        }
    }
    public static void startChatWithUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Как бы Вы хотели отправить почту?");
        System.out.println("Нажмите 1 для отправки через DHL");
        System.out.println("Нажмите 2 для отправки через электронную почту");
        System.out.println("Нажмите 3 для отправки экспресс-почтой голубей");

        int preferredDeliveryService = scanner.nextInt();

        if(preferredDeliveryService == 1){
            Sender.send(new MailDeliveryService[]{new DHL()});
        }else if(preferredDeliveryService == 2){
            Sender.send(new MailDeliveryService[]{new Email()});
        }else if(preferredDeliveryService == 3){
            Sender.send(new MailDeliveryService[]{new Pigeon()});
        }else{
            System.out.println("Пожалуйста, выберите из заданных вариантов");
        }
    }
}
