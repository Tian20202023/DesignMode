package SmartHomeControl;

public abstract class SmartDevice {
    protected DeviceState state;
    protected String name;

    public SmartDevice(String name) {
        this.name = name;
        this.state = new OffState(); // Initial state
    }

    public void setState(DeviceState state) {
        this.state = state;
    }

    public DeviceState getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public void turnOn() {
        state.turnOn(this);
    }

    public void turnOff() {
        state.turnOff(this);
    }

    // Template method pattern steps
    public final void startup() {
        check();
        powerOn();
        startFan();
    }

    protected abstract void check();
    protected abstract void powerOn();
    protected abstract void startFan();
}
