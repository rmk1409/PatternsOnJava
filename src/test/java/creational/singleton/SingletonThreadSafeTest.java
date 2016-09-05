package creational.singleton;

import creational.signleton.SingletonThreadSafe;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Roma on 04.09.2016.
 */
public class SingletonThreadSafeTest {
    @Test
    public void getInstance() throws Exception {
        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();

        //just simple test, it's need to make more tests to check thread-safety
        assertTrue(instance1.equals(instance2));
    }

}