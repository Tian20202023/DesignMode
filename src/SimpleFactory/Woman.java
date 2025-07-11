package SimpleFactory;

public class Woman implements Person {
    Woman(){
        show();
        eat();
        sleep();
        work();
    }
    public void show(){
        System.out.println("我是一名女性。");
    }
    public void eat() {
        System.out.println("女性正在吃饭。");
    }
    public void sleep() {
        System.out.println("女性正在睡觉。");
    }
    public void work() {
        System.out.println("女性正在工作。");
    }
}
