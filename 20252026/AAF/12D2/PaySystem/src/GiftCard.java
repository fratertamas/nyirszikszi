public class GiftCard extends Account implements Payable{
    public GiftCard(String owner, int balance) {
        super(owner, balance);
    }

    @Override
    public String accountType() {
        return "Ajándékkártya";
    }

    @Override
    public void pay(int amount) {
        if (amount <= 0) return;

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Ajándékkártyás fizetés: " + amount);
        } else {
            System.out.println("Az ajándékkártyán nincs elég összeg.");
        }
    }
}
