public abstract class Account {
    protected String owner;
    protected int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Tulaj: " + owner + ", Egyenleg: " + balance + ", Típus: " + accountType());
    }

    public abstract String accountType();
}
