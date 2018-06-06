package Lesson10;

public class WildCardsExample {


    public static void main(String[] args) {

        GenericContainer<Integer> intContainer = new GenericContainer<>(null);
        getDouble(intContainer);
    }

    // upper bound wildcard - ограничиваем принимаемый тип сверху,
    // ? -  неизвестный тип
    // extends - указывает на ограничение
    // принимаем Number со всееми потоками
    public static double getDouble(GenericContainer<? extends Number> container) {
        Number val = container.getItemOfDefault(null);
        // нельзя добавить ничего, кроме null, так как неизвестен конкретный тип на моменте компиляции,
        // но можно получить Number
        return val == null ? 0.0 : val.doubleValue();
    }

    // ограничение снизу
    public static void printNum(GenericContainer<? super Number> container) {

        // Можем добавлять Number и всех его наследников, но получить можем только Object;
        Object val = container.getItemOfDefault(0.0);
        System.out.println(val);
    }
}

// можно применять для уточнения типа при описании класса, что бы использовать
// специальзированные методы

class GenericNumContainer<T extends Number> {


}
