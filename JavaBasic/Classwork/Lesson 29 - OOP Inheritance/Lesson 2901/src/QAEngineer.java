////STEP 2: вводим extends - своего рода связь с Employee
public class QAEngineer extends Employee {          //перевод: QAEngineer это Employee, но с какими-то дополнительными свойствами
    ////STEP 4: тут были поля name и salary. Их полностью переместили в Employee
    ////вместо этого, STEP 5, мы делаем геттеры в классе Employee
    public QAEngineer(String name, int salary) {
        ////STEP 3: вводим super и удаляем this.name и this.salary
        super(name, salary);
    }

    @Override
    public String toString() {
        return "QA Engineer: " + getName() + " (" + getSalary() +") ";
    }
    public void work(){                     //STEP 6: вывести данный метод напрямую в Main не выйдет. Идём в Employee
        System.out.println(getName() + ": I am a QA Engineer. I check software.");
    }
    ////todo STEP 1: тут был метол salary. его полностью переместили в Employee
}
