package School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Students extends School {
    protected int count;
    protected List<String> list;

    protected String getName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();
        while (true) {
            System.out.println("Введите имя студента: ");
            String name = reader.readLine();
            if (name.isEmpty()) {
                break;
            }
            list.add(name);
            count++;
        }
        return list.toString();
    }

    protected int getCount() {

        return count;
    }
}
