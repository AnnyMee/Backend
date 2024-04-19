/*
Реализуйте метод String insertStr (String target, String source, int position).

- target целевая строка
- source вставляемая строка
- position позиция вставки
Метод должен возвращать новую строку, которая получена путем "вставки" строки source в строку target в позицию position.

- Если position больше длинны строки target тогда результат - простое объединение строк.
- Если position больше длинны строки target, то строка source вставляется в строку target в позицию position, а остаток строки target отзывается в конце

Примеры:

insertStr ("Hello", " world", 10) Результат: "Hello world"
insertStr ("Script", "Java", 0) Результат: "JavaScript"
insertStr ("I am busy", "not very ", 5) Результат: "I am not very busy"
Эту задачу можно решить двумя способами: используя substring и используя только цикл, length и charAt
 */

public class Main {
    public static void main(String[] args) {
        String completeSentence = insertStr("Script", " Java ", 8);
        System.out.println(completeSentence);                           //вывод на экран
    }

    public static String insertStr (String target, String source, int position){        //исходные данные

        if (position>target.length()){                      //первое условие
            return target + source;                         //первый вывод
        }else{                                                      //второе условие
            String targetPt1 = target.substring(0, position);       //выделяем кусочек слова до position (сам position исключен)
            String targetPt2 = target.substring(position);          //выделяем кусочек слова от position
            return targetPt1 + source + targetPt2;                  //второй вывод
        }
    }
}