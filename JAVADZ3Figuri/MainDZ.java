package JAVADZ3Figuri;

public class MainDZ {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.Dlina(12);
        circle.Plochad(12);
        Rectangle rectangle = new Rectangle();
        rectangle.Info(2, 4);
        rectangle.Plochad(2, 4);
        rectangle.Perimetr(2, 4);
        Triangle triangle = new Triangle();
        triangle.Info(2, 3, 4);
        triangle.Plochad(2, 3, 4);
        triangle.Perimetr(2, 3, 4);
    }
}
