package SimpleFactory;

public class Robot implements Person{
    Robot(){
        show();
        eat();
        sleep();
        work();
    }
    public void show(){
        System.out.println("我是一台机器人。");
    }
    public void eat() {
        System.out.println("机器人不需要吃饭。");
    }
    public void sleep() {
        System.out.println("机器人不需要睡觉。");
    }
    public void work() {
        System.out.println("机器人正在高速工作。");
    }
}
