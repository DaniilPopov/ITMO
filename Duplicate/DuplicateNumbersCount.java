package Duplicate;

import java.util.*;

public class DuplicateNumbersCount {

    public static void main(String[] args) {

        Integer[] value = {10, 12, 14, 16, 20, 40, 10, 12, 14};

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, value);
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer integer : list) {
            if (map.containsKey(integer)) {
                map.put(integer, map.get(integer) + 1);
            } else {
                map.put(integer, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {

            System.out.println("Цифра " + entry.getKey() + " встречается " + entry.getValue());
        }

    }
}
