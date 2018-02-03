package figures;

public class Ellipse extends Circle {
    private double radius2;

    public Ellipse(String type, double radius1, double radius2) {
        super(type, radius1);
        this.radius2 = radius2;
    }

    @Override
    public double getArea() {
        return radius2 * super.getRadius1() * super.pi;
    }

    @Override
    public double circumFerence() {
        return (radius2 + super.getRadius1()) * super.pi;
    }

    public boolean isCircle() {
        return getRadius2() == getRadius1();
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    @Override
    public String toString() {
        return getType() + " radius1: " + getRadius1() + " radius2: " + radius2;
    }
}
