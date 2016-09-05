package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roma on 04.09.2016.
 */
public class ConcreteObservable implements Observable{
    private List<IObserver> observerList = new ArrayList<>();

    public void addObserver(IObserver o) {
        observerList.add(o);
    }

    public void remove(IObserver o) {
        observerList.remove(o);
    }

    public void notifyAllObservers() {
        observerList.forEach(IObserver::handleEvent);
    }

    @Override
    public void changeStatement() {

        //something happens here

        notifyAllObservers();
    }
}
