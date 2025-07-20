package mediator;

public class Light extends Device {
    public Light(SmartMediator mediator) {
        super(mediator);
    }

    public void turnOn() {
        System.out.println("Light已开启。");
    }
}
