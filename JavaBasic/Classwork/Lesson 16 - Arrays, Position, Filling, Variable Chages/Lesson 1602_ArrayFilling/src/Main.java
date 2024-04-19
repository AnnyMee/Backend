public class Main {
    public static void main(String[] args){
        int[] arr = new int[10];        //создаём массив и после = объявляем сколько элементов будет в этом массиве

        fillArray(arr, 2);
        printArray(arr);

        int[] arr2 = new int[5];
        fillArray(arr2, 1000);
        printArray(arr2);

    }

    //      [ 2 , 4 , _ , _ , _ ]   n=2     [2, 4, 6, 8, 10]
    public static int[] fillArray(int[] array, int n){          //создаём метод для заполнения массива

        for (int i=0; i<array.length; i++){                     //перебираем массив
            array[i]=n;                                         //обозначаем начало, с какого номера начинаем считать
            n=n+2;                                              //просим прибавлять к числу +2 (и по скольку это цикл.....)
        }
        return array;                                           //возвращаем массив (уже заполненый)
    }
    public static void printArray(int[] array){                 //создаём метод для вывода на экран (void)
        for (int i=0; i<array.length; i++){                     //перебираем элементы массива
            System.out.print(array[i] + "   ");                 //выводим элемент по одному + space
        }
        System.out.println();                                   //эта строка отправляет курсор с новой строки (println), ведь предыдущая строка выводила всё в один ряд (print)
    }
}