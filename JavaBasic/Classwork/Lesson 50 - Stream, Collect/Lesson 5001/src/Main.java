import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Client> clients = List.of(
                new Client("Jack",List.of(new BankAccount("1",1))),
                new Client("Nick",List.of(new BankAccount("2",1),new BankAccount("3",1))),
                new Client("John",List.of(new BankAccount("4",1),new BankAccount("5",1),new BankAccount("6",1))),
                new Client("Olga",List.of(new BankAccount("7",1),new BankAccount("8",1)))
        );
        System.out.println(clients);

        clients.stream()
                .flatMap(client -> client.getAccounts().stream())   //flatMap позволяет получить стрим в стриме. он требует элемент и выводит стрим из элементов
                .skip(2)        //пропускает первые 2 элемента
                .limit(3)  //лимит из 3х элементов
                .collect(Collectors.toList());


    }


}