/*
Lesson 02
        01. Компиляция пронраммы
        Компиляция программы - это процесс преобразования исходного кода программы, написанного на высокоуровневом языке программирования (например Java), в машинный код или байт код, который может быть выполнен компьютером. Во время компиляции компилятор анализирует исходный код, проверяет его на синтаксические ошибки и преобразует его в набор инструкций, понятных компютеру или, в случае Java, понятных JVM.

        Противоположностью компиляции является интерпретация, когда исходный код выполняется построчно интерпретатором, без предварительной компиляции в машинный код.

        JVM (Java Virtual Machine) - это виртуальная машина, которая является ключевой компонентой технологии Java. Она предназначена для выполнения программ, написанных на языке программирования Java и на некоторых других языках. JVM обеспечивает абстрактное исполнение Java-кода, что позволяет однажды написанной Java-программе выполняться на различных платформах без необходимости переписывать ее под каждую конкретную операционную систему ("write once, run anywhere").

        02. Java. Вывод на экран
        Для вывода строки на экран в Java используется инструкция:

        System.out.println("Hello, World");
        В этом примере мы выводим текст Hello, World на экран

        System.out.println(3+4);
        В этом примере мы выводим число 7 т.е. результат подсчета выражения 3+4. Обратите внимание на отсутствие ковычек.

        03. Переменные
        Переменные - именованные места в памяти, в которых можно хранить данные. Переменная похоже на коробку, в которую можно положить значение и, при необходимости воспользоваться им. Каждая переменная имеет тип данных, который определяет, какие виды значений могут быть в ней сохранены, имя и значение. Например:

        String nameOfUser = "Jack";
        объявили переменную с именем nameOfUser типа String и присвоили ей значение "Jack". Это означает, что вы можете использовать эту переменную для хранения и работы с именем пользователя в вашей программе.

        Переменные позволяют программам сохранять и оперировать данными, делая их более гибкими и полезными. При использовании переменных важно выбирать понятные и описательные имена, чтобы код был легко читаемым и понимаемым другими разработчиками.
 */

public class Main {

    public static void main(String[] args) {


        System.out.println("my name is Andrey");
        System.out.println("hello world!");
        System.out.println("Hello from Java world!");
        System.out.println("text to print");

        System.out.println(2+10-19);
        System.out.println("2+10+19");
        System.out.println("hello" +"!" + " world");

        System.out.println(54-(20+6)*2-23);


        String str = "John";
        String nameOfUserWithRoleAdministrator ="Jack";
        System.out.println(str);
        System.out.println(str + str + str);
        String delimiter = "       ";
        String aka = "2+2";
        System.out.println(str+delimiter+str+delimiter+str + delimiter + nameOfUserWithRoleAdministrator);

        //       тип     имя            значение
        //     String    str     =      "John";

    }

}