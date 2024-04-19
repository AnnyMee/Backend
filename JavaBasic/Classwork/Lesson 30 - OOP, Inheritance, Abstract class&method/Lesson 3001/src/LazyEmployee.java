public class LazyEmployee extends Employee{  //-> выдаёт ошибку как только мы объявили метод work как абстрактный

    public LazyEmployee(String name, int salary){

        super(name,salary);
    }

    @Override
    public void work() {       //и для работы, необходимо создать данный метод в этом классе

    }
}
