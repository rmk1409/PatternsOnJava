package creational.abstractFactory;

/**
 * Created by Roma on 09.09.2016.
 */
public class LadaCarFactory implements AbstractCarFactory {
    @Override
    public AbstractSedanCar createSedanCar() {
        return new Granta();
    }

    @Override
    public AbstractISportCar createSportCar() {
        return new GrantaSport();
    }
}
