import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("John",10);
        Person p2 = new Person("Jack",16);
        Person p3 = new Person("Sergey",8);
        Person p4 = new Person("Nick",11);
        Person p5 = new Person("Lena",5);
        Person p6 = new Person("Svetlana",15);

        List<String> listOfString = new ArrayList<>();      //это interface. ArrayList имплементирует interface List (ArrayList реализует все функции List)

        ArrayList<Person> people = new ArrayList<>();       //метод(класс) ArrayList вызывает массив (можно вызвать его просто написав List<>(interface)....
        people.add(p1);                                     //в этот массив можно добавлять объекты
        people.add(p2);
        people.add(p3);
        people.add(p4);
        System.out.println(people);

        System.out.println("-".repeat(150));

        for (Person p : people){
            System.out.println(p);
        }

        System.out.println("-".repeat(40));

        people.remove(1);                            //а так же удалять ранее добавленные объекты
        System.out.println(people);
                                                            /*а вообще у него много разных методов внутри:
                                                                people.add();
                                                                people.remove();
                                                                people.addAll();
                                                                people.clear();
                                                                people.clone();
                                                                people.contains();
                                                                и так далее..
                                                             */
        System.out.println(people.get(0));                  //выведи нулевой элемент

        for(int i = 0; i<people.size(); i++){               //перебираем все элементы массива
            System.out.println(people.get(i));
        }
    }
}