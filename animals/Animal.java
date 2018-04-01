package animals;

public class Animal {
    // модификаторы доступа
//    public - виден везде
//    protected виден только в рамках пакета, где находтся класс и наследникам из любого пакета
//    private  - виден только в рамках своего класса

    //    default - (без модификатора) - виден в рамках толлько своего класса
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("I'm Animal");
    }
}
