package SmartHomeControl;

public class AirConditioner extends SmartDevice implements Observer {
    // Original turnOn/turnOff methods are now handled by SmartDevice

    public AirConditioner(String name) {
        super(name);
    }

    @Override
    public void update(double temperature) {
        System.out.println("传感器：检测到温度下降 -> 通知空调");
        if (temperature > 28) {
            this.setStrategy(new FastResponseStrategy()); // Example: change strategy based on event
            this.run();
        } else {
            this.setStrategy(new EnergySavingStrategy()); // Example: change strategy based on event
            this.run();
        }
    }

    @Override
    protected void check() {
    }

    @Override
    protected void powerOn() {
    }

    @Override
    protected void startFan() {
    }

    private DeviceStrategy strategy;

    public void setStrategy(DeviceStrategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        if (strategy != null) {
            strategy.execute();
        } else {
            System.out.println("No strategy set for " + name + ".");
        }
    }
}
