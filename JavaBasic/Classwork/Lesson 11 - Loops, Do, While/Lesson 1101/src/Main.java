public class Main {

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 10;

        printNumbersWhile(num1, num2);
        printNumbersDoWhile(num1, num2);
        printNumbersFor(num1, num2);
    }
    public static void printNumbersWhile(int num1, int num2) {

        System.out.println("---------------------while-----------------");

        int currentNumber = num1;                     //начальные условия "перед циклом"

        while (currentNumber >= num2) {               //условие, ПОКА цикл выполняется
            System.out.println(currentNumber);

            currentNumber = currentNumber - 1;        //изменение управляющей переменной

        }

        System.out.println("---------------------while finish-----------------");
        System.out.println("после цикла currentNumber = " + currentNumber);
        System.out.println();
    }
    public static void printNumbersDoWhile(int num1, int num2){

        System.out.println("---------------------do..while-----------------");

        int currentNumber = num1;                     //начальные условия "перед циклом"

        do {                                           //начинаем выполнять тело цикла

            System.out.println(currentNumber);

            currentNumber = currentNumber - 1;        //изменение управляющей переменной

        }while (currentNumber >= num2);               //условие, ПОКА цикл выполняется

        System.out.println("---------------------do..while finish-----------------");
        System.out.println("после цикла currentNumber = " + currentNumber);
        System.out.println();
    }



    public static void printNumbersFor(int num1, int num2) {

        System.out.println("---------------------for-----------------");
        // for (начальные условия;            условие;        изменение управляющей переменной){
        // for (int i=0; i<size; i==){
        int currentNumber;
        for (currentNumber = num1; currentNumber >= num2; currentNumber--) {   //начальные условия "перед циклом"; условие, ПОКА цикл выполняется; изменение управляющей переменной
            System.out.println(currentNumber);

        }

        System.out.println("---------------------for finish-----------------");
        System.out.println("после цикла currentNumber = " + currentNumber);
        System.out.println();
    }

}
/*
    public static void decrementDemo() {

        int currentNumber = 10;

        while (currentNumber >= 1) {
            System.out.println(currentNumber);  //можно и так System.out.println(currentNumber--);

            -- это декремент
            ++ это инкремент
            --currentNumber -> тут программа сначала отнимет, потом выведет, в отличии от того, что выше (там сначала выводит, потом отнимает)
            если запустить прогу, видно, что в первом случае считалочка начинается с 10, а во втором случае с 9


            currentNumber--;  //аналог currentNumber = currentNumber - 1, но работает только с "минус 1" и быстрее считает
        }
    }
    public static void operatrionDemo(){

        int myBestNewVariable = 10;
        myBestNewVariable += 10;           //myBestNewVariable = myBestNewVariable + 10;
        myBestNewVariable -= 10;           //myBestNewVariable = myBestNewVariable - 10;
        myBestNewVariable *= 10;           //myBestNewVariable = myBestNewVariable * 10;
        myBestNewVariable /= 10;           //myBestNewVariable = myBestNewVariable / 10;
        myBestNewVariable %= 10;           //myBestNewVariable = myBestNewVariable % 10;

    }
}
*/