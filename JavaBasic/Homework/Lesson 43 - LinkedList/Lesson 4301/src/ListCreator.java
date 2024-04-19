import java.util.List;
import java.util.Random;

public class ListCreator {

    public static final int SIZE = 500000;
    public static final int MIN_VALUE = -100000;
    public static final int MAX_VALUE = 100000;
    public static final Random rnd = new Random();

    public static void fillIntegerList(List<Integer> list){

        for(int i=0; i<SIZE; i++){
            list.add(getRandomInteger(MIN_VALUE,MAX_VALUE));
        }
    }
    private static Integer getRandomInteger(int min, int max){
        return rnd.nextInt(max-min+1)+min;
    }
    public static void fillIntegerList(List<Integer> list,boolean flagAddToRandomPosition){

        if(!flagAddToRandomPosition){
            fillIntegerList(list);
            return;
        }
        list.add(getRandomInteger(MIN_VALUE,MAX_VALUE));

        for(int i=0; i<SIZE; i++){
            int listSize = list.size();
            int pos = getRandomInteger(0,list.size());  //[0....size]
            Integer value = getRandomInteger(MIN_VALUE,MAX_VALUE);
            if(pos==listSize) {
                list.add(value);
            }else{
                list.add(pos,value);
            }
        }
    }
}
