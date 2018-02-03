package figures;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String type, double height, double baseTriangle, double sideTriangleA, double sideTriangleB) {
        super(type, height, baseTriangle, sideTriangleA, sideTriangleB);
    }

    public boolean isEquilateralTriangle() {
        return this.getSideTriangleA() == this.getSideTriangleB();
    }

    @Override
    public double getPerimeter() {
        return super.getSideTriangleA() * 2 + super.getBaseTriangle();
    }

    @Override
    public String toString() {
        return getType() + " высота равна: " + getHeight();
    }
}
