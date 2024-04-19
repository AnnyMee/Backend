import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Area of a circle with radius 5 is " + getCircleArea(5));
        System.out.println("Area of a circle with radius 5 is " + getCircleArea(7));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please circle radius: ");
        int r = scanner.nextInt();

        System.out.println("Area of a circle with radius " + r + " is " + getCircleArea(r));

        int s1 = 5;
        int s2 = 4;
        printRectangle(s1,s2,getRectangularArea(s1,s2));
        //int area = getRectangularArea(s1,s2); //  или можно подставить сразу числа
        //Area of rectangle (*,*) is *


        s1 = 9;
        s2 = 2;
        printRectangle(s1,s2,getRectangularArea(s1,s2));
        //area = getRectangularArea(s1,s2);
        //System.out.println("Area of rectangle (" + s1 + ", " + s2 + ") is " + area);

    }

    public static double getCircleArea(int radius){

        double area = radius*radius*3.1415;

        return area;  // можно вместо объявления переменной double area вставить сразу формулу radius*radius*3.1415
    }
    public static int getRectangularArea(int side1, int side2){

        return side1*side2;
    }

    public static void printRectangle(int side1, int side2, int area){
        System.out.println("Rectangle: side1 = " + side1 + " side2 = " + side2);
        System.out.println("Area of rectangle is " + area);

    }

}