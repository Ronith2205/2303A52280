import java.util.List;

public class Main {

    public static void main(String[] args) {

        NotificationService service =
                new NotificationService();

        List<Notification> notifications =
                service.fetchNotifications();

        PriorityNotificationManager manager =
                new PriorityNotificationManager();

        List<Notification> top10 =
                manager.getTopNotifications(
                        notifications, 10);

        top10.forEach(System.out::println);
    }
}