/*
Реализовать метод, который возвращает первое слово в заданной строке
(в рамках данной задачи считаем, что слова отделены пробелом и в строке нет знаков препинания).
Например: "Олег Иванов", результат: "Олег"
 */

public class Main {
    public static void main(String[] args) {
        String firstName = printFirstName("Олег Иванов");
        System.out.println(firstName);

    }

    public static String printFirstName(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == ' ') {
                return name.substring(0, i);  // substring даёт кусок строки. между скобок стоит начало, конец
            }
        }
        return name;
    }


    public static String printFirstName2(String name){

        int indexOfSpace = indexOf(name,' ');
        return indexOfSpace>0 ? name.substring(0, indexOfSpace) : name;   // если indexOfSpace равен чемуто, дай мне это, либо дай всю строку

    }
    public static int indexOf(String name, char ch){
        for (int i=0; i<name.length(); i++){
            char currentChar = name.charAt(i);
            if (currentChar == ch){
                return i;
            }
        }
        return -1;
    }
}