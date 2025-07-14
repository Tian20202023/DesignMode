package Proxy;

public class Client {
    public static void main(String[] args) {
        ProxyInternet proxy = new ProxyInternet();
        proxy.list.add("banned.com");
        proxy.connectTo("google.com");
        proxy.connectTo("wikipedia.org");
        proxy.connectTo("banned.com");
    }
}
