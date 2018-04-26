package Lesson8;

interface ParentInterface {
    void parentClassVoid();
}

class ChildClass1 implements ParentInterface {

    @Override
    public void parentClassVoid() {
        // do smth
    }

    ;
}

class ChildClass2 implements ParentInterface {

    @Override
    public void parentClassVoid() {
        // do smth
    }

    ;
}

public class FactoryMethodPattern {

    //  Определяет интерфейс для создания объекта, но оставляет подклассам решение о том, какой класс инстанцировать.
    //  Фабричный метод позволяет классу делегировать создание подклассов.

    //  Используется, когда :
    //  - классу заранее неизвестно, объекты каких подклассов ему нужно создать.
    //  - класс спроектирован так, чтобы объекты, которые он создает, спрецифицировались подклассами.
    //  - класс делегирует свои обязанности одному из нескольких вспомогательных подклассов, и планируется
    // локализовать знание о том, какой класс принимает на себя эти обязанности.
}

class FactorPattern {
    public ParentInterface getChild(String str) {
        if (str.endsWith("A")) return new ChildClass1();
        else return new ChildClass2();
    }


    public void someVoid() {
        FactorPattern factorPattern = new FactorPattern();
        ParentInterface child = factorPattern.getChild("h");
        child.parentClassVoid();
    }
}

