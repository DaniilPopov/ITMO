package DZ110418;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork {

    public static void main(String[] args) throws IOException {

        File txt = new File("src/DZ110418/collection.txt");
        List<String> list = Files.readAllLines(txt.toPath());
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (String str : list) {
            list1.add(str.toLowerCase().trim().replace(" ", ""));

        }
        for (String word : list1) {
            System.out.println(word);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s1 = iterator.next();
            String[] s2 = s1.split(" ");
            for (String s : s2) {
                list2.add(s);
            }
        }
        for (String str1 : list2) {
            System.out.println(str1);
        }
    }
}
