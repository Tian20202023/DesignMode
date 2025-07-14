package Facade;

public class Client {
    public static void main(String[] args) {
        HomeFacade home = new HomeFacade();
        home.homeMode();
        home.awayMode();
    }
}
