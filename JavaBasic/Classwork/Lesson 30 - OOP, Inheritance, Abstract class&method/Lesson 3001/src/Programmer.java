////STEP 2: вводим extends - своего рода связь с Employee
public class Programmer extends Employee {          //перевод: Programmer это Employee, но с какими-то дополнительными свойствами
    ////STEP 4: тут были поля name и salary. Их полностью переместили в Employee
    ////вместо этого, STEP 5, мы делаем геттеры в классе Employee
    public Programmer(String name, int salary) {
        ////STEP 3: вводим super и удаляем this.name и this.salary
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Programmer: " + getName() + " (" + getSalary() +") ";
    }
    public void work(){                     //STEP 6: вывести данный метод напрямую в Main не выйдет. Идём в Employee
        System.out.println(getName() + ": I am a Programmer. I write code.");
    }
    ////todo STEP 1: тут был метол salary. его полностью переместили в Employee
}