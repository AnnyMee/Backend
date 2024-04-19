//Alternative way

public class Main {

    public static void main(String[] args) {

        printNumbers();
    }

    public static void printNumbers() {

        int currentNumber = 10;                     //начальные условия "перед циклом"

        while (currentNumber >= 1) {                 //условие, ПОКА цикл выполняется
            System.out.println(currentNumber);

            currentNumber = currentNumber - 1;        //изменение управляющей переменной

        }
    }
}