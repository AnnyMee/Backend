public class Main {
    public static void main(String[] args) {
        //Исключающее ИЛИ (^^) - XOR
        //работаем по принципу + и + = -; + и - = +; - и + = +; - и - = +

        int a = 16;
        int b = 2;

        System.out.println("a/b = " + a/b); //результат будет равен 6 потому, что операция между int
        System.out.println("a % b = " + a % b); //операция M O D U L O, показывает остаток от деления

        //МОДУЛО используется обычно для вычисления четности или нечетности числа (деление на 2 без остатка)

        if (a % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Не четное");
        } if (a % 10 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}