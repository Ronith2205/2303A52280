public class Notification {
    private String ID;
    private String Type;
    private String Message;
    private String Timestamp;

    public Notification(String ID, String Type, String Message, String Timestamp) {
        this.ID = ID;
        this.Type = Type;
        this.Message = Message;
        this.Timestamp = Timestamp;
    }

    public String getID() {
        return ID;
    }

    public String getType() {
        return Type;
    }

    public String getMessage() {
        return Message;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    @Override
    public String toString() {
        return Type + " | " + Message + " | " + Timestamp;
    }
}