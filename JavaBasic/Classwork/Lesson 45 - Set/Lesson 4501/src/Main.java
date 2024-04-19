import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> setInteger = new HashSet<>();     //Set это интерфейс. Элементы сета, расположены без индекса, к тому же, в сет нельзя расположить два одинаковых элемента

        setInteger.add(3);
        setInteger.add(5);
        setInteger.add(7);
        setInteger.add(7);
        setInteger.add(2);
        setInteger.add(3);
        setInteger.add(4);
        setInteger.add(19);
        System.out.println(setInteger);     //результат: [3, 5, 7]    новый результат: [2, 3, 19, 4, 5, 7] - порядок совершенно произвольный

        Set<Person> people = new HashSet<>();
                people.add(new Person("Jack"));
                people.add(new Person("John"));
                people.add(new Person("Jack"));
                people.add(new Person("Lena"));
                people.add(new Person("Nick"));
        System.out.println(people);

        for(Person p : people){     //единственный цикл, который напрямую работает с сет для перебора
            System.out.println(p);
        }

        Iterator<Person> iterator = people.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());        //ну или можно через итератор
        }
        //set идеальная структура для определения повторяющихся элементов

        List<Integer> integers = List.of(1,5,1,2,6,9,15,1,6,5,4);
        ArrayList<Integer> integers1 = new ArrayList<>(new HashSet<>(integers));
        System.out.println(integers1);

    }
}