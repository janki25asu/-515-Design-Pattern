package src;

/**
 * Node Visitor class for Visitor pattern
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public abstract class NodeVisitor {

    public abstract void visitFacade(PTBSFacade pfacade);

    public abstract void visitTrading(Trading t);

    public abstract Reminder visitProduct(ProductList prol);

}
