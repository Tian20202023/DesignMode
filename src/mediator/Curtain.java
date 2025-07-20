package mediator;

public class Curtain extends Device {
    public Curtain(SmartMediator mediator) {
        super(mediator);
    }

    public void open() {
        System.out.println("Curtain已打开。");
    }
}
