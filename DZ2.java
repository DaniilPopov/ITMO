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

        //Задание 7
        System.out.println("Задание 7");


        int[][] mas8 = new int[5][8];
        for (int i = 0; i < mas8.length; i++) {
            for (int j = 0; j < mas8[i].length; j++) {
                mas8[i][j] = (int) (Math.round(Math.random() * 199) - 99);
                System.out.print(mas8[i][j] + " ");
            }

        }
        int max = mas8[0][0];
        for (int i = 0; i < mas8.length; i++) {
            for (int j = 0; j < mas8[i].length; j++) {
                if (mas8[i][j] > max) max = mas8[i][j];
            }
        }
        System.out.println();
        System.out.println("Максимальное значение: " + max);

        //Задание 8
        System.out.println("Задание 8");

        int[][] mas9 = new int[15][3];
        for (int i = 0; i < mas9.length; i++) {
            for (int j = 0; j < mas9[i].length; j++) {
                mas9[i][j] = (int) (Math.random() * 8) + 2;
                if (j == mas9[i].length - 1) {
                    mas9[i][j] = mas9[i][j - 2] * mas9[i][j - 1];
                    for (int k = 0; k < i; k++) {
                        if (mas9[i][j] == mas9[k][j] && i > 0) {
                            if (mas9[i][j - 1] == mas9[k][j - 1] || mas9[i][j - 2] == mas9[k][j - 2])
                                --i;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < mas9.length; i++) {
            System.out.print("Пример №" + (i + 1 + " Умножить "));
            for (int j = 0; j < mas9[i].length; j++) {
                if (j == 0) System.out.print(mas9[i][j] + " на ");
                if (j == 1) System.out.println(mas9[i][j]);

            }
        }

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


/*
    Литералы — это константы, которые записаны по правилам языка Java. Рассмотрим сначала целочисленные литералы.
        111 — десятичное (десятеричное) число
        056 — число 46 в восьмеричной форме
        0 х АВ — 171 в шестнадцатеричной форме
    В языке Java возможны три системы счисления: десятичная (десятеричная), восьмеричная и шестнадцатеричная.
    Числа в десятичной форме — это числа с основанием 10, числа в восьмеричной форме — это числа с основанием 8,
    числа в шестнадцатеричной форме — числа с основанием 16. Записи чисел в восьмеричной форме начинаются с 0,
    далее каждая цифра числа должна быть от 0 до 7. Преобразуются они в десятичные числа так: рассмотрим, например,
    число 056 в восьмеричной форме. В десятичной форме это число записывается так.

        5x8 + 6 = 46

    Запись числа в шестнадцатеричной форме начинается с символов 0х, а последующие цифры должны быть от 0 до 15.
    Поскольку, например, число — это 2 цифры, а нужно записать его одной цифрой, то числа от 10 до 15 записываются буквами
    от А до f. Рассмотрим правила перехода шестнадцатеричных чисел в десятичные. Возьмем, например, число 0 х АВ.
    В десятичной форме это число будет записываться так.

        10 х 16 + 11 = 171.

    Записи числа с типом данных long ("длинные целые числа" — об этом далее) обычно имеют на конце символ 1
    (чтобы отличить их от целочисленных констант типа int — простых чисел).

    Рассмотрим теперь литералы для чисел с плавающей точкой.

        18.01
        31.4е-1
        0.314е1



    Эти литералы, как и целочисленные, могут иметь знаки "+" и (т.е. быть положительными или отрицательными),
    иметь в записи точку, которая разделяет целую и дробную часть, а также букву е и следом за ней — степень,
    в которую необходимо возвести число (если степень положительная, знак "+" можно не указывать).

    Рассмотрим теперь, как выглядят символьные литералы.

        'а'
        'b'
        'с'

    Символьные литералы должны заключаться в одинарные кавычки. Среди символьных литералов есть так называемые
    еsсаре-последовательности, которые позволяют произвести какую-либо операцию, например, перевести курсор на новую строку
    или вывести обратную косую черту.
    Они представляют собой набор последовательностей вида \uaaaaa, где вместо а могут быть какие-либо символы или числа.
    Однако есть специальные символы, которые соответствуют еsсаре-последовательностям.

        \а      Предупреждение (звонок)
        \b      Возврат курсора на шаг
        \f      Перевод страницы
        \n      Следующая строка (перевод на новую строку)
        \r      Возврат каретки
        \t      Табуляция
        \\      Отображение обратной косой черты
        \’      Отображение одинарной кавычки
        \”      Отображение двойной кавычки
        \ааа    Символ восьмеричного значения (не более 377 — т.е. 255 в десятичной системе)

     Рассмотрим теперь строковые литералы.
     Они принадлежат объектам типа String и располагаются между двумя кавычками, например:

        "Строка"
        "Старая строка \п Новая строка"
        "До табуляций \t После табуляции"



    К булевым литералам относятся такие значения, как true (истина) и false (ложь). Они служат для представления логического
    (или булева) типа данных — boolean.
    Наконец последний тип литералов — ссылочный литерал — null. Его можно использовать для присвоения значений объекту,
    т.е. сделать так, чтобы объект не был инициализирован.

    Примеры литералов:

    2 // литерал типа int

    010 // литерал типа int заданный в восьмеричной системе счисления, признаком использования восьмеричной системы является
    нуль в начале числа, в десятеричной системе это будет число 8

    0x10 // литерал типа int заданный в шестнадцатеричной системе счисления, признаком её использования является 0x в начале числа,
    в десятеричной системе это будет число 16

    1.2 // литерал типа double

    2e5 // литерал типа double, записанный в научной нотации, число после e надо воспринимать как показатель степени десятки,
    на которую умножается число указанное до e, т.е. в данном случае записано число 2*10^5 = 200000

    -1.23e-3 // литерал типа double, -1.23*10^-3 = -0.00123

    2L // литерал типа long, можно использовать строчную букву l

    2F // литерал типа float, можно использовать строчную букву f

    2D // литерал типа double, можно использовать строчную букву d

    2e-2f // литерал типа float, численно равен 0.02

    false // литерал типа boolean

    'a' // литерал типа char — печатный символ, задаётся в одинарных кавычках

    '\t' // литерал типа char — специальный символ, не отображается в виде какого-либо значка на экране, но управляет выводом
    или его форматированием, например, данный символ добавляет в вывод символ табуляции (отступа)

    '\u004D'; // литерал типа char заданный своим кодом в шестнадцатеричной системе счисления по кодовой таблице Unicode,
    данный код соответствует букве «M»

    "Россия" // литерал класса String — строка символов, задаётся в двойных кавычках, может содержать любые литералы типа char,
    в том числе состоять из единственного символа или быть пустой

    "При\nвет" // литерал класса String включающий спецсимвол \n, обрывающий строку, при выводе на экран слоги «При»
    и «вет» разместятся на разных строках друг под другом


 */




