public class Person {
    private String firstName;
    private String lastName;

    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
        return "\nFirst name: " + firstName + "\nLast name: " + lastName;
    }
    public String fullNameToString(){
        return String.join(" ",firstName,lastName);
    }
}
