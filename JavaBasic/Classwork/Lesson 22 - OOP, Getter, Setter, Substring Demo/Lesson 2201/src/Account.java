public class Account {
    Owner owner;
    String iban;
    private double balance;         //private по сути скрывает эту переменную для других классов. Данная переменная может быть изменена только из своего оригинального класса
    MyDate dateOfContractEnd;

    public Account(Owner owner, String iban, double balance, MyDate dateOfContractEnd){
        this.owner = owner;
        this.iban = iban;
        this.balance = balance;
        this.dateOfContractEnd = dateOfContractEnd;
    }
    public String toString(){
        return "Owner personal information  " + owner + "\n IBAN: " + iban + "\n Remaining balance: " + balance + "\n Date of contract expiration: " + dateOfContractEnd;
    }
    public String toSafeModeString(){
        return "Owner personal information  " + owner +
                "\n IBAN: " + (iban.length()>6 ? secureIban2() : iban) +
                "\n Remaining balance: " + balance +
                "\n Date of contract expiration: " + dateOfContractEnd;
    }
    public String secureIban(){
        String result = "";
        for (int i = 0; i< iban.length(); i++){
            if(i<4 || i>iban.length()-3) {
                char ch = iban.charAt(i);
                result = result + ch;
            }else{
                result = result + "*";
            }
        }
        return result;
    }
    public String secureIban2(){                //substring method
        return iban.substring(0,4) + "*".repeat(iban.length()-6) + iban.substring(iban.length()-2);
    }

    //new lesson get и set - методы доступа к полям (ну, к примеру если поле стоит как private, как мы сделали выше)
    public void setBalance(double balance){         //метод, который отвечает за безопасность ошибок
        if(balance >= 0){                           //если "случайно" кто-то введёт новый баланс с минусом, на экран выйдет настоящий баланс
            this.balance = balance;
        }
    }
    public double getBalance(){                 //теперь везде где стоял balance меняем на getBalance
        return balance;
    }

}
