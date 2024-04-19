public class Rectangle extends GeometricFigures{

    public Rectangle (int length, int width){

        super(length, width);
    }
    public String toString(){
        return "\nThis is a Rectangle. \nIts length is " + getLength() + " cm and its width is " + getWidth() + " cm.";
    }
}
