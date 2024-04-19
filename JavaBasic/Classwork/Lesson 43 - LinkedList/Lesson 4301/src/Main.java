import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //collection set список уникальных элементов. там нет одинаковых

        MyList<Integer> intList = new MyLinkedList<>();
        intList.add(10);
        intList.add(21);
        intList.add(9);
        intList.add(13);
        intList.add(8);

        for(int i=0; i< intList.size(); i++){
            System.out.println(intList.get(i));
        }

    }
}