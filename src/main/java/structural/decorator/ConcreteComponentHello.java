package structural.decorator;

/**
 * Created by Roma on 05.09.2016.
 */
public class ConcreteComponentHello implements IComponent {
    @Override
    public void doOperation() {
        System.out.println("Hi! Have good days");
    }
}
