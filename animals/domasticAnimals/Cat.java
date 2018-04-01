package animals.domasticAnimals;

import animals.Animal;

public class Cat extends DomasticAnimals {
    public Cat(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        cat.say();
        cat.say("мяууууу");

        Dog dog = new Dog("Rich");
        dog.say();

        // Полиформизм наследования
        Animal animal = new Cat("animal - cat");
        animal.say();
        Animal animal1 = new Dog("animal - dog");
        animal1.say();
    }

    @Override
    public void say() {
        System.out.println("Мяу - мяу");
    }

    // перегруз методов - на разные типы аргументов
    // вызываются разные методы, но с содинаковым названиемs
    public void say(String text) {
        System.out.println("cat say" + text);
    }
}
