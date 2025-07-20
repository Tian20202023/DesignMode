package mediator;

public abstract class Device {
    protected SmartMediator mediator;

    public Device(SmartMediator mediator) {
        this.mediator = mediator;
    }

    public void send(String event) {
        mediator.notify(this, event);
    }
}
