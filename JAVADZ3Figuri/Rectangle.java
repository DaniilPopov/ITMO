package JAVADZ3Figuri;

public class Rectangle {
    public int S, P;

    public void Info(int a, int b) {
        System.out.println("1 сторона = " + a + "\n" + "2 сторона = " + b);
    }

    public double Plochad(int a, int b) {
        S = a * b;
        System.out.println("Площадь прямоугольника = " + S);
        return S;
    }

    public double Perimetr(int a, int b) {
        P = 2 * (a * b);
        System.out.println("Периметр прямоугольника = " + P);
        return P;
    }

}

/*
2. Создать фигуры: Circle, Rectangle, Triangle, у которых будут координаты. Все фигуры должны иметь методы,
которые возвращают площадь и периметр (для окружности - длина окружности).
 */