package krBANK;

public class Account {
    private int amount;
    private final int id;
    private final int userID;
    private static int count = 0;


    public Account(int amount, User user) {
        this.id = count++;
        this.amount = amount;
        userID = user.getId();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getUserID() {
        return userID;
    }
}
