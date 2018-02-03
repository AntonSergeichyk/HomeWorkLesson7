package figures;

public class Circle extends Figure {
    public final double pi = 3.14;
    private double radius1;

    public Circle(String type, double radius1) {
        super(type);
        this.radius1 = radius1;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius1, 2);
    }

    public double circumFerence() {
        return 2 * pi * radius1;
    }

    public double getRadius1() {
        return radius1;
    }

    public void setRadius1(double radius1) {
        this.radius1 = radius1;
    }

    @Override
    public String toString() {
        return getType() + " radius1: " + radius1;
    }
}
