package figures;

public class Triangle extends Figure {
    private double height;
    private double baseTriangle;
    private double sideTriangleA;
    private double sideTriangleB;

    public Triangle(String type, double height, double baseTriangle, double sideTriangleA, double sideTriangleB) {
        super(type);
        this.height = height;
        this.baseTriangle = baseTriangle;
        this.sideTriangleA = sideTriangleA;
        this.sideTriangleB = sideTriangleB;
    }

    @Override
    public double getArea() {
        return height * baseTriangle / 2;
    }

    public double getPerimeter() {
        return sideTriangleA + sideTriangleB + baseTriangle;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseTriangle() {
        return baseTriangle;
    }

    public void setBaseTriangle(double baseTriangle) {
        this.baseTriangle = baseTriangle;
    }

    public double getSideTriangleA() {
        return sideTriangleA;
    }

    public void setSideTriangleA(double sideTriangleA) {
        this.sideTriangleA = sideTriangleA;
    }

    public double getSideTriangleB() {
        return sideTriangleB;
    }

    public void setSideTriangleB(double sideTriangleB) {
        this.sideTriangleB = sideTriangleB;
    }

    @Override
    public String toString() {
        return getType() +
                " высота равна: " + height;
    }
}
