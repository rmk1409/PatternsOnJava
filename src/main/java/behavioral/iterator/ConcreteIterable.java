package behavioral.iterator;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by Roma on 06.09.2016.
 * Good example of using inner classes
 */
public class ConcreteIterable<T> implements Iterable<T> {
    private T[] ar;

    public ConcreteIterable(T[] ar) {
        this.ar = ar;
    }

    @Override
    public IIterator<T> getIterator() {
        return new ConcreteIterator();
    }

    /**
     * Inner class for iterator realisation
     */
    private class ConcreteIterator implements IIterator<T> {
        private int cursor = -1;

        @Override
        public T getNext() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            return ar[++cursor];
        }

        @Override
        public boolean hasNext() {
            return ar.length > cursor + 1 && ar[cursor + 1] != null;
        }

        @Override
        public void remove() {
            cursor++;

            System.arraycopy(ar, cursor + 1, ar, cursor, ar.length - cursor - 1);
            ar[ar.length-1]=null;

            cursor--;
        }
    }
}
