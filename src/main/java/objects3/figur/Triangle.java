package objects3.figur;

public class Triangle extends Shape {
    private double a, b, c, height, length;


    public Triangle(double a, double b, double c, double height, double length) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getС() {
        return c;
    }

    public void setС(double c) {
        this.c = c;
    }

    public double getArea() {
        return ((height * length) / 2);
    }

    public String name() {
        return "Triangle";
    }
//    public void drow() {
//        System.out.println("Triangle, S = " + (h * l) / 2 +
//                " with coordinate: a = " + a + ", b = " + b +
//                ", c = " + c);
//    }
}