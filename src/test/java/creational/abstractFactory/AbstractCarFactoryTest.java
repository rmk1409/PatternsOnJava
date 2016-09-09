package creational.abstractFactory;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Roma on 09.09.2016.
 */
public class AbstractCarFactoryTest {
    @Test
    public void createSedanCar() throws Exception {
        AbstractCarFactory carFactory = new BMWCarFactory();
        AbstractSedanCar sedanCar = carFactory.createSedanCar();

        assertTrue(sedanCar.getClass().equals(M5CSL.class));
    }

    @Test
    public void createSportCar() throws Exception {
        AbstractCarFactory carFactory = new TeslaCarFactory();
        AbstractISportCar sportCar = carFactory.createSportCar();

        assertTrue(sportCar.getClass().equals(Roadster.class));
    }

}