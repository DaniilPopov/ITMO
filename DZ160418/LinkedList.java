package DZ160418;

public class LinkedList<T> {

    private Node<T> firstN;
    private Node<T> lastN;
    private int size;

    public LinkedList() {
        this.firstN = new Node<>(null, null, lastN);
        this.lastN = new Node<>(null, firstN, null);
    }

    public void firstadd(T value) {
        Node<T> first = firstN;
        first.setValue(value);
        firstN = new Node<>(null, null, first);
        first.setPrev(firstN);
        size++;
    }

    public void lastadd(T value) {
        Node<T> last = lastN;
        last.setValue(value);
        lastN = new Node<>(null, last, null);
        last.setNext(lastN);
        size++;
    }

    public int size() {
        return size;
    }

// public T get(int index){
// Node<T> indexelem = firstN.getNext();
// for (int i = 0; i < index ; i++) {
// indexelem = getNext(indexelem);
// }
// return indexelem.getValue();
// }
// private Node<T> getNext(Node<T> elem){
// return elem.getNext();
// }

}