import java.util.List;

public class IntegerListUtil {

    public static int getMaxValue(List<Integer> numbers){
        int maxNumber = Integer.MIN_VALUE;      //константное значение в Integer (-2147483648)
        for(int num : numbers) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        return maxNumber;
    }
    public static int getMinValue(List<Integer> numbers){
        int minNumber = Integer.MAX_VALUE;      //константное значение в Integer (2147483648)
        for(int num : numbers) {
            if (num < minNumber) {
                minNumber = num;
            }
        }
        return minNumber;
    }
    public static long getSum(List<Integer> numbers){
        long sum = 0;
        for(Integer num : numbers){
            sum = sum + num;
        }
        return sum;
    }
}
