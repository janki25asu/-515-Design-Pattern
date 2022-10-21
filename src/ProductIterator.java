package src;
import java.util.Iterator;

/**
 * Product Iterator to implement iterator pattern
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public class ProductIterator extends ListIterator{
    @SuppressWarnings("rawtypes")
    public boolean HasNext(Iterator iterator) {
        return iterator.hasNext();
    }

    @SuppressWarnings("rawtypes")
    public void MoveToHead(Iterator iterator) {
        System.out.println("Head Moved");
    }

    @SuppressWarnings("rawtypes")
    public String Next(Iterator iterator) {
        if (this.HasNext(iterator)) {
            return (String) iterator.next();
        } else {
            return null;
        }
    }

    @SuppressWarnings("rawtypes")
    public void Remove(Iterator iterator) {
        if (this.HasNext(iterator)) {
            iterator.next();
        }
    }
}
