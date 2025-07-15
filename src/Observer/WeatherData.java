package Observer;

public class WeatherData extends Subject {
    public void notifyObservers(float temp, float humidity, float pressure) {

        for (Observer obs : observers) {
            if (obs != null) {
                try {
                    obs.update(temp,humidity,pressure);
                } catch (Exception e) {
                    System.err.println("观察者响应失败: " + e.getMessage());
                }
            }
        }
    }
}
