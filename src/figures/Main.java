package figures;

public class Main {
    public static void main(String[] args) {
        Figure[] arrayFigures = {
                new Circle("КРУГ", 5),
                new Ellipse("ЭЛЛИПС", 5, 10),
                new Rectangle("ПрЯМОУГОЛЬНИК", 7, 3),
                new Square("КВАДРАТ", 8),
                new Triangle("ТРЕУГОЛЬНИК", 4, 4, 3, 5),
                new EquilateralTriangle("РАВНОСТОРОННИЙ ТРЕУГОЛЬНИК", 4, 4, 3, 5)};
        Figure figureNew = new Circle("НОВЫЙ_КРУГ", 5);

        print(arrayFigures, figureNew);
    }

    private static void print(Figure[] arrayFigures, Figure figureNew) {
        for (Figure figure : arrayFigures) {
            System.out.printf("%s\n %s его площадь равна: %s, %s\n",
                    figure.getType(), ShapeUtils.isRectangle(figure) ? " является прямоугольником " : " не является прямоугольником ",
                    figure.getArea(), figure.isAreaEquals(figureNew) ? " равна площади заданного круга" : " не равна площади заданного круга");
            if (figure instanceof Circle) {
                System.out.println("Длинна окружности равна: "+((Circle) figure).circumFerence());
            }
             if  (figure instanceof Ellipse) {
                System.out.println(((Ellipse) figure).isCircle()?"Данный элипс является окружностью":"Данный элипс не является окружностью");
            }
            if (figure instanceof Square) {
                System.out.println("Периметр равен: "+((Square) figure).getPerimeter());
            }
            if (figure instanceof Rectangle) {
                System.out.println("Диагональ прямоугольника равна: "+((Rectangle) figure).diagonalRectangle());
            }
            if (figure instanceof Triangle) {
                System.out.println("Периметр треугольника равен: "+((Triangle) figure).getPerimeter());
            }
            if (figure instanceof EquilateralTriangle) {
                System.out.println(((EquilateralTriangle) figure).isEquilateralTriangle()?"Данный прямоугольник является равносторонним":"Данный прямоугольник не является равносторонним");
            }
        }
    }
}
