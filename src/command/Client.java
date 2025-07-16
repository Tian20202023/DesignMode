package command;

public class Client {
    public static void main(String[] args) {
        // 创建设备
        Light light = new Light();
        Fan fan = new Fan();
        TV tv = new TV();

        // 创建命令
        Command lightCommand = new LightOnCommand(light);
        Command fanCommand = new FanOnCommand(fan);
        Command tvCommand = new TVOnCommand(tv);

        // 创建遥控器（3个按钮）
        RemoteControl remote = new RemoteControl(3);

        // 设置按钮功能
        remote.setCommand(0, lightCommand);
        remote.setCommand(1, fanCommand);
        remote.setCommand(2, tvCommand);

        // 模拟按按钮
        remote.pressButton(0); // 灯已打开
        remote.pressButton(1); // 风扇开始运行
        remote.pressButton(2); // 电视已开启
    }
}
