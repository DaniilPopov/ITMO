package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public static void main(String[] args) throws InterruptedException {

        User user1 = new User(0);
        User user2 = new User(1);
        User user3 = new User(2);
        Account account1 = new Account(user1, 100, 0, 0);
        Account account2 = new Account(user1, 5000, 1, 0);
        Account account3 = new Account(user2, 500, 2, 1);
        Account account4 = new Account(user3, 10000, 3, 2);

        List<SomeThread> sm = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            sm.add(new SomeThread());
        }

        for (SomeThread s : sm) {
            s.start();
        }
        for (SomeThread s : sm) {
            s.join();
        }


    }

    public static void transferMoney(Account src, Account dst, int ammount) {

        while (true) {
            if (src == dst) {
                System.out.println("в поле кому вы указали один и тот же аккаунт");
            }

            if (src.getAmmout() < ammount) {
                System.out.println("На вашем счете недостаточно средств");
            }

            if (src.getAmmout() >= ammount) {
                src.setAmmout(src.getAmmout() - ammount);
                dst.setAmmout(dst.getAmmout() + ammount);
            }
        }


    }

    public static class SomeThread2 extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {

            }
        }
    }

    public static class SomeThread extends Thread {

        @Override
        public void run() {
            while (!isInterrupted()) {
                synchronized (this) {
                    try {

                    } catch (Exception o) {
                        o.printStackTrace();
                    }
                }
            }
        }
    }
}
