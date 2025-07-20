package Observer;

public class WeatherData extends Subject {
    public void notifyObservers(float temp, float humidity, float pressure) {

        for (Observer obs : observers) {
            if (obs != null) {
                obs.update(temp,humidity,pressure);
            }
        }
    }
}
