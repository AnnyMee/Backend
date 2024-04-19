import java.util.function.BiConsumer;

public class BiConsumer1 implements BiConsumer<String,Integer> {
    @Override
    public void accept(String s, Integer integer) {
        System.out.println("key: " + s + ", value: " + integer );

    }
}
