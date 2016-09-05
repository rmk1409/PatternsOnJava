package structural.decorator;

/**
 * Created by Roma on 05.09.2016.
 */
public abstract class Decorator implements IComponent {
    protected IComponent component;

    public Decorator(IComponent component) {
        this.component = component;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }
}
