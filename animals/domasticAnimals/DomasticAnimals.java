package animals.domasticAnimals;

import animals.Animal;

public class DomasticAnimals extends Animal { // наследование

    public DomasticAnimals(String name) {
        super(name);

    }

    public void liveWithPeople() {
        System.out.println("I'm live with people");
    }

}
