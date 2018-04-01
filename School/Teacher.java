package School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Teacher extends School {

    protected String getName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя преподавателя:");
        String name = reader.readLine();
        return name;
    }
}
