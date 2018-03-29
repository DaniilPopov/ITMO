import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lec {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("First elem");
        list.add("Second elem");
        list.add(1, "some element");
        String str = list.get(1);
        System.out.println(list + " " + str + " " + list.indexOf("some element") + " " + list.size());

        List<String> list1 = new LinkedList<>();
        list1.add("srr1");
        list1.add("srr2");
        list1.add("srr3");
        list1.add("srr4");
        System.out.println(list1);

    }
}

