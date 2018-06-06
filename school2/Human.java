package school2;

public interface Human {
    String getName();

    void setName(String name);
}

interface Teacher extends Human {
    void teach(Pupil pupil);
}

interface Pupil extends Human {
    void study();
}

class FirstYearPupil implements Pupil, Teacher {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void study() {

    }

    @Override
    public void teach(Pupil pupil) {

    }
}

abstract class DomasticAnimal {
    public String getName() {
        return "DomasticAnimal";
    }

    abstract void eat();
}

class Dog extends DomasticAnimal {

    @Override
    void eat() {

    }
}

class Cat extends DomasticAnimal {

    @Override
    void eat() {

    }
}