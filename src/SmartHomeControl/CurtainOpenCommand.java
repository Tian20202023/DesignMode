package SmartHomeControl;

public class CurtainOpenCommand implements Command {
    private Curtain curtain;

    public CurtainOpenCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.turnOn();
    }

    @Override
    public void undo() {
        curtain.turnOff();
    }
}
