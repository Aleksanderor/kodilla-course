package task2;

public class EmailOrderNotificationService implements OrderNotificationService {
    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Sending email to " + user.getEmail() + ": " + message);
    }
}

