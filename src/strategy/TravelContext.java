package strategy;

public class TravelContext {
    private TravelStrategy strategy;
    public TravelContext(TravelStrategy strategy) {
        this.strategy = strategy;
    }
    public void excuteStrategy(String from, String to){
        strategy.travel(from, to);
    }

}
