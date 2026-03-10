public interface Notifier {
    void send(String to, String message);
    String channel();
}
