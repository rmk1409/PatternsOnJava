package behavioral.Observer;

import behavioral.Observer.IObserver;

/**
 * Created by Roma on 04.09.2016.
 */
public interface Observable {
    void addObserver(IObserver o);
    void remove(IObserver o);
    void notifyAllObservers();
    void changeStatement();
}
