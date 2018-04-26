package battle;

abstract class Soldier {
    int health;
    int attackScore;


    public Soldier(int health, int attackScore) {
        this.health = health;
        this.attackScore = attackScore;
    }

    public boolean isAllive() {
        return health > 0;
    }

    abstract void attack(Soldier enemy);
}

class Red extends Soldier {

    public Red() {
        super(300, 10);
    }

    @Override
    public void attack(Soldier enemy) {
        enemy.health -= this.attackScore + 10;
    }
}

class White extends Soldier {

    public White() {
        super(10, 50);
    }

    @Override
    public void attack(Soldier enemy) {
        enemy.health -= this.attackScore + 20;
    }
}
