package figures;

public class ShapeUtils {
    private ShapeUtils() {
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Square;
    }
}
