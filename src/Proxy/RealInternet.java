package Proxy;

import Decorater.BeverageDecorator;

public class RealInternet implements Internet {
    public void connectTo(String serverhost){
        System.out.println("连接到"+serverhost);
    }
}
