public abstract class GeometricFigures {

    private double length;
    private double width;

    public GeometricFigures(int length, int width){
        this.length = length;
        this.width = width;
    }
    public GeometricFigures(int side){

        this.length = side;
    }
    public GeometricFigures(double radius){
        this.length = radius;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void printArea(){
        System.out.println("The area is " + (length*width) + " cm.");
    }
    public void printPerimeter(){
        System.out.println("The perimeter is " + (length+width)*2 + " cm.");
    }
}

