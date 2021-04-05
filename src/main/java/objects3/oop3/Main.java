package objects3.oop3;

import objects3.figur.Circle;
import objects3.figur.Triangle;
import objects3.figur.Square;
import objects3.figur.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[10];
        shape[0] = new Circle(12, 1, 22.1);
        shape[1] = new Square(3, 5, 1, 7, 15.8);
        shape[2] = new Triangle(2, 3, 1, 21, 15.7);
        shape[3] = new Circle(12, 1, 56.5);
        shape[4] = new Square(3, 5, 1, 7, 12.58);
        shape[5] = new Triangle(2, 3, 1, 21, 25.5);
        shape[6] = new Circle(12, 1, 22.7);
        shape[7] = new Square(3, 5, 1, 7, 12.8);
        shape[8] = new Triangle(2, 3, 1, 21, 25.9);
        shape[9] = new Circle(12, 1, 22);

        bubbleSort(shape);

        for (Shape figure : shape) {
            System.out.println(figure.name() + ", S = " + figure.getArea());
        }
    }

    public static void bubbleSort(Shape[] shape) {
        boolean sorted = false;
        Shape temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < shape.length - 1; i++) {
                if (shape[i].getArea() > shape[i + 1].getArea()) {
                    temp = shape[i];
                    shape[i] = shape[i + 1];
                    shape[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}