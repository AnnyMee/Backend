public class Owner {                                            //в рамках ДЗ в этом классе были созданы геттеры и сеттеры для каждой переменной
    private String firstName;
    private String lastName;
    private MyDate birthday;

    public Owner(String firstName, String lastName, MyDate birthday){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    public String toString(){
        return "\n Account owner name: " + firstName + " " + lastName + "\n Account owner DOB: " + birthday;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public MyDate getBirthday(){
        return birthday;
    }
    public void setBirthday(MyDate birthday){
        this.birthday = birthday;
    }
}
