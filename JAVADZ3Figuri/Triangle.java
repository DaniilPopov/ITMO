package JAVADZ3Figuri;

public class Triangle {
    public double S, P;

    public void Info(double a, double b, double c) {
        System.out.println("1 сторона = " + a + "\n" + "2 сторона = " + b + "\n" + "3 сторона = " + c);
    }

    public double Plochad(double a, double b, double c) {
        S = (a + b + c) / 2.0;
        System.out.println("Площадь треугольника = " + S);
        return S;
    }

    public double Perimetr(double a, double b, double c) {

        P = (a + b + c);
        System.out.println("Периметр треугольника = " + P);
        return P;
    }

}



/*
2. Создать фигуры: Circle, Rectangle, Triangle, у которых будут координаты. Все фигуры должны иметь методы,
которые возвращают площадь и периметр (для окружности - длина окружности).
 */