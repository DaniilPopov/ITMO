package krBANK;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public static void transferMoney(Account src, Account dst, int amount) {
        int amountSender = src.getAmount();
        int amountRecipient = dst.getAmount();
        if (src.getId() > dst.getId()) {
            synchronized (src) {
                synchronized (dst) {
                    if (src.getAmount() > amount) {
                        amountSender -= amount;
                        amountRecipient += amount;
                        src.setAmount(amountSender);
                        dst.setAmount(amountRecipient);
                    }
                }
            }
        } else {
            synchronized (dst) {
                synchronized (src) {
                    if (src.getAmount() > amount) {
                        amountSender -= amount;
                        amountRecipient += amount;
                        src.setAmount(amountSender);
                        dst.setAmount(amountRecipient);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        List<Account> accounts = new ArrayList<>();

        for (int i = 0; i < 50 ; i++) {
            User user = new User();
            users.add(user);
        }
        for (int i = 0; i < 50 ; i++) {
            int amountR = 0 + (int) (Math.random() * 1000);
            int userR = 0 + (int) (Math.random() * 50);
            Account account = new Account(amountR, users.get(userR));
            accounts.add(account);
        }

        for (int i = 0; i < 50; i++) {
            new Thread(){

                @Override
                public void run() {
                    int src1 = 0 + (int) (Math.random() * 50);
                    int src2 = 0 + (int) (Math.random() * 50);
                    int amou = 0 + (int) (Math.random() * 1000);
                    transferMoney(accounts.get(src1), accounts.get(src2), amou);
                }
            }.start();
        }
        for (Account ac : accounts){
            System.out.println("Остаток денег на счету " + ac.getId() + " - " + ac.getAmount());
        }
    }
}
