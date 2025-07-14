package Adapter;

public class Client {
    public static void main(String[] args) {
        Power5V power5V=new VoltageAdapter();
        PowerSource220V powerSource220V=new PowerSource220V();
        powerSource220V.output220V();
        power5V.output5V();
    }
}
