/*
Предположим, у вас есть массив с именами пользователей,
например {"Иван Иванов", "Сергей Петров", "Елена Соколова" }
(массив задан в начале программы, естественно, имен может быть больше).
Реализовать следующие методы:

метод, который выводит все элементы данного массива на экран, в виде
0 - Иван Иванов  1 - Сергей Петров  2 - Елена Соколова
т.е. index - значение

метод, boolean checkName(String[] array, String name) который вернет true,
если в массиве присутствует заданный пользователь
 */

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String[]users = {"Иван Иванов", "Сергей Петров", "Елена Соколова", "Мария Александрова",};
        addIndex(users);                                                        //в методе уже есть вывод sout, поэтому тут только вызываем его

        boolean checkForName = checkName(users,"Алина Василиева");        //вызываем метод boolean и задаём параметры
        System.out.println(checkForName);                                       //выводим на экран
    }
    public static void addIndex(String[]users) {                                //method String просит return, потому мне не подходит
        for(int i = 0; i < users.length; i++){                                  //перебор массива имён
            System.out.println(i + " - " + users[i]);                           //выводим на экран порядковый номер оборота + " - " + имя в обороте
        }
    }
    public static boolean checkName(String[] array, String name) {              //создаём метод
        for (int i = 0; i < array.length; i++) {                                //перебираем строку
            if (array[i].equals(name)) {                                        //просим сравнивать имя с именами в массиве
                return true;                                            //если есть совпадение - true
            }
        }
        return false;                                                           //нет совпадений - false
    }
}