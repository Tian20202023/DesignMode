package mediator;

public class Client {
    public static void main(String[] args) {
        // 创建中介者和设备
        SmartMediator mediator = new SmartHomeMediator(
                new Light(null),
                new Curtain(null),
                new CoffeeMachine(null)
        );

        // 设置设备的中介者引用
        Light light = new Light(mediator);
        Curtain curtain = new Curtain(mediator);
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator);
        Alarm alarm = new Alarm(mediator);

        // 模拟闹钟触发
        alarm.trigger();
    }
}
