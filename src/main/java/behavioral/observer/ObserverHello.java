package behavioral.observer;

/**
 * Created by Roma on 04.09.2016.
 */
public class ObserverHello implements IObserver {
    public void handleEvent() {
        System.out.println("Hello");
    }
}
