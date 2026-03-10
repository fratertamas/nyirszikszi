public class EmailNotifier implements Notifier{
    @Override
    public void send(String to, String message) {
        System.out.println("[EMAIL] Sending email to " + to);
        System.out.println("Message: " + message);
    }

    @Override
    public String channel() {
        return "email";
    }
}
