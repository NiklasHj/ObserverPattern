package ObserverPatternPackage;

import java.util.ArrayList;
import java.util.List;

public class Channel implements ISubject{
    private List<Observer> _observers = new ArrayList<Observer>();
    protected String _state;

    @Override
    public void notifyAllObservers() {
        for (Observer observer : _observers) {
            observer.update();
        }
    }

    @Override
    public void attach(Observer observer) {
        _observers.add(observer);
        for (Observer obs : _observers){
            if(obs._subject == null) {
                obs._subject = this;
            }
        }
    }

    @Override
    public void detach(Observer observer) {
        for (Observer obs : _observers){
            if(obs.equals(observer)) {
                obs._subject = null;
            }
        }
        _observers.remove(observer);
    }

    @Override
    public void setState(String state) {
        this._state = state;
        notifyAllObservers();
    }

    @Override
    public String getState() {
        return _state;
    }
}
