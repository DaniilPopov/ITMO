package krBANK;

public class User {
    private int id;
    private static int count = 0;

    public User() {
        this.id = count++;
    }

    public int getId() {
        return id;
    }
}
