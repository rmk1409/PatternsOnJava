package behavioral.iterator;

/**
 * Created by Roma on 06.09.2016.
 */
public interface Iterable<T> {
    IIterator<T> getIterator();
}
