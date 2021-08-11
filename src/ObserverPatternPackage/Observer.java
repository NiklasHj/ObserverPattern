package ObserverPatternPackage;

public abstract class Observer {
    protected ISubject _subject;
    protected String _name;
    public abstract void update();
}
