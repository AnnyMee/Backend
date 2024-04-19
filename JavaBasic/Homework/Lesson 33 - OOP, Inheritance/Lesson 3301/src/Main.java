/*
Допустим, у вас есть класс Account со следующими полями String IBAN, double balance, Person client.
Person имеет следующие поля: String firstName, String lastName.
Вам дан массив из Account.
Вам необходимо реализовать метод findAccountsByPerson,
который принимает объект Person и выводит на экран все Account принадлежащие данному пользователю.
 */
public class Main {
    public static void main(String[] args) {
        Account[] accounts = {new Account(new Person("Jack", "Johnson"), "DE56245879652314256887", 2056.14),
                new Account(new Person("Jack", "Johnson"), "DE56245879652314245136", 5683.56),
                new Account(new Person("Mila", "Gonta"), "DE23230012556982000042", 562.02),
                new Account(new Person("Sara", "Ludvin"), "DE10012546352265489902", 35.18),
                new Account(new Person("Sara", "Ludvin"), "DE12236652420002356982", 7225.98)};


        findAccountsByPerson(accounts,new Person("Jack", "Johnson"));
        System.out.println(isIbanPresent(accounts,new Account(new Person("Mila", "Gonta"), "DE23230012556982000042", 562.02)));
    }
    public static void findAccountsByPerson (Account[] accounts, Person person){
        for (Account account : accounts) {
            if (account.getClient().equals(person)) {
                System.out.println(account);
            }
        }
    }
    public static boolean isIbanPresent(Account[] accounts, Account acc){
        for (Account account : accounts){
            if(account.equals(acc)){
                return true;
            }
        }
        return false;
    }
}
//STATIC: те методы или поля помеченные словом static они относятся к классу и соответственно не требуют наличия объекта