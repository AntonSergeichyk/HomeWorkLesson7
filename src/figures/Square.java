package figures;

public class Square extends Figure {
    private double sideA;

    public Square(String type, double sideA) {
        super(type);
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return Math.pow(sideA, 2);
    }

    public double getPerimeter() {
        return sideA * 4;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String toString() {
        return getType() + " Стороноа равна: " + getSideA();
    }
}
