package Builder;

public class Client {
    public static void main(String[] args) {
        Director director1 =new Director();
        System.out.println("Laptop configuration:");
        LaptopBuilder laptopBuilder=new LaptopBuilder();
        director1.construct(laptopBuilder);

        Director director2 =new Director();
        System.out.println("Server configuration:");
        ServerBuilder serverBuider=new ServerBuilder();
        director2.construct(serverBuider);
    }
}
