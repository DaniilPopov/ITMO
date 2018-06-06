package Duplicate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbers {
    public static void main(String[] args) throws IOException {
        int count = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> set = new HashMap<>();
        System.out.println("Введите число: ");
        while (true) {
            String s1 = reader.readLine();
            if (s1.isEmpty()) {
                break;
            }
            try {
                int value = Integer.parseInt(s1);
                set.put(value, count++);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число");
            }

        }
        for (Map.Entry entry : set.entrySet()) {
            System.out.println("Число " + entry.getKey());
        }
    }
}
