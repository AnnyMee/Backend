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


        /*
        String str = "";
        for (int i=0; i<16; i++){                                               for(str=""; str.length()<16; str+="*";
            str+="*";                               "*".repeat(16);             System.out.println(str);
        }
         */

        Accounts accounts = new Accounts(arr);
        accounts.isSecure = true;           //включение (true)/выключение (false) безопасного режима

        System.out.println(accounts);         //---->        вроде выводить на экран всю информацию о счетах в задании не сказано, но это чисто для проверки
        System.out.println("-".repeat(60));

        accounts.checkLowBalance(500);
        System.out.println("-".repeat(60));

        System.out.println("The total of all accounts' balance for now is: " + accounts.getSumOfAllAccount());
        System.out.println("-".repeat(60));

        //new lesson
        Account account = new Account(ownerInfo[0], "DE18524697821364587296", 789.56, dates[4]);
        System.out.println(account);
        account.setBalance(-100);
        System.out.println(account);
        account.iban = "qwerty";
        System.out.println(account);
    }
}