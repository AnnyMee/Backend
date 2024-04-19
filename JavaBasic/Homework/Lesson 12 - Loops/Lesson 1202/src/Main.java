/*
Реализовать метод String change(String str, char ch1, char ch2) который возвращает новую строку,
которая представляет из себя исходную строку, но все символы ch1 заменены на ch2.
Например:
change("1-2-3", '-','&') должен вернуть "1&2&3"
 */

public class Main {
    public static void main(String[] args) {
        String str = change ("82h-774-7772",'-','&');
        System.out.println(str);
    }
    public static String change(String str, char ch1, char ch2){
        String result = "";
        for(int i = 0; i < str.length(); i++ ){
            char currentChar = str.charAt(i);
            if (currentChar == ch1){
                currentChar = ch2;
            }
            result = result + currentChar;
        }
        return result;
    }
}