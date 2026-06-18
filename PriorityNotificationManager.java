import java.util.List;

public class PriorityNotificationManager {

    public int getWeight(String type) {
        if (type.equals("Placement")) {
            return 3;
        } else if (type.equals("Result")) {
            return 2;
        } else {
            return 1;
        }
    }

    public List<Notification> getTopNotifications(
            List<Notification> notifications,
            int n) {

        return notifications;
    }
}