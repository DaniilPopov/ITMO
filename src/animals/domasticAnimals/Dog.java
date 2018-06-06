package animals.domasticAnimals;

public class Dog extends DomasticAnimals {
    public Dog(String name) {
        super(name);
    }

    //переопределение метода родительского класса
    @Override
    public void say() {
//        super.say();  //вызов родительского метода
        System.out.println("Гав - Гав");
    }

}
