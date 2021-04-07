package objects3.figur;

public class Circle extends Shape {
    private double radius;
    public static final double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getArea() {
        return (PI * radius * 2);
    }
}