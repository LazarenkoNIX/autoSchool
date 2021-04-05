package objects3.figur;

public class Circle extends Shape {
    private double x, y, radius;
    public static final double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    private double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double getPI() {
        return PI;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return (PI * radius * 2);
    }

    public String name() {
        return "Circle";
    }

//    public void drow() {
//        System.out.println("Triangle, S = " + PI * radius * 2 + " with coordinate: x = " + x + ", y = " + y);
//    }
}