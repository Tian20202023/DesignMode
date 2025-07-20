package SmartHomeControl;

public class AirConditionerOpenCommand implements Command {
    private AirConditioner ac;

    public AirConditionerOpenCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
