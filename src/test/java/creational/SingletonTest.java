package creational;

import static org.junit.Assert.*;

/**
 * Created by Roma on 04.09.2016.
 */
public class SingletonTest {
    @org.junit.Test
    public void getInstance() throws Exception {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertTrue(singleton1.equals(singleton2));
    }

}