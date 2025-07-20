package Facade;

public class HomeFacade {
    //管理子系统
    private AirConditioner airConditioner;
    private Light light;
    private SecuritySystem securitySystem;

    public HomeFacade() {
        airConditioner = new AirConditioner();
        light = new Light();
        securitySystem = new SecuritySystem();
    }
    public void homeMode(){
        System.out.println("【回家模式】");
        airConditioner.on();
        light.on();
        securitySystem.off();
    }
    public void awayMode(){
        System.out.println("【离家模式】");
        airConditioner.off();
        light.off();
        securitySystem.on();
    }
}
