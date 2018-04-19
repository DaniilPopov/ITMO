package DZ160418;

public class HeadClass {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("elem1");
        linkedList.add("elem2");
        linkedList.add("elem3");
        linkedList.add("elem4");

        try {
            System.out.println(linkedList.get(1));
            System.out.println(linkedList.get(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(linkedList.size());
    }
}