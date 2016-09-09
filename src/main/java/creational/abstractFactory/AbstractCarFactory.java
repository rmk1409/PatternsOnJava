package creational.abstractFactory;

/**
 * Created by Roma on 09.09.2016.
 * Not very popular pattern "AbstractFactory":
 *  - using this pattern allows to interchange concrete implementations without changing the code that uses them;
 *  - we can use this pattern when there are similar trees of objects in application
 */
public interface AbstractCarFactory {
    AbstractSedanCar createSedanCar();
    AbstractISportCar createSportCar();
}
