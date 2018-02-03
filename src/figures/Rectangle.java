package figures;

public class Rectangle extends Square {
    private double sideB;

    public Rectangle(String type, double sideA, double sideB) {
        super(type, sideA);
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideB * super.getSideA();
    }

    @Override
    public double getPerimeter() {
        return (sideB + super.getSideA()) * 2;
    }

    public double diagonalRectangle() {
        return Math.sqrt(Math.pow(super.getSideA(), 2) + Math.pow(sideB, 2));
    }

    public boolean isSquare() {
        return getSideA() == getSideB();
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return getType() + " cторона равна: " + sideB;
    }
}
