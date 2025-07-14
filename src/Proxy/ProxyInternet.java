package Proxy;

import Decorater.BeverageDecorator;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private RealInternet realInternet;

    public List<String> list=new ArrayList<>();
    public void connectTo(String serverhost){
        if(realInternet==null){
            realInternet=new RealInternet();
        }
        if(list.contains(serverhost))
            System.out.println("访问被拒绝："+serverhost);
        else
            realInternet.connectTo(serverhost);
    }
}
