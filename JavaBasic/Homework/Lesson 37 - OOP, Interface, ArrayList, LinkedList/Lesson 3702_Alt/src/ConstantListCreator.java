import java.util.ArrayList;
import java.util.List;

public class ConstantListCreator implements IntegerListCreator{

    private static final int[] DATA= {1,7,7,2,3};

    public List<Integer> create(){
        List<Integer> constantNumbers = new ArrayList<>();

        for(int i : DATA){
            constantNumbers.add(i);
        }
        return constantNumbers;
    }
}
