package structural.decorator;

/**
 * Created by Roma on 05.09.2016.
 */
public class DecoratorStarAfter extends Decorator {


    public DecoratorStarAfter(IComponent component) {
        super(component);
    }

    @Override
    public void doOperation() {
        component.doOperation();
        System.out.println(new String(new char[10]).replace("\0", "*"));
    }
}
