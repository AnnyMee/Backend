public class Main {
    public static void main(String[] args) {
        int diam = 28;
        int rad = diam / 2;
        double area = 3.14 * (double)(rad ^ 2);
        String text1 = "If the diameter of the pizza is ";
        String measure = "cm";
        String text2 = "then the area will equal to ";
        System.out.println(text1 + diam + measure);
        System.out.println(text2 + area + measure + ".");
        int pizza1 = 48;
        int pizza2 = 22;
        int price1 = 15;
        int price2 = 7;
        double pizzaA = (double)price1 * 1.0 / (double)pizza1 * 1.0;
        double pizzaB = (double)price2 * 1.0 / (double)pizza2 * 1.0;
        text1 = "If a pizza of 48cm costs 15 euro and a pizza of 22cm costs 7 euro ";
        text2 = "then bying one 48cm pizza is more convenient then bying 2 22cm pizza, because ";
        String pizz1 = "1 cm of the bigger pizza will cost " + pizzaA;
        String pizz2 = " while 1 cm of a smaller pizza will cost " + pizzaB;
        System.out.println(text1 + text2);
        System.out.println(pizz1 + pizz2);
    }
}