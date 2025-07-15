package Observer;

public class TVDisplay implements Observer {
    public void update(float temp, float humidity, float pressure) {
        System.out.println("[电视显示] 天气："+temp+"℃ | 湿度："+humidity+"% | 气压："+pressure+" hPa");
    }
}
