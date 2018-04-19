package DZ160418;

public class LinkedList<T> {

    private int size = 0;
    private Node firstElem = null;
    private Node lastElem = null;

    public void add(T element) {
        new Node(element);
    }

    public int size() {
        return size;
    }

    public T get(int index) throws Exception {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Элемента с таким индектом нет");
        }
        Node node = firstElem;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return (T) node.element;
    }

    class Node<T> {
        private T element;
        private Node next;
        private Node prev;

        Node(T element) {
            this.element = element;
            this.prev = lastElem;
            this.next = null;
            if (lastElem != null) {
                lastElem.next = this;
            }
            if (firstElem == null) {
                firstElem = this;
            }
            lastElem = this;
            size += 1;
        }
    }

}