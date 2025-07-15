package Observer;

import java.util.Observable;

public class PhoneDisplay implements Observer {
    public void update(float temp, float humidity, float pressure){
        System.out.println("[手机显示] 天气："+temp+"℃ | 湿度："+humidity+"% | 气压："+pressure+" hPa");
    }
}
