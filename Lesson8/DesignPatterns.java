package Lesson8;

public class DesignPatterns {

    public static void main(String[] args) {

        SingletonPattern singletonPattern = SingletonPattern.getInstanse();

        SingletonPattern singletonPattern2 = SingletonPattern.getInstanse();

        SingletonPattern singletonPattern3 = SingletonPattern.getInstanse();
    }
}

//  Есть разница работы в многопоточной среде.
//  Одиночка Singleton
//  У Singleton класса есть только один экземпляр, и он предоставляет к нему точку доступа

class SingletonPattern {

    //  Объект создается в классе!!!
    private static final SingletonPattern INSTANSE = new SingletonPattern();

    //  приватный конструктор обязательно.
    private SingletonPattern() {
    }

    public static SingletonPattern getInstanse() {
        return INSTANSE;
    }
}

class SingletonPattern2 {

    private static SingletonPattern2 instance;

    private SingletonPattern2() {
    }

    public static SingletonPattern2 getInstance() {

        if (instance == null) instance = new SingletonPattern2();

        return instance;
    }
}


