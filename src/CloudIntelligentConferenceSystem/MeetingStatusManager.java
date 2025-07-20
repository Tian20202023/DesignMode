package CloudIntelligentConferenceSystem;

import java.util.ArrayList;
import java.util.List;

public class MeetingStatusManager implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
} 