package SimpleFactory;

public class Client {
    public static void main(String[] args) {
        NvwaFactory factory=new NvwaFactory();
        factory.createPerson("Man");
        System.out.println("----------------------------------");
        factory.createPerson("Woman");
        System.out.println("----------------------------------");
        factory.createPerson("Robot");
        System.out.println("----------------------------------");
        factory.createPerson("Bob");
        System.out.println("----------------------------------");
    }
}