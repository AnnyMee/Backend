public class Square extends GeometricFigures{

    public Square (double side){
        super(side);
    }

    public String toString(){
        return "\nThis is a square. \nOne of its side is " + getLength() + " cm.";
    }

    public void printArea(){
        System.out.println("The area is " + (getLength()*getLength()) + " cm.");
    }
    public void printPerimeter(){
        System.out.println("The perimeter is " + getLength()*4 + " cm.");
    }
}
