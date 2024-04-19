import java.util.ArrayList;
import java.util.List;

/*
Допустим у нас в программе есть класс Employee, и у него есть наследники Programmer, QAEngineer и Manager.
У класса Programmer есть 2 наследника BackEndProgrammer и FrontEndProgrammer.
Вам необходимо реализовать класс Team, который содержал бы в себе менеджера и список работников одной специализации,
т.е. например Programmer или QAEngineer или BackEndProgrammer или FrontEndProgrammer
Реализуйте метод добавления работника в команду.
Естественно, в команду Programmer не должно быть возможным добавить QAEngineer
 */
public class Main {
    public static void main(String[] args) {

        Team<QAEngineer> qaTeamList = new Team<>(new Manager("Alice"));
        qaTeamList.addEmployee(new QAEngineer("Mike"));
        qaTeamList.addEmployee(new QAEngineer("Lena"));
        Team<Programmer> programmerTeam = new Team<>(new Manager("Kay"));
        programmerTeam.addEmployee(new Programmer("Riley"));
        programmerTeam.addEmployee(new BackEndProgrammer("Koko"));
        programmerTeam.addEmployee(new FrontEndProgrammer("Miley"));

        System.out.println(qaTeamList);
        System.out.println(programmerTeam);

    }
}