package Adapter;

public class PowerSource220V {
    public void output220V(){
        System.out.println("原始电压：220V");
    }
    public void change(){
        System.out.print("通过适配器转换后电压:");
    }
}
