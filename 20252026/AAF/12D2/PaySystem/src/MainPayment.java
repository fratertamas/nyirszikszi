import java.util.ArrayList;
import java.util.List;

public class MainPayment {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        accounts.add(new BankAccount("Kati", 10000));
        accounts.add(new BankAccount("Peti", 1000));
        accounts.add(new GiftCard("Juli", 5000));
        accounts.add(new GiftCard("Bence", 200));

        for (Account a : accounts) {
            a.displayInfo();

            if (a instanceof Payable) {
                Payable p = (Payable) a;
                p.pay(1200);
                a.displayInfo();
            }

            System.out.println("-------------");
        }
    }
}
