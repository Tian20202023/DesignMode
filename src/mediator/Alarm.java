package mediator;

public class Alarm extends Device {
    public Alarm(SmartMediator mediator) {
        super(mediator);
    }

    public void trigger() {
        System.out.println("Alarm响起，通知中介者。");
        send("alarm triggered");
    }
}
