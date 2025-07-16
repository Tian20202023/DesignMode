package command;

public class RemoteControl {
    private Command[] commands;

    public RemoteControl(int buttonCount) {
        commands = new Command[buttonCount];
    }

    // 设置某个按钮对应的命令
    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    // 按下某个按钮
    public void pressButton(int slot) {
        System.out.println("按下按钮 " + slot);
        commands[slot].execute();
    }

}
