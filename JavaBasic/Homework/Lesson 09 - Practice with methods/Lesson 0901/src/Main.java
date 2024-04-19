/*
Давайте напишем программу для кофе-машины.
Каждый рецепт кофе определяется количеством кофе, количеством молока, количеством воды.
Таким образом у вас должен быть метод, который принимает 3 int: coffee, milk, water. Метод должен выводить на экран что-то типа:
добавляю:
кофе: 20 грамм
молоко: 50ml
вода: 70ml
Можете вывод сделать на свое усмотрение, чуть красивее,
но цифры должны передаваться в параметрах.
В main дайте пользователю возможность выбрать вид кофе: 1. эспрессо, 2. лате .... и т.д.
Ваша программа должна подготовить параметры для приготовления кофе в соответствие с выбором и "приготовить" кофе, вызвав ваш метод.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose coffee type and insert the according number: ");
        System.out.println("1 - Espresso");
        System.out.println("2 - Cappucino");
        System.out.println("3 - Americano");
        System.out.println("4 - Macchiato");
        System.out.println("5 - Ristretto");
        System.out.println("6 - Lungo");

        int chosenCoffee = scanner.nextInt();
        processMakingCoffee(chosenCoffee);

    }
    public static void processMakingCoffee(int chosenCoffee) {

        int coffee = 0;
        int milk = 0;
        int water = 0;

        switch (chosenCoffee) {
            case 1: coffee = 8; milk = 0; water = 30; break;      //espresso
            case 2: coffee = 8; milk = 90; water = 30; break;     //capp
            case 3: coffee = 8; milk = 0; water = 60; break;      //americ
            case 4: coffee = 8; milk = 175; water = 30; break;    //macch
            case 5: coffee = 8; milk = 0; water = 15; break;      //ristr
            case 6: coffee = 8; milk = 0; water = 100; break;     //lungo
            default: System.out.println("Incorrect type of coffee");
        }
        showProcess(coffee, milk, water);

    }

    public static void showProcess(int coffee, int milk, int water){

        System.out.println("Adding " + coffee + "g coffee...");
        System.out.println("Adding " + milk + "ml milk...");
        System.out.println("Adding " + water + "ml water...");
        System.out.println("Coffee is ready! Enjoy!");
    }

}