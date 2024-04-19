public class Account {                                          //в рамках ДЗ в этом классе были созданы геттеры для каждой переменной и сеттер только для баланса
    private Owner owner;
    private String iban;
    private double balance;
    private MyDate dateOfContractEnd;

    public Account(Owner owner, String iban, double balance, MyDate dateOfContractEnd){
        this.owner = owner;
        this.iban = iban;
        this.balance = balance;
        this.dateOfContractEnd = dateOfContractEnd;
    }
    public Owner getOwner(){
        return owner;
    }
    public String getIban (){
        return iban;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if (balance>=0){
            this.balance = balance;
        }
    }
    public MyDate getDateOfContractEnd(){
        return dateOfContractEnd;
    }
    public String toString(){
        return "Owner personal information  " + owner + "\n IBAN: " + iban + "\n Remaining balance: " + balance + "\n Date of contract expiration: " + dateOfContractEnd;
    }
    public String toSecureModeString(){                                             //метод такой же как toString, но уже с secured IBAN
        return "Owner personal information  " + owner + "\n IBAN: " + (iban.length()>6 ? secureIban() : iban) + "\n Remaining balance: " + balance + "\n Date of contract expiration: " + dateOfContractEnd;
    }
    private String secureIban(){                                                     //создаю метод, который заменит часть строки на звездочки
        return iban.substring(0,4) + "*".repeat(iban.length()-6) + iban.substring(iban.length()-2);
    }
}
