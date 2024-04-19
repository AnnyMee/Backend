public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public String toString(){
        return "Circle radius " + radius;
    }
    public double calcArea(){
       return Math.PI*Math.pow(radius,2);
    }
    public double calcPerimeter(){
        return 2*Math.PI*radius;
    }
}
