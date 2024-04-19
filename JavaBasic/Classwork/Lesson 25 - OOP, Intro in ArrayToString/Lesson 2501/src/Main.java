public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jack","Johnson");
        Person person2 = new Person("Ivan", "Ivanov");

        String[] listOfTechnologies = new String[]{"Java", "Spring Boot", "SQL"};

        Programmer programmer = new Programmer(person1,listOfTechnologies);
        System.out.println(programmer);
        Programmer programmer2 = new Programmer(person2, "Java, Spring, Boot, SQL");
        System.out.println(programmer2);
        Programmer programmer3 = new Programmer("Jane","Johnson",listOfTechnologies);
        System.out.println(programmer3);
        Programmer programmer4 = new Programmer("Mary Owen", listOfTechnologies);
        System.out.println(programmer4);
        Programmer[] programmers = new Programmer[]{programmer,programmer2,programmer3,programmer4};

        for(Programmer prog : programmers){
            System.out.println(prog);
        }
        printByName(programmers, "Jane");
        System.out.println("-".repeat(40));
        printByTech(programmers,"Java");
    }
    public static void printByName(Programmer[] programmers, String name){
        for(Programmer prog : programmers) {
            if (prog.getPerson().getFirstName().equals(name)) {
                System.out.println(prog);
            }
        }
    }
    public static void printByTech(Programmer[] programmers, String tech){
        for(Programmer prog : programmers) {
            if (prog.isSkilled(tech)) {
                System.out.println(prog);
            }
        }
    }
}