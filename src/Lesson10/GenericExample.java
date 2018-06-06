package Lesson10;

public class GenericExample {

    public static void main(String[] args) {
        Container container = new Container("Some value");
        Container container2 = new Container(null);
        String str = (String) container.getItemOrDefault("Default value");
        Integer integer = (Integer) container2.getItemOrDefault(0);
        System.out.println(str);
        System.out.println(integer);


        GenericContainer<String> genericContainer = new GenericContainer<>("Some value");
        GenericContainer<Integer> genericContainer2 = new GenericContainer<>(null);
        String string = genericContainer.getItemOfDefault("Value");
        Integer integer1 = genericContainer2.getItemOfDefault(0);

        System.out.println(string);
        System.out.println(integer1);

        // raw - типы
        GenericContainer genericContainer3 = new GenericContainer("Some value");
        String string1 = (String) genericContainer3.getItemOfDefault("Value");


        Pair<String, Integer> pair = new Pair<>("key", 4);

        GenericContainer<Number> numbCont = new GenericContainer<>(null);
        Number number = numbCont.getItemOfDefault(0);
        Number number1 = numbCont.getItemOfDefault(0.0);
    }

}


class Container {
    private Object item;

    public Container(Object item) {
        this.item = item;
    }

    public Object getItemOrDefault(Object dflt) {
        return item == null ? dflt : item;
    }

}

class GenericContainer<T> {     //в угловых скобках указывается неизвестный тип

    private T item;

    public GenericContainer(T item) {
        this.item = item;
    }

    public T getItemOfDefault(T dflt) {
        return item == null ? dflt : item;
    }

}

class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}















