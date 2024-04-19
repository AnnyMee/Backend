/*
Реализовать метод String substring(String str, int index) который возвращает строку - часть исходной строки,
начиная с символа сНапример:
substring("hello Java world", 6) должен вернуть "Java world"
 */

public class Main {
    public static void main(String[] args) {
        String str = "Hello Java world!";
        int index = 6;
        System.out.println(substring(str, index));
        //demo();


    }

    /*
    -перебрать все символы от позиции index и до конца строки
    - каждый символ прибавить к строке-результату
    "01234"
     */
    public static String substring(String str, int index) {
        String result = "";
        for (int i = index; i < str.length(); i++) {             //i [0,5]
            result += str.charAt(i);        //result = result + str.charAt(i); индексом index и до конца строки.

        }
        return result;
    }
/*
    public static void demo(){
        //String str = "0123456789";
        String str = "qwertyui";
        System.out.println(str.length());               //str.lenght считает сколько символов в строке (то есть в Strign str)
        int len = str.length();
        System.out.println("Строка: " + str);
        System.out.println("количество символов в строке: " + str.length());
        System.out.println("Первый символ в строке: '" + str.charAt(0) + "'     str.charAt(0) ");
        System.out.println("Индекс последнего символа в строке: " + (str.length()-1) + "     (str.length()-1)");
        System.out.println("Последний символ в строке: " + str.charAt(str.length()-1) + "     str.charAt(str.length()-1)");


       char  ch = str.charAt(str.length());           //str.charAt выдаёт символ порядок которого мы указываем. он начинает считать с нуля
       System.out.println("символ: '" + ch + "'");

        for (int i = 0; i<str.length(); i++){

        }

    }
*/

}