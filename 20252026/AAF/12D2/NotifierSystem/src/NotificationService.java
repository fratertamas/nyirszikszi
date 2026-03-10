public class NotificationService {
    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String userId, String message) {
        String to = userId;
        notifier.send(to, message);
    }

    public String currentChannel() {
        return notifier.channel();
    }
}
