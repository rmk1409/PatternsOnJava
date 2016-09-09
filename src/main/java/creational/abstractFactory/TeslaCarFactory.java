package creational.abstractFactory;

/**
 * Created by Roma on 09.09.2016.
 */
public class TeslaCarFactory implements AbstractCarFactory {
    @Override
    public AbstractSedanCar createSedanCar() {
        return new ModelS();
    }

    @Override
    public AbstractISportCar createSportCar() {
        return new Roadster();
    }
}
