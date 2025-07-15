package Observer;

public class Client {
    public static void main(String[] args) {
        float temp = 28.0F;
        float humidity = 65.0F;
        float pressure = 1012.0F;
        System.out.println("天气数据已更新：温度="+temp+", 湿度="+humidity+", 气压="+pressure);

        Observer tv = new TVDisplay();
        Observer ph=new PhoneDisplay();

        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(tv);
        weatherData.registerObserver(ph);
        weatherData.notifyObservers(temp,humidity,pressure);
    }
}
