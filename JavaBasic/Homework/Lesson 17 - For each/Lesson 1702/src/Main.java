/*
Есть метод, который отвечает за поиск индекса максимального элемента в массиве.
Он ничего не знает о том, что это за массив и зачем нужен максимальный элемент.
Есть второй метод - его задача получить два массива и найти прогульщика, для этого он может использовать первый метод.
Ну и еще, лучше если второй метод не просто будет печатать, но будет возвращать имя прогульщика.
*/
public class Main {
    public static void main(String[] args) {
        String[] nameOfStudents = {"Mariia", "Ivan", "Clarice", "Victoria", "Alejandro", "Vladimir"};
        int[] absentLessons = {2,0,6,5,8,7};

        System.out.println(printMaxAbsentee(nameOfStudents,absentLessons));
    }
    public static int indexOfMax(int[] array) {

        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static String printMaxAbsentee (String [] names, int[] lessons){

        String nameOfAbsentee = names[indexOfMax(lessons)];
        return nameOfAbsentee;
    }
}