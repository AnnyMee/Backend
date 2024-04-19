public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5,};
        String[] arr1 = {"1a", "2b", "3c", "4d", "5e",};

        //for-each -> этот цикл будет работать столько раз, сколько у нас элементов в массиве
        // for-each -> умеет только перебор в "прямом" порядке
        // сложно и не удобно работать с индексами элементов
        // нельзя перебирать в обратном порядке или начиная с...
        // сравнит только каждый элемент данного массива, то есть два массива сравнить не получится
        for (int element : arr) {
            System.out.print(element + " ");
        }       //равно
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
        }
        System.out.println();
        System.out.print("i++     ");
        int i = 0;
        for (String str : arr1) {
            System.out.print(i++ + "." + str + " "); //если поставить ++i, то вывод будет другим. Индекс начнёт считаться не с 0 а с 1

        }
        System.out.println();
        System.out.print("++i     ");
        i = 0;
        for (String str : arr1) {
            System.out.print(++i + "." + str + " ");
        }
    }
}