public class Main {
    public static void main(String[] args) {
        System.out.println("The area of the circle with radius 12 equals " + methodCalcArea(12) );
        System.out.println("The area of the circle with radius 89 equals " + methodCalcArea(89));
    }

    public static double methodCalcArea(int radius){
        double area = radius*radius*3.14;
        return area;
    }
}