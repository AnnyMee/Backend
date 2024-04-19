/*
Написать программу которая в качестве данных имеет диаметр пиццы.
Необходимо, что бы ваша программа рассчитывала площадь пиццы (вспоминаем площадь круга)
Определите с помощью вашей программы, что выгоднее покупать:
одну большую пиццу (48 см) - 15 евро или
2 средних пицц (22 см) - 7 евро.
 */
public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        int pizzaDiameter1 = 48;
        int pizzaDiameter2 = 22;
        int radius1 = pizzaDiameter1/2;
        int radius2 = pizzaDiameter2/2;

        double pizzaPrice1 = 15;
        double pizzaPrice2 = 7;

        double pizzaArea1 = pi * (double)(radius1 ^ 2);
        double pizzaArea2 = pi * (double)(radius2 ^ 2);

        double pricePerCm1 = pizzaPrice1/pizzaArea1;
        double pricePerCm2 = pizzaPrice2/pizzaArea2;

        System.out.println("The price for the bigger pizza will be " + pricePerCm1 + " per cm.");
        System.out.println("The price for the smaller pizza will be " + pricePerCm2 + " per cm.");
        System.out.println("It is more convenient to buy one bigger pizza over 2 smaller");











    }
}