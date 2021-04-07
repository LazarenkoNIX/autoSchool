package objects3.figur;

public class Triangle extends Shape {
    private double height, length;


    public Triangle(double height, double length) {
        super("Triangle");
        this.height = height;
        this.length = length;
    }

    public double getArea() {
        return ((height * length) / 2);
    }

}