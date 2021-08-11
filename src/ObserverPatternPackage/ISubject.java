package ObserverPatternPackage;

public interface ISubject {
    void notifyAllObservers();
    void attach(Observer observer);
    void detach(Observer observer);
    void setState(String state);
    String getState();
}
