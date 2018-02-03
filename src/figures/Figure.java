package figures;

public abstract class Figure implements Area {
    private String type;

    public Figure(String type) {
        this.type = type;
    }

    public abstract double getArea();

    public boolean isAreaEquals(Figure figure) {
        return this.getArea() == figure.getArea();
    }

    public String getType() {
        return type;
    }
}
