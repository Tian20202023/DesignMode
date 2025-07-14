package Bridge;

public abstract class Message {
    protected MessageSender sender;
    public void setMessageSender(MessageSender sender) {
        this.sender=sender;
    }
    public abstract void send(String message);
}
