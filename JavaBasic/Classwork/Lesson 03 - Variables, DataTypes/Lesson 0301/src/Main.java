/*
Программа и её данные во время работы хранятся в памяти. Вся память компьютера представлена в виде маленьких ячеек — байт. У каждой ячейки есть её уникальный номер — 0,1,2,3,… (нумерация начинается с нуля). Зная номер ячейки, мы можем сохранить в неё какие-то данные. Или взять их из неё. В одних ячейках хранится код программы — набор команд для процессора, в других — данные этой программы. Номер каждой ячейки также называют её адресом.

Когда в коде программы объявляется переменная, ей выделяется кусочек ещё не использованной памяти. Обычно это несколько байт.
При объявлении переменной также нужно указать тип информации, которую программа будет хранить в ней: числа, текст, или другие данные. Размер выделяемой памяти определяется типом переменной. Каждой переменной задаётся уникальное имя.

В Java все типы данных иожно разделить на примитивные и объектные (ссылочные, сложные).

##Примитивные типы данных pdf

В Java 8 примитивных типов данных, которые представляют основные значения: целые числа, числа с плавающей точкой, символы и логические значения.

byte: Этот тип данных используется для хранения целых чисел от -128 до 127. Размер - 8 бит.

short: Хранит целые числа от -32,768 до 32,767. Размер - 16 бит.

int: Самый распространенный тип для хранения целых чисел. Может хранить значения от -2^31 до 2^31-1. Размер - 32 бита.

long: Используется для хранения очень больших целых чисел. Может хранить значения от -2^63 до 2^63-1. Размер - 64 бита.

float: Этот тип данных предназначен для хранения чисел с плавающей точкой одинарной точности. Размер - 32 бита.

double: Используется для чисел с плавающей точкой двойной точности. Это более точный тип по сравнению с float. Размер - 64 бита.

char: Хранит одиночные символы, такие как буквы, цифры и символы Unicode. Размер - 16 бит.

boolean: Этот тип данных имеет два значения: true и false. Используется для представления логических значений.

На практике byte, short, float почти не используются

Чтобы объявить новую переменную, нужно написать её тип и имя. Это имя не должно быть уникально, понятно. В java применяется camel case:

int numberOfStudents;
Для того, чтобы занести новое значение в переменную, используется знак “=”. Его ещё называют «оператором присваивания». Присваивание – это занесение в переменную значения, взятого из другой переменной или вычисленного на основе нескольких переменных.

numberOfStudents = 24;
 */


public class Main {
    public static void main(String[] args) {
        String str;
        str = "hello";

        System.out.println(str);

        str = "new value";

        System.out.println(str);

        //--------------------

        String str2 = "2343";
        String str3 = "1";

        System.out.println(str2+str3);

                /* переменные: примитивные типы (их 8 всего)             объектные (ссылочные) типы (их бесконечное количество)
                                с маленькой буквы                                   с большой буквы
                byte, short, int, long, float, double, char, boolean                    ex: String
                картинка типов данных
        */

        int num1 = 10;
        System.out.println(num1);
        double num2 = 101.4;
        System.out.println(num2);
        System.out.println(num1+num2);
        System.out.println(10.0/3);
        System.out.println(3.3333333333333333);     // результат будет будто скопирован с предыдущего вычисления (3.3333333333333335)

        int a=10;
        int b=3;
        System.out.println(a/b); // выдаст целое число 3
        System.out.println(a*1.0/b); // мы объявляем, что числа с запятой будут использоваться, чтобы результат был 3.(3)

    }
}