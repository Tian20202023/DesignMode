package mediator;

public class SmartHomeMediator implements SmartMediator {
    private Light light;
    private Curtain curtain;
    private CoffeeMachine coffeeMachine;

    public SmartHomeMediator(Light light, Curtain curtain, CoffeeMachine coffeeMachine) {
        this.light = light;
        this.curtain = curtain;
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void notify(Device device, String event) {
        if (device instanceof Alarm && event.equals("alarm triggered")) {
            System.out.println("中介者：开启灯光。");
            light.turnOn();
            System.out.println("中介者：拉开窗帘。");
            curtain.open();
            System.out.println("中介者：启动咖啡机。");
            coffeeMachine.start();
        }
    }
}
