package ObserverPatternPackage;

import ObserverPatternPackage.Observer;

public class Subscriber extends Observer {

    public Subscriber(String name){
        super();
        this._name = name;
    }
    @Override
    public void update() {
        System.out.println("My name is: " + this._name +" and " + this._subject.getState() + " WOHOOOOO!");
    }
}
