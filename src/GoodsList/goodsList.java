package GoodsList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class goodsList {
    public static final String ADD = "add date";
    public static final String SHOW = "show date";
    public static final String CLOSE = "close";

    private Map<String, Map<String, Integer>> card = new HashMap<>();
    private Map<String, Integer> good = new HashMap<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        goodsList list = new goodsList();

        while (true) {
            System.out.println("Введите чего-нибудь:");
            String data = reader.readLine();

            if (data.equals(ADD)) {
                System.out.println("Введите данные: ");
                String data1 = reader.readLine();
                list.addCard(data1);
            } else
            if (data.equals(SHOW)) {
                list.showCard();
            } else if (data.equals(CLOSE)) {
                System.exit(0);
            } else {
                System.out.println("Введите корректную команду");
            }
        }
    }

    public Map<String, Map<String, Integer>> getCard() {
        return card;
    }

    public void addCard(String str) {
        Map<String, Integer> good = new HashMap<>();
        String[] arr = str.split(" ");
        String name = arr[0];
        String tov = arr[1];
        int num = Integer.parseInt(arr[2]);

        if (this.card.containsKey(tov)) {
            good = card.get(name);
            if (good.containsKey(tov)) {
                good.put(tov, good.get(tov + num));
            } else {
                good.put(tov, num);
            }
        } else {
            good.put(tov, num);
        }
        this.card.put(name, good);
    }

    public void showCard() {
        for (Map.Entry entry : card.entrySet()) {
            System.out.println(entry.getKey() + " : ");
            for (Map.Entry entry1 : card.get(entry.getKey()).entrySet()) {
                System.out.println(entry1.getKey() + " " + entry1.getValue());
            }
        }
    }

    public boolean validator(String str) {

        String[] string = str.split(" ");
        if (string.length != 3) {
            return false;
        }
        if (!(string[0].replace("[a-zA-Zа-яА-Я]", "").isEmpty())) {
            return false;
        }
        return true;
    }
}
