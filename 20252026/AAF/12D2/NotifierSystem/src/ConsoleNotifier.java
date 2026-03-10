public class ConsoleNotifier implements Notifier{
    @Override
    public void send(String to, String message) {
        System.out.println("[CONSOLE] To: " + to + " | " + message);
    }

    @Override
    public String channel() {
        return "console";
    }
}
