import java.util.List;

/*
1.
Давайте реализуем утилитарный класс, для работы со списком (List) целых чисел. Вам нужно реализовать несколько [статических] методов:
поиск наибольшего числа
поиск наименьшего числа
поиск суммы чисел
Естественно, каждый из методов должен получать в качестве параметра List<Integer>

2.
В вашей программе должно быть предусмотрено несколько способов получения данных ну т.е. того самого List<Integer>:
возможность получить список со Scanner
возможность получить случайный список
возможность получить список заданный константно в программе, например [1,7,7,2,3].
Этот вариант актуален для проверки корректности работы методов из первой задачи на известных данных.

Подсказка: вспомните про проект с доставкой почты. Подумайте, как лучше организовать код так,
чтобы способ получения List’а можно было бы легко менять, не затрагивая функционал обработки.
*/
public class Main {
    public static void main(String[] args) {

        //IntegerListCreator integerListCreator = new ConstantListCreator();
        //IntegerListCreator integerListCreator = new ScannerListCreator();
        IntegerListCreator integerListCreator = new RandomListCreator(10,-5,5);
        List<Integer> list = integerListCreator.create();

        //----------------------

        int maxValue = IntegerListUtil.getMaxValue(list);
        int minValue = IntegerListUtil.getMinValue(list);
        long sumValue = IntegerListUtil.getSum(list);

        System.out.println("Max value: " + maxValue);
        System.out.println("Min value: " + minValue);
        System.out.println("Sum: " + sumValue);


    }
}