import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DZ2 {
    public static void main(String[] args) throws IOException {

        //Задание 1
        System.out.println("Задание 2");

        int[] mas1 = new int[10];
        int b = 2;
        for (int i = 0; i < 10; ) {
            mas1[i] = b;
            b += 2;
            i++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(mas1[i]);
        }

        //Задание 2
        System.out.println("Задание 2");

        int a = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) a++;
        }
        int[] mas2 = new int[a];
        for (int i = 1, q = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                mas2[q] = i;
                System.out.print(mas2[q] + " ");
                q++;
            }

        }
        System.out.println();
        for (int i = mas2.length - 1; i >= 0; i--) {
            System.out.print(mas2[i] + " ");
        }

        //Задание 3
        System.out.println();
        System.out.println("Задание 3");

        int[] mas3 = new int[15];
        for (int i = 0; i < mas3.length; i++) {
            mas3[i] = (int) Math.round(Math.random() * 9);
        }
        int ch = 0;
        for (int i = 0; i < mas3.length; i++) {
            System.out.print(mas3[i] + " ");
            if (mas3[i] % 2 == 0 && mas3[i] != 0) {
                ch++;
            }
        }
        System.out.println();
        System.out.println("В массиве mas3 " + ch + " четных элементов");


        //Задание 4
        System.out.println("Задание 4");


        double midAr = 0, midAr2 = 0;
        int[] mas4 = new int[5];
        int[] mas5 = new int[5];
        for (int i = 0; i < mas4.length; i++) {
            mas4[i] = (int) Math.round(Math.random() * 5);
            System.out.print(mas4[i] + " ");
            midAr += (double) mas4[i] / mas4.length;
        }

        System.out.println();
        for (int i = 0; i < mas5.length; i++) {
            mas5[i] = (int) Math.round(Math.random() * 5);
            System.out.print(mas5[i] + " ");
            midAr2 += (double) mas5[i] / mas5.length;
        }
        System.out.println();
        if (midAr == midAr2) System.out.println("Средние арифметические значения двух массивов равны");
        else if (midAr > midAr2) System.out.println("Среднее арифметическое значение первого массива больше");
        else if (midAr < midAr2) System.out.println("Среднее арифметическое значение второго массива больше");

        //Задание 5
        System.out.println("Задание 5");

        int[] mas6 = new int[4];
        for (int i = 0; i < mas6.length; i++) {
            mas6[i] = (int) (Math.random() * 90 + 10);
            System.out.print(mas6[i] + " ");
        }
        for (int i = 0; i < mas6.length; i++) {
            if (i > 0) {
                if (mas6[i - 1] >= mas6[i]) {
                    System.out.println("Массив не возрастающий");
                    break;
                }
            }
            if (i == mas6.length - 1) {
                System.out.println("Массив возрастающий");
            }
        }

        //Задание 6
        System.out.println("Задание 6");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumMod = 0, sumMod2 = 0;

        System.out.println("Введите четное число ");
        int masRead = Integer.parseInt(reader.readLine());
        if (masRead % 2 != 0 || masRead < 1)
            do {
                System.out.println("Ошибка, введите повторно четное число");
                masRead = Integer.parseInt(reader.readLine());
            }
            while (masRead % 2 != 0 || masRead < 1);
        int[] mas7 = new int[masRead];
        for (int i = 0; i < mas7.length; i++) {
            mas7[i] = (int) (Math.random() * 11) - 5;
            System.out.print(mas7[i] + " ");
            if (i <= mas7.length / 2 - 1) {
                sumMod += Math.abs(mas7[i]);
            } else {
                sumMod2 += Math.abs(mas7[i]);
            }

            if (i == mas7.length - 1) {
                System.out.println();
                if (sumMod > sumMod2) System.out.println("Сумма первой половины больше " + sumMod);
                if (sumMod2 > sumMod) System.out.println("Сумма второй половины больше " + sumMod2);
                if (sumMod == sumMod2) System.out.println("Суммы первой и второй половины равны");
            }
        }

        //Задание 6
        System.out.println("Задание 6");

        //Задание 7
        System.out.println("Задание 7");

        //Задание 8
        System.out.println("Задание 8");


        //Строки
        //Задание 1
        System.out.println("Задание 1");

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку: ");
        String s1 = new String(reader1.readLine());
        System.out.println("Изменяемая подстрока: ");
        String s2 = new String(reader.readLine());
        System.out.println("Новая подстрока: ");
        String s3 = new String(reader1.readLine());


        System.out.println(s1.replaceFirst(s2, s3));

        //Задание 2
        System.out.println("Задание 2");


        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку: ");
        String s4 = new String(reader1.readLine());
        String pattern = "(.)(?=(.*))(?<=(?=\\1.*?\\1\\2$).+)";

        String str = s4.replaceAll(pattern, "");
        System.out.println(str.replaceAll("\\s+", ""));


    }
}





