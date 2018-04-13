package DZ110418;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.*;

public class Collection {

    public static void main(String[] args) throws IOException {

        File newFile = new File("src/DZ110418/wp.txt");
        List<String> list = Files.readAllLines(newFile.toPath());

        List<String> triB = new ArrayList<>();
        List<String> triBnot = new ArrayList<>();
        List<String> dveB = new ArrayList<>();
        List<String> dveBnot = new ArrayList<>();
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;


        String[] e = {"at", "on", "in", "the", "a", "an", "of", "if", "onto", "into", "under",
                "up", "over", "by", "to", "if", "for", "is", "was", "were", "will"};
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, e);




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
        for (String tribuk : triB) {
            Collections.addAll(triBnot, tribuk);
        }
        triBnot.removeAll(strings);
        for (String notatr : triBnot) {
            count4++;
        }
        for (String dvebukv : dveB) {
            Collections.addAll(dveBnot, dvebukv);
        }
        dveBnot.removeAll(strings);
        for (String notart1 : dveBnot) {
            count5++;
        }

        final int length = (int) newFile.length();
        if (length != 0) {
            char[] c = new char[length];

            InputStreamReader isr = new InputStreamReader(new FileInputStream(newFile), "CP1251");

            final int read = isr.read(c);
            String str = new String(c, 0, read);
            str = str.trim();
            str = str.toLowerCase().replaceAll("\\W", " ");
            HashMap<String, Integer> map = new HashMap<>();
            for (String s : str.split(" ")) {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
            map.remove("");

            List list1 = new ArrayList(map.entrySet());
            Collections.sort(list1, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue() - o2.getValue();
                }

            });
            System.out.println("Топ 10 самых частых слов");
            for (int i = list1.size() - 1; i > list1.size() - 11; i--) {
                System.out.println(list1.get(i));

            }

        }

        List<String> bukvlist = new ArrayList<>();
        Hashtable<String, Integer> bukvHT = new Hashtable<>();
        for (String str : list) {
            String[] bukv = str.toLowerCase().replaceAll("\\p{Punct}", "")
                    .replaceAll("\\s+", "")
                    .replaceAll("\\d+", "").trim().split("");
            for (int i = 0; i < bukv.length; i++) {
                bukvlist.add(bukv[i]);
            }
        }
        for (String str1 : bukvlist) {
            if (bukvHT.containsKey(str1)) {
                bukvHT.put(str1, bukvHT.get(str1) + 1);
            } else {
                bukvHT.put(str1, 1);
            }
        }
        bukvHT.remove("");

        Enumeration<String> enumeration = bukvHT.keys();
        int bukv = 0;
        while (enumeration.hasMoreElements()) {
            bukv += bukvHT.get(enumeration.nextElement());
        }
        System.out.println("Кол-во букв в тексте " + bukv);

        Enumeration<String> enumeration1 = bukvHT.keys();
        String b;
        float percent;
        while (enumeration1.hasMoreElements()) {
            b = enumeration1.nextElement();
            percent = 100 * (float) bukvHT.get(b) / (float) bukv;
            System.out.println("Буква " + b + " встречается " + bukvHT.get(b) + " раз, " + percent + "%");
        }




        System.out.println("Слово War встречается в книге: " + count + " раз" + " а слово peace: " + count1 + " раз");
        System.out.println("В файле wp.txt слова содержащие 3 буквы: " + count2);
        System.out.println("В файле wp.txt слова содержащие 3 буквы, но без артиклей, частиц и тп. : " + count4);
        System.out.println("В файле wp.txt слова содержащие 2 буквы: " + count3);
        System.out.println("В файле wp.txt слова содержащие 2 буквы, но без артиклей, частиц и тп. : " + count5);
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