import java.util.ArrayList;
import java.util.List;

public class Team <T extends Employee>{
    private Manager manager;
    List<T> employees;

    public Team(Manager manager) {
        this.manager = manager;
        this.employees = new ArrayList<>();
    }
    public void addEmployee(T employee) {
            employees.add(employee);
    }

    @Override
    public String toString() {
        return "Team " + manager +
                "\n employees:" + employees;
    }
}
