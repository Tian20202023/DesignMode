package SimpleFactory;

public class Man implements Person {
    Man(){
        show();
        eat();
        sleep();
        work();
    }
    public void show(){
        System.out.println("我是一名男性。");
    }
    public void eat() {
        System.out.println("男性正在吃饭。");
    }
    public void sleep() {
        System.out.println("男性正在睡觉。");
    }
    public void work() {
        System.out.println("男性正在工作。");
    }
}
