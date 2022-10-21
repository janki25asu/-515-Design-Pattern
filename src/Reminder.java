package src;

/**
 * Abstract Reminder class for Visitor Pattern
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public abstract class Reminder {
    public abstract void accept(NodeVisitor NV);
}
