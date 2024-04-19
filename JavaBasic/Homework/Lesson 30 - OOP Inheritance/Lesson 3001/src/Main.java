/*
Реализовать в программе классы описывающие геометрические фигуры: Круг, Квадрат, Прямоугольник
Подсказка: для того, что бы задать круг, нужно задать радиус, а для прямоугольника, например, важны стороны.
У каждой фигуры должен быть метод toString(), метод расчета площади фигуры и метод расчета периметра фигуры.
В Main необходимо создать массив из фигур и для каждой фигуры рассчитать площадь и периметр.
 */
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(15,10);
        Rectangle rectangle2 = new Rectangle(18,9);
        Square square1 = new Square(14);
        Square square2 = new Square(20);
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(16);

        GeometricFigures[] figures = {rectangle1,rectangle2,square1,square2,circle1,circle2};

        for (GeometricFigures geoFigure : figures){
            System.out.println(geoFigure);
            geoFigure.printArea();
            geoFigure.printPerimeter();
        }
    }
}