package behavioral.Observer;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.util.LongSummaryStatistics;

import static org.junit.Assert.*;

/**
 * Created by Roma on 04.09.2016.
 * I know maybe it looks a bit strange, but it more or less works, if you have any ideas how to make it better, please write me
 */
public class ConcreteObservableTest {
    private static ConcreteObservable instance;

    @BeforeClass
    public static void setUp() throws Exception {
        instance = new ConcreteObservable();
        instance.addObserver(new ObserverBye());
        instance.addObserver(new ObserverBye());
        instance.addObserver(new ObserverHello());
        instance.addObserver(new ObserverSilent());
    }

    @Test
    public void notifyAllObservers() throws Exception {
        String fileName = "outTestObserver.txt";
        PrintStream st = new PrintStream(new FileOutputStream(fileName));
        System.setOut(st);

        instance.notifyAllObservers();

        //get line number
        LineNumberReader numberReader = new LineNumberReader(new FileReader(new File(fileName)));
        numberReader.skip(Long.MAX_VALUE);
        int realLineNumber = numberReader.getLineNumber();
        numberReader.close();

        //test
        assertEquals(4, realLineNumber);
    }

}