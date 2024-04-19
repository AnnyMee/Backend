public class QAEngineer extends Employee{

    public QAEngineer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "QAEngineer " + getName();
    }
}
