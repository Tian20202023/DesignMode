package strategy;

public class Client {
    public static void main(String[] args) {
        TravelContext context=new TravelContext(new BikeStrategy());
        context.excuteStrategy("A","B");
        System.out.println("-------");
        TravelContext context2=new TravelContext(new SubwayStrategy());
        context2.excuteStrategy("A","B");
    }
}
