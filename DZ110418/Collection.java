package DZ110418;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {

    public static void main(String[] args) throws IOException {

        File newFile = new File("src/DZ110418/wp.txt");
        List<String> list = Files.readAllLines(newFile.toPath());

        List<String> triB = new ArrayList<>();
        List<String> dveB = new ArrayList<>();
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s1 = iterator.next();
            if (s1.contains("War")) {
                count++;
            }
            if (s1.contains("peace")) {
                count1++;
            }
            String[] s = s1.split("\\s+");
            for (String str : s) {
                if (str.length() == 3) {
                    triB.add(str);
                    count2++;

                }
                if (str.length() == 2) {
                    dveB.add(str);
                    count3++;
                }
            }


        }
        System.out.println("Слово War встречается в книге: " + count + " раз" + " а слово peace: " + count1 + " раз");
        System.out.println("В файле wp.txt слова содержащие 3 буквы: " + count2);
        System.out.println("В файле wp.txt слова содержащие 2 буквы: " + count3);
    }
}


/*
Сосчитать частоту встречаемости слов в книге War and peace.
2. Собрать все слова в группы по количеству букв: например, в одну группу попадут слова:
 [the, war, jar, get, met...], в другую [on, up, no, of...].

3. Вывести топ 10 самых частых слов и фраз.

4. Тоже, что и 2, но без артиклей, частиц и тп (без the, a, on, to...).

5. Вывести частоту встречаемости букв анг алфавита по этой книге. Вывести в процентах для каждой буквы.
Плюс доделать задание с лекции
 */