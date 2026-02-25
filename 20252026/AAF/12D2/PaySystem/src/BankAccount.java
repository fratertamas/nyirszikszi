public class BankAccount extends Account implements Payable{

    public BankAccount(String owner, int balance) {
        super(owner, balance);
    }

    @Override
    public String accountType() {
        return "Bankszámla";
    }

    @Override
    public void pay(int amount) {
        if (amount <= 0) return;

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Fizetés sikeres: " + amount);
        } else {
            System.out.println("Nincs elég fedezet.");
        }
    }
}
