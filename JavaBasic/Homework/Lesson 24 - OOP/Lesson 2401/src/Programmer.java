public class Programmer {
    private Person person;
    private String[] listOfTechnologies;

    public Programmer(Person person, String[] listOfTechnologies){
        this.person = person;
        this.listOfTechnologies = listOfTechnologies;
    }
    public Programmer(Person person, String listOfTechnologies){
        this.person = person;
        this.listOfTechnologies = listOfTechnologies.split(", ");
    }
    public Programmer(String firstName, String lastName, String[]listOfTechnologies){
        this.person = new Person(firstName,lastName);
        this.listOfTechnologies = listOfTechnologies;
    }
    public Programmer(String fullName, String[] listOfTechnologies){
        String[] name = fullName.split(" ");
        String firstName = name[0];
        String lastName = name[1];
        this.person = new Person(firstName, lastName);
        this.listOfTechnologies = listOfTechnologies;
    }
    public String toString() {
        return "Name: " + person.fullNameToString() + "\nSkills: " + skillsToString();
    }
    public String skillsToString() {
        return String.join(", ", listOfTechnologies);
    }
    public boolean isSkilled (String skill){                    //метод для проверки наличия заданного скилла
        for(String skills : listOfTechnologies){
            if(skills.equals(skill)){
                return true;
            }
        }
        return false;
    }
}
