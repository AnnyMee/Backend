import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("str1");
        list.add("str2");
        list.add("hello1");
        list.add("jack");

        String str1 = list.get(2);
        System.out.println(str1);

        int indexStr2 = list.indexOf("st");
        System.out.println(indexStr2);

        System.out.println(list);
        list.set(0,"the first");        //это не сдвинет список, это заменит изначальный элемент этим. если мы хотим просто добавить, нужно использовать add().
        System.out.println(list);

        List<Person> listPerson = new LinkedList<>();

        listPerson.add(new Person("Jack",10));
        listPerson.add(new Person("Lena",6));
        listPerson.add(new Person("Olga",12));
        listPerson.add(new Person("Vlad",8));

        System.out.println(listPerson);

        int indexOlga = listPerson.indexOf(new Person("Olga",12));      // для сравнения необходимо создать equals и hashCode
        System.out.println(indexOlga);

        System.out.println(list);
        list.add("str2");
        list.add("str2");
        list.add("str2");
        list.add("qwe");
        System.out.println(list);
        //remove2(list,"str2");  //errors and exceptions. for each перебор не работает с удалениями в листах итд
        remove4(list,"str2");
        System.out.println(list);

        System.out.println("---------------------------------------------------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void remove1(List<String> list, String el){
        for(int i = 0; i< list.size(); i++){
            if(list.get(i).equals(el)){
                list.remove(i);
            }
        }
    }

    public static void remove2(List<String> list, String el){
        for(String str : list){
            if(str.equals(el)){
                list.remove(str);
            }
        }
    }
    public static void remove3(List<String> list, String el){
        List<String> newList = new ArrayList<>(2000);
        for(String str : list){
            if(!str.equals(el)){
                newList.add(str);
            }
        }
        list = newList;
    }

    public static void remove4(List<String> list, String el){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(el)){
                iterator.remove();
            }
        }
    }
}