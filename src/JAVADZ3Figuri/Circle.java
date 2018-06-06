package JAVADZ3Figuri;

public class Circle {
    public double C, S;

    public double Dlina(double a) {

        C = 2 * Math.PI * a;
        System.out.println("Длина окружности : " + C);
        return C;
    }

    public double Plochad(double a) {

        S = (a * a) * Math.PI;
        System.out.println("Площаль окружности : " + S);
        return S;
    }
}

/*
2. Создать фигуры: Circle, Rectangle, Triangle, у которых будут координаты. Все фигуры должны иметь методы,
которые возвращают площадь и периметр (для окружности - длина окружности).
 */