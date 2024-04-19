public class Owner {
    String firstName;
    String lastName;
    MyDate birthday;

    public Owner(String firstName, String lastName, MyDate birthday){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    public String toString(){
        return "\n Account owner name: " + firstName + " " + lastName + "\n Account owner DOB: " + birthday;
    }
}
