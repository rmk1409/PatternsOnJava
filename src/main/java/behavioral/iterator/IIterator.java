package behavioral.iterator;

/**
 * Created by Roma on 06.09.2016.
 */
public interface IIterator<T> {
    T getNext();

    boolean hasNext();

    void remove();
}
