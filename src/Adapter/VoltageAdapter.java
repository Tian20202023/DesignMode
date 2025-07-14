package Adapter;

public class VoltageAdapter extends PowerSource220V implements Power5V {
    public void output5V(){
        super.change();
        System.out.println("5V");
        System.out.println("手机正在使用5V电压充电...");
    }
}
