/*
Теория:
https://javarush.com/groups/posts/massivy-java
 */
public class Main {
    public static void main(String[] args) {                //Массив (array) это набор однотипных элементов

        int[] arr = {2,4,1,-1};             //instead of  int a1 = 10; int a2 = 20; int a3 = 323;
        String[] users = {"Jack", "Nick", "Elena"};             //instead of String user1 = "Jack"; String user2 = "Nick"; String user3 =
        double[] numbers = {3.3, 3.5, 6.0, 7.1, };

        //обращение к элементу массиву
        System.out.println(users[0]); //Jack, это имя находится в позиции 0 --> тут считалочка тоже с нуля начинается
        System.out.println(arr[2]); //1, единица находится в позиции 2
        System.out.println(users[0+2]); //Elena --> потому что оно не может выводить через "+". Если хотим вывести два элемента:
        int index = 2;
        System.out.println(users[0] + " " + users[index]); //или users[0] + users[2]

        //перебор

        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        for (int i = 0; i<users.length; i++){
            System.out.println(users[i]);
        }
        System.out.println("asdf\nwer\nty"); // ещё один способ переместить курсор ниже
        System.out.println();               //так пропускаем курсор ниже

        users[0] = users[0] + "'s";         //это как можно изменить все элементы массива

        for (int i = 0; i<users.length; i++) {
            System.out.println(users[i]);
        }
        System.out.println(arraySum(numbers));
    }
    public static double arraySum(double[] array){  //как посчитать сумму элементов массива
        double result = 0;
        for (int i=0; i<array.length; i++){
            result += array[i];
        }
        return result;
    }
}