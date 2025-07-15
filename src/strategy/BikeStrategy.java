package strategy;

public class BikeStrategy implements TravelStrategy{
    public void travel(String from, String to){
        System.out.println("从"+from+"出发到"+to+"，选择出行方式：骑自行车");
        System.out.println("使用自行车出行，从"+from+"到"+to+"需要约30分钟。");
    }
}
