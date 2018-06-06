package Bank;

public class Account {

    private final int id;
    private final int userId;
    private int ammout;
    private User user;

    public Account(User user, int ammout, int id, int userId) {
        this.ammout = ammout;
        this.id = id;
        this.userId = userId;
        this.user = user;
    }

    public int getAmmout() {
        return ammout;
    }

    public void setAmmout(int ammout) {
        this.ammout = ammout;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
