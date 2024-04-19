public class Main {
    public static void main(String[] args) {
        int[][] arrayOfArrays = {               //массив из массивов
                {2,5,3,8,1,-5,10},
                {2,5,3,},
                {2,5,6,8,1,-5,10,},
                {2,2,3,891,1,-5,10,8,9,6,3,2,},
                {2,5,3,2,1,-5,10,}
        };

        // как обратиться: arrayOfArrays [0][1] -> обращение к первому элементу (в нулевом массиве в данном случае)
        //                                '-> обращение к первому массиву в списке

        int[] array = {2,5,3,8,1,-5,10};
        int[] array1 = {2,5,3,};
        int[] array2 = {2,5,6,8,1,-5,10,};
        int[] array3 = {2,2,3,891,1,-5,10,8,9,6,3,2,};
        int[] array4 = {2,5,3,2,1,-5,10,};

        printArray(array);
        System.out.println("------------------------");
        System.out.println("The minimum value is: " + printMinValue(array));
        System.out.println("The index of the minimum value is: " + printIndexOfMin(array));
    }
    public static int printMinValue(int[]array){            //находим минимальное значение
        int min = array[0];
        for (int i = 1; i < array.length; i++) {   //int i = 1 потому, что мы начинаем сравнивать первый элемент с нулевым, который мы уже объявили выше
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static void printArray(int[] array) {            //находим индекс элемента с минимальным значением
        for (int e : array) {
            System.out.println(e);
        }
    }
    public static int printIndexOfMin (int[] array){
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            //  значение нулевого элемента в массиве > значение итового элемента в массиве
            //            (элемента minIndex)
            if (array[minIndex]                      >        array[i]                    ){
                minIndex = i;
            }
        }
        return minIndex;
    }
}