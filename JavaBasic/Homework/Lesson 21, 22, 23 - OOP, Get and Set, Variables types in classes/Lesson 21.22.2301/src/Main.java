/*
Во вчерашней задаче про Accounts, необходимо сделать следующее:
реализовать печать всех счетов в "безопасном" виде, т.е. вместо номера счета должно выводить первые 4 символа и последние 2 символа, между ними строка из *.
Например:
Счет
Owner: Иван1 Иванов1 (10/10/2010) iban: DE181917161 balance: 10000.0. End of contract: 1/1/2025
выводим как:
Owner: Иван1 Иванов1 (10/10/2010) iban: DE18*****61 balance: 10000.0. End of contract: 1/1/2025
                                            ++++Урок 22++++
В задаче про Accounts, необходимо добавить модификаторы доступа (public, private) к полям классов и к методам.
Соответственно, необходимо сделать методы доступа к полям (геттеры, сеттеры).
Подумайте, где какие нужны.
 */
public class Main {
    public static void main(String[] args) {
        //region Dates
        MyDate[] dates = {new MyDate(26,4,1988),
                new MyDate(15,6,1979),
                new MyDate(8,12,1996),
                new MyDate(29,10,1999),
                new MyDate(17,9,2025),
                new MyDate(6,12,2027),
                new MyDate(28,3,2027),
                new MyDate(13,2,2025)};
        //endregion
        //region OwnerInfo
        Owner[] ownerInfo ={new Owner("Mark","Owen",dates[0]),
                new Owner("Arina", "Faust", dates[1]),
                new Owner("Arnold", "Czech", dates[2]),
                new Owner("Maria", "Bogdan", dates[3])};
        //endregion
        Account[] arr = {new Account(ownerInfo[0], "DE18524697821364587296", 789.56, dates[4]),
                new Account(ownerInfo[1], "DE18456978236548912236", 1207.83, dates[5]),
                new Account(ownerInfo[2], "DE19225669887463512563",28.04, dates[6]),
                new Account(ownerInfo[3], "DE19555877003246153265", 15.56, dates[7])};


        Accounts accounts = new Accounts(arr);
        accounts.setSecure(true);                          //отсюда можно легко переключать на true(со *) и false (без *)

        /*
        MyDate endOfCon = new MyDate(26,4,1988);
        System.out.println(endOfCon.getDay());
        Owner client = new Owner("Markus","Bock",dates[0]);
        client.getLastName();
        client.setBirthday(new MyDate(8,7,2003));
        System.out.println(client);
        System.out.println(client.getFirstName());
        MyDate date10 = new MyDate(18,12,2003);
        System.out.println(date10);
        */
        System.out.println(accounts);
        accounts.checkLowBalance(500);
        System.out.println("The total of all accounts' balance for now is: " + accounts.getSumOfAllAccount());

    }
}