/*
Mетоды
Метод (method) – именованный блок кода, который может быть выполнен многократно.
Метод можно рассматривать как группу команд, у которой есть имя. Выполняется вся группа единым блоком – как одна сложная команда. Для того, что бы выполнить метод (еше говорят, вызвать метод) используется его имя.

Методы в том или ином виде есть почти во всех языках программирования. В разных языках то, что в Java называется метод, может называться функция, подпрограмма, процедура.

Метод может принимать параметры и возвращать результат заданного типа. Параметры - исходные данные для работы метода, например:

для расчета площади круга, необходимо знать радиус (радиус может быть параметром).
для расчета суммы 2х чисел, необходимо указать эти числа (два числа могут быть параметрами).
для определения времени года, необходимо указать месяц
Передавая в метод разные значения параметров, мы можем получить результат корректный для этих исходных данных (для круга заданного радиуса, для заданных чисел и т.д.)
Объявление метода
Для этого надо написать: имя метода и в скобках после него перечислить значения-параметры.

public static типРезультата имяМетода(int параметр1, String параметр2) {
  команды (тело метода);
}
Пример метода, который возвращает сумму 3 чисел int:

public static long getSum(int num1, int num2, int mum3)
{
  return num1+num2+num3;
}
Возвращемые значения
В методы можно не только передавать аргументы (параметры), функция еще может возвращать результат (значение) своей работы. Это делается с помощью ключевого слова return.

Тип возвращаемого значения обязательно указывается при описании метода перед именем метода. В примере ниже тип возвращаемого значения – int:

public static int min(int a, int b) {
  int result;
  if (a < b) {
    result = a;
  } else {
    result = b;
  }
  return result;
}
Некоторые функции просто что-то делают, но никаких значений не вычисляют и не возвращают, как наш метод main(), например. Для них придуман специальный тип результата – void – пустой тип.

Вспомни, как объявляется любая переменная – «тип и имя». А метод – «тип, имя и круглые скобки». А имя метода и затем круглые скобки – это вызов метода!

То есть было проще придумать «пустой тип», чем разделять функции на две категории – возвращающие значение и не возвращающие значение.

Оператор return
Когда Java-машина выполняет команду return, она вычисляет значение выражения, стоящего справа от слова return и тут же завершает работу метода, возвращая это значение в место вызова метода.

В методах, которые ничего не возвращают, команда return пишется без выражения после неё: return;, и просто завершает работу метода.

Важные замечания
название методов подчиняется тем же правилам, что и название переменных:
латинские символы
с маленькой буква
camelCase
имя должно быть осмысленным, "говорящим", отражать суть метода
т.к. метод это действие, чаще всего имя метода - глагол.
идеальный метод можно охарактеризовать одним действием, например: считает сумму, печатает название, определяет значение и т.д. Если ваш метод считает и печатает, запрашивает значение и рассчитывает и т.д с большой вероятностью, это должно быть несколько методов.
метод может не иметь параметров
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input day: ");
        int day = scanner.nextInt();

        System.out.println("Input month: ");
        int month = scanner.nextInt();

        System.out.println("Input year: ");
        int year = scanner.nextInt();

        //-------------------------------------------------

        boolean isYearOk = year > 0;
        boolean isMonthOk = month >= 1 && month <= 12;
        //int daysInMonth = getDaysInMonth(month, year); это можно заменить см. ниже
        boolean isDayOk = day >= 1 && day <= getDaysInMonth(month, year);
        boolean dateIsCorrect = isDayOk && isMonthOk && isYearOk;

        /*
        int days1 = getDaysInMonth(6, 1990);
        int days2 = getDaysInMonth(3, 2000);
        int days3 = getDaysInMonth(10, 1991);
         */

        String monthStr = getTitleOfMonth(month);

        //----------------------------------------

        if (dateIsCorrect) {
            System.out.println("The date is: ");
        } else {
            System.out.println("The input date is incorrect.");
        }
        System.out.println(day + "/" + month + "/" + year + "    " + dateIsCorrect);
    }

    public static int getDaysInMonth(int month, int year) {

        int daysInMonth = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        }
        if (month == 2) {
            boolean isYearLeap = (year % 400 == 0 || year % 100 != 0 && year % 4 == 0);
            if (isYearLeap) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
        }
        return daysInMonth;
    }

    public static String getTitleOfMonth(int month) {

        String monthStr = "";
        switch (month) {
            case 1: monthStr = "january";break;
            case 2: monthStr = "february";break;
            case 3: monthStr = "march";break;
            case 4: monthStr = "april";break;
            case 5: monthStr = "may";break;
            case 6: monthStr = "june";break;
            case 7: monthStr = "july";break;
            case 8: monthStr = "august";break;
            case 9: monthStr = "september";break;
            case 10: monthStr = "october";break;
            case 11: monthStr = "november";break;
            case 12: monthStr = "december";break;
        }
        return monthStr;
    }
}