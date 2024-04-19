public class Main {
    public static void main(String[] args) {
        String str = "Hello Java world!";
        int index = 6;
        demo();
    }

    public static void demo() {
        //String str = "0123456789";
        String str = "qwertyui";
        System.out.println(str.length());               //length считает сколько символов в строке (то есть в String str)
        System.out.println("Строка: " + str);
        System.out.println("количество символов в строке: " + str.length());

        System.out.println("Первый символ в строке: '" + str.charAt(0) + "'     str.charAt(0) ");       //charAt считает порядковый номер символа
        System.out.println("Индекс последнего символа в строке: " + (str.length() - 1) + "     (str.length()-1)");      //-1 стоит для того, чтобы подстроится под чар, ведь чар начинает считать с 0
        System.out.println("Последний символ в строке: " + str.charAt(str.length() - 1) + "     str.charAt(str.length()-1)");
        String str1 = str.substring(4);
        System.out.println("Начиная с четвертого символа строки: " + str1);
        String str2 = str.substring(4,6);
        System.out.println("Начиная с четвертого и заканчивая шестым символом: " + str2);

    }
}
