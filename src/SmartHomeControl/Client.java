package SmartHomeControl;

public class Client {
    public static void main(String[] args) {
        // 创建设备实例
        AirConditioner livingRoomAC = new AirConditioner("客厅空调");
        RemoteControl remote = new RemoteControl();

        // 用户：语音输入“打开空调”
        System.out.println("用户：语音输入“打开空调”");
        // 构建责任链
        Handler acHandler = new ACHandler(livingRoomAC);
        VoiceHandler voiceHandler = new VoiceHandler();
        voiceHandler.setNext(acHandler);
        voiceHandler.handle("语音输入 打开空调");
        System.out.println(" -> 状态变更为：" + (livingRoomAC.getState() instanceof OnState ? "开启状态" : "关闭状态"));

        // 传感器：检测到温度下降 -> 通知空调
        TemperatureSensor tempSensor = new TemperatureSensor();
        tempSensor.registerObserver(livingRoomAC);
        tempSensor.setTemperature(22); // 模拟温度下降，这将触发 AirConditioner.update() 和 EnergySavingStrategy.execute()

        // 用户撤销操作 -> 空调执行 undo -> 状态变为关闭
        Command acOnCommandForUndo = new AirConditionerOpenCommand(livingRoomAC);
        remote.pressButton(acOnCommandForUndo); // 再次“打开空调”，目的是让 remote.lastCommand 有效
        remote.pressUndo(); // 撤销上一个命令，这将导致空调关闭
        System.out.println("用户撤销操作 -> 空调执行 undo -> 状态变为" + (livingRoomAC.getState() instanceof OnState ? "开启状态" : "关闭状态"));
    }
}
