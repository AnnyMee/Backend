public class Main {
    public static void main(String[] args) {
        int[] a = {10,18,19,1,87};
        String[] names = {"Damon", "Elena", "Stefan"};

        //объявление пустого массива на 10 элементов
        int[] array1 = new int[10];
        String[] strings1 = new String[7];

        printArray(array1);
        array1[3]=11;           //тут написано: позиции 3 в данном массиве, дай значение 11
        array1[7]=array1[3]+12; //тут написано: позиции 7 в данном массиве, дай значение позиции 3 + 12
        for (int i = 0; i<array1.length; i++){      //перебор элементов
            array1[i] = array1[i]+1;                //присвоение каждому элементу +1
        }

        printArray(array1);
    }
    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + "   ");
        }
        System.out.println();
    }
}