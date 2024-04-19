public class Account {
    Owner owner;
    String iban;
    double balance;
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
}