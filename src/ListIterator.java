package src;
import java.util.Iterator;

/**
 * List iterator class for implementing iterator pattern
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public abstract class ListIterator {
    @SuppressWarnings("rawtypes")
    public abstract boolean HasNext(Iterator iterator);

    @SuppressWarnings("rawtypes")
    public abstract void MoveToHead(Iterator iterator);

    @SuppressWarnings("rawtypes")
    public abstract String Next(Iterator iterator);

    @SuppressWarnings("rawtypes")
    public abstract void Remove(Iterator iterator);
}
