package creational.abstractFactory;

/**
 * Created by Roma on 09.09.2016.
 */
public class BMWCarFactory implements AbstractCarFactory {
    @Override
    public AbstractSedanCar createSedanCar() {
        return new M5CSL();
    }

    @Override
    public AbstractISportCar createSportCar() {
        return new X5();
    }
}
