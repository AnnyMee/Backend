public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
    public double calArea(){
        return side*side;
    }
    public double calcPerimeter(){
        return side*4;
    }
}
