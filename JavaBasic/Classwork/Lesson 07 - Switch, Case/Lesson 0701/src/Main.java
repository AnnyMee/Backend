/*
switch-case
Развилка на три варианта в коде может выглядеть вот так:

if (turn_left) {
  System.out.println(«Коня потеряешь»);
} else if (turn_right) {
  System.out.println(“Знания обретёшь”);
} else {
  System.out.println(“Так и будешь стоять?”);
}
Но если вариантов больше, то удобнее использовать оператор switch-case.

switch (ВыражениеДляВыбора) {
  case  (Значение1):
    Команды1;
    break;
  case (Значение2):
    Команды2;
    break;
  ...
  case (ЗначениеN):
    КомандыN;
    break;
  default:
    КомандыПоУмолчанию;
    break;
}
Порядок выполнения в операторе следующий:

Вычисляется ВыражениеДляВыбора. Далее оператор switch сравнивает полученное выражение с очередным Значением (в порядке перечисления).
Если ВыражениеДляВыбора совпало со Значением, то выполняется код, идущий после двоеточия.
выполняется код, идущий после двоеточия
выполняются весь последующий код, даже относящийся к другим блокам case.
если встречается конструкция break — то управление передается за пределы команды switch.
Если совпадений ВыражениеДляВыбора и Значений не выявлено, то управление передаётся коду, записанному в КомандахПоУмолчанию.
Важные моменты
Тип ВыраженияДляВыбора для оператора выбора switch в Java должен быть одним из следующих:
целые числа ( byte, short, char, int).
String (начиная с Java 7).
Блок default — необязательный, тогда в случае отсутствия совпадений ВыраженияДляВыбора и Значений не будет выполнено никаких действий.
break не является обязательным, если его нет – код продолжит выполнение (игнорируя дальнейшие сравнения значений в блоках case) до первого встреченного break или до конца оператора switch.
если необходимо выполнять один и тот же код для нескольких вариантов выбора, для исключения дублирования перед ним указываем несколько соответствующих значений в подряд идущих блоках case.
Пример
String day = "Thursday";

switch (day) {
  case "Monday":
     System.out.println("Понедельник");
     break;
  case "Thursday":
     System.out.println("Вторник");
     break;
  case "Wednesday":
     System.out.println("Среда");
     break;
  default:
     System.out.println("Упс, таких дней еще не знаю !");
     break;
}
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert month: ");
        String monthTitle = scanner.nextLine();

        int monthNumber = 0;

        /*
        monthTitle.equals("January")    ==
        !monthTitle.equals("January")   !=
         */

        if (monthTitle.equals("January")) {
            monthNumber = 1;
        }else if (monthTitle.equals("February")) {
            monthNumber = 2;
        }else if (monthTitle.equals("March")) {
            monthNumber = 3;
        }else if (monthTitle.equals("April")) {
            monthNumber = 4;
        }else if (monthTitle.equals("May")) {
            monthNumber = 5;
        }else if (monthTitle.equals("June")) {
            monthNumber = 6;
        }else if (monthTitle.equals("July")) {
            monthNumber = 7;
        }else if (monthTitle.equals("August")) {
            monthNumber = 8;
        }else if (monthTitle.equals("September")) {
            monthNumber = 9;
        }else if (monthTitle.equals("October")) {
            monthNumber = 10;
        }else if (monthTitle.equals("November")) {
            monthNumber = 11;
        }else if (monthTitle.equals("December")) {
            monthNumber = 12;
        }

        if (monthNumber == 0) {
            System.out.println(monthTitle + " - unknown month");
        }else {
            System.out.println(monthTitle + " - month number " + monthNumber);
        }

    }
}