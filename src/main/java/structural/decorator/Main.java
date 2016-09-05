package structural.decorator;

import java.io.FileNotFoundException;

/**
 * Created by Roma on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Decorator decorator = new DecoratorLineBefore(new DecoratorStarAfter(new ConcreteComponentHello()));
        decorator.doOperation();
    }
}
