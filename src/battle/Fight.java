package battle;

import java.util.Random;

public class Fight {
    public static void fight(Soldier[] whiteArmy, Soldier[] redArmy) {
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            if (rnd.nextBoolean()) {
                whiteArmy[i].attack(redArmy[i]);
            } else redArmy[i].attack(whiteArmy[i]);

        }

    }

    public static void winner(Soldier[] whiteArmy, Soldier[] redArmy) {
        int whiteAlive = 0;
        int redAlive = 0;

        for (int i = 0; i < 10; i++) {

            if (redArmy[i].isAllive()) redAlive++;
            if (whiteArmy[i].isAllive()) whiteAlive++;


        }
        System.out.println("whiteAlive " + whiteAlive + " redAlive " + redAlive);
    }

    public static void main(String[] args) {

        Soldier[] whites = new Soldier[10];
        Soldier[] red = new Soldier[10];

        for (int i = 0; i < 10; i++) {
            whites[i] = new White();
            red[i] = new Red();

        }
        fight(whites, red);
        winner(whites, red);
    }
}
