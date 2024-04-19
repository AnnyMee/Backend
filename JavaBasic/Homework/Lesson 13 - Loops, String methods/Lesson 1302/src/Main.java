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
    public static String printFirstName(String name){
        String firstName = "";

        for(int i=0; i< name.length(); i++){
            char current = name.charAt(i);
            if(current ==' '){
                break;
            }
            firstName += current;
        }
        return firstName;
    }
}