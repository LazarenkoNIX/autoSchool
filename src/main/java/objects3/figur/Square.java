package objects3.figur;

public class Square extends Shape {
    private double length;

    public Square(double length) {
        super("Square");
        this.length = length;
    }

    public double getArea() {
        return (length * 2);
    }
}