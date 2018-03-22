public class NewProject {

    public static void main(String[] args) {

        //Задание 1.
        System.out.println("Задание 1.");

        double m = 4.5;
        double n = 12.5;
        if (Math.abs(10 - m) < Math.abs(10 - n)) System.out.println("Ближайшее к числу 10: " + m);
        else System.out.println("Ближайшее к числу 10: " + n);

        //Задание 2.
        System.out.println("Задание 2.");

        float a = 1, b = 0, c = -2;
        double d = (b * b) - (4 * a * c);
        float e = 0, f = 0;
        if (d == 0) {
            e = -1 * (b / (2 * a));
            System.out.println("1 корень: " + e);
        } else if (d > 0) {
            e = ((-1 * b) + (float) Math.sqrt(d)) / (2 * a);
            f = ((-1 * b) - (float) Math.sqrt(d)) / (2 * a);
            System.out.println("2 корня: " + e + " и " + f);
        } else System.out.println("Нет корней.");

        //Задание 3.
        System.out.println("Задание 3.");

        int p = 774;
        int o = p % 10;
        int i = ((p / 10) % 10);
        int u = ((p / 100) % 10);
        if (o >= i && o > u || o > i && o >= u) System.out.println("В числе " + p + " наибольшая циффра: " + o);
        else if (c > o && c >= u) System.out.println("В числе " + p + " наибольшая циффра: " + i);
        else System.out.println("В числе " + p + " наибольшая циффра: " + u);

        //Задание 4.
        System.out.println("Задание 4.");

        int z = 7, x = 0, v = -5;
        if (z > x && z > v && x > v) System.out.println("Возрастающая последовательность: " + v + ", " + x + ", " + z);
        else if (x > z && x > v && z > v)
            System.out.println("Возрастающая последовательность: " + v + ", " + z + ", " + x);
        else if (v > z && v > x && x > z)
            System.out.println("Возрастающая последовательность: " + z + ", " + x + ", " + v);
        else if (x > z && x > v && v > z)
            System.out.println("Возрастающая последовательность: " + z + ", " + v + ", " + x);
        else if (v > z && v > x && z > x)
            System.out.println("Возрастающая последовательность: " + x + ", " + z + ", " + v);
        else System.out.println("Возрастающая последовательность: " + x + ", " + v + ", " + z);

        //Циклы.
        System.out.println("Циклы.".toUpperCase());
        //Задание 1.
        System.out.println("Задание 1.");

        for (int j = 1000; j < 10000; ) {
            System.out.print("j = " + j + " ");
            j += 3;
        }
        System.out.println();
        //Задание 2.
        System.out.println("Задание 2.");

        for (int k = 90; k >= 0; ) {
            System.out.println("k = " + k + " ");
            k -= 5;

        }

        //Задание 3.
        System.out.println("Задание 3.");

        for (int j = 0; j < 20; j++) {
            for (int k = 2; k < 1048600; ) {
                System.out.println("k = " + k + " ");
                k *= 2;
            }

        }

        //Задание 4.
        System.out.println("Задание 4.");

        int t = 3;
        for (int j = 3; j < t; j++) {
            if (t % 2 == 0) {
                System.out.println("Число " + t + " не простое.");
                return;
            }
        }
        System.out.println("Число " + t + " простое.");

        //Задание 5.
        System.out.println("Задание 5.");

        int value = 11;
        int first = 1, second = 1;
        System.out.println(first + "\n" + second);
        int k = 2, sumfib = 2;
        while (k++ < value) {
            sumfib = first + second;
            first = second;
            second = sumfib;
            System.out.println(sumfib + "");
        }

        //Задание 6.
        System.out.println("Задание 6.");

        int sum = 0;
        for (int j = 000001; j < 999999; j++) {
            int numb1 = j / 100000;
            int numb2 = (j / 10000) % 10;
            int numb3 = (j / 1000) % 10 % 10;
            int numb4 = (j / 100) % 10 % 10 % 10;
            int numb5 = (j / 10) % 10 % 10 % 10 % 10;
            int numb6 = j % 10 % 10 % 10 % 10;
            if (numb1 + numb2 + numb3 == numb4 + numb5 + numb6) {
                sum++;
            }

        }
        System.out.println("В одном рулоне " + sum + " счастливых билетов");

        //Задание 7.
        System.out.println("Задание 7.");


    }
}

