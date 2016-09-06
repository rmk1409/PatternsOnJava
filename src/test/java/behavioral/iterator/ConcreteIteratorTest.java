package behavioral.iterator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Roma on 06.09.2016.
 */
public class ConcreteIteratorTest {
    private Iterable<Integer> iterable;
    private IIterator<Integer> iterator;

    @Before
    public void setUp() throws Exception {
        iterable = new ConcreteIterable<>(new Integer[]{2,4,6,8,1});
        iterator = iterable.getIterator();
    }

    @Test
    public void getNext() throws Exception {
        assertEquals(iterator.getNext(), new Integer(2));
        assertEquals(iterator.getNext(), new Integer(4));
        assertEquals(iterator.getNext(), new Integer(6));
        assertEquals(iterator.getNext(), new Integer(8));
        assertEquals(iterator.getNext(), new Integer(1));
    }

    @Test
    public void hasNext() throws Exception {
        assertTrue(iterator.hasNext());
        iterator.getNext();
        assertTrue(iterator.hasNext());
        iterator.getNext();
        assertTrue(iterator.hasNext());
        iterator.getNext();
        assertTrue(iterator.hasNext());
        iterator.getNext();
        assertTrue(iterator.hasNext());
        iterator.getNext();

        assertFalse(iterator.hasNext());
    }

    @Test
    public void remove() throws Exception {
        iterator.remove();
        assertEquals(iterator.getNext(), new Integer(4));
        iterator.remove();
        iterator.remove();
        assertEquals(iterator.getNext(), new Integer(1));
    }

}