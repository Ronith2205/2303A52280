import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    public List<Notification> fetchNotifications() {

        List<Notification> notifications = new ArrayList<>();

        notifications.add(
            new Notification(
                "1",
                "Placement",
                "CSX Corporation hiring",
                "2026-04-22 17:51:18"
            )
        );

        notifications.add(
            new Notification(
                "2",
                "Result",
                "mid-sem",
                "2026-04-22 17:51:30"
            )
        );

        return notifications;
    }
}