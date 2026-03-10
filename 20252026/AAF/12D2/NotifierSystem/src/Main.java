//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService service1 = new NotificationService(new ConsoleNotifier());
        System.out.println("Channel: " + service1.currentChannel());
        service1.notifyUser("Alice", "Szia! Ez egy konzolos értesítés.");


        NotificationService service2 = new NotificationService(new EmailNotifier());
        System.out.println("Channel: " + service2.currentChannel());
        service2.notifyUser("alice@apenta.com", "Szia! Ez egy ímél értesítés.");
    }
}