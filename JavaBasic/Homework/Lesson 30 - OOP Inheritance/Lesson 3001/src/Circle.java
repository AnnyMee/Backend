public class Circle extends GeometricFigures{
    private double p = 3.14;

    public Circle(double radius){
        super(radius);

    }
    public String toString(){
        return "\nThis is a circle. \nIts radius is " + getLength() + " cm.";
    }
    private double calculateDiameter(){
        return 2*getLength();
    }
    public void printArea(){
        System.out.println("The area is " + p*(getLength()*getLength()));
    }
    public void printPerimeter(){
        System.out.println("The perimeter is " + p*calculateDiameter() + "cm.");
    }
}
