public class Employee {
    private String name;
    private int experience;

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return name + " (" + experience + ") ";
    }

    public int getExperience() {
        return experience;
    }
}
