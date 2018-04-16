package DZ160418;

public class HeadClass {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.lastadd("Первое значение");
        linkedList.lastadd("Второе значение");
        linkedList.lastadd("Третье значение");
        linkedList.lastadd("Четвертое значение");
        System.out.println("Размер linledList " + linkedList.size());
// // метод гет не работает!!
// for (int i = 0; i < linkedList.size() ; i++) {
// System.out.println(linkedList.get(i));
// }
        linkedList.firstadd("1");
        linkedList.firstadd("2");

// for (int i = 0; i < linkedList.size() ; i++) {
// System.out.println(linkedList.get(i));
// }
    }
}