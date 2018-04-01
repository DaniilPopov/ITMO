package School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Classs extends School {

    protected String getClasss() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите номер класса:");
        String name = reader.readLine();

        return name;
    }
}
