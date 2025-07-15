package Observer;

import java.util.ArrayList;

public abstract class Subject {

    protected ArrayList<Observer> observers=new ArrayList<>();

    public void registerObserver(Observer observer){
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObservers(float temp, float humidity, float pressure);
}
