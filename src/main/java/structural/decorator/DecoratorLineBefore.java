package structural.decorator;

/**
 * Created by Roma on 05.09.2016.
 */
public class DecoratorLineBefore extends Decorator {

    public DecoratorLineBefore(IComponent component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.println(new String(new char[10]).replace("\0","-"));
        component.doOperation();
    }
}
