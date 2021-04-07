package objects3.figur;

public abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double getArea();

    public String getName() {
        return shapeName;
    }
}