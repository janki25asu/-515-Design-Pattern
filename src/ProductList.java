package src;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Product List class to implement the iterator pattern
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

@SuppressWarnings("rawtypes")
public class ProductList extends Reminder {
    ArrayList<String> pro = new ArrayList<>();

    ProductList() {
        pro.add("Meat:Beef");
        pro.add("Meat:Pork");
        pro.add("Meat:Mutton");
        pro.add("Produce:Tomato");
        pro.add("Produce:Onion");

        System.out.println("Product List has been created using constructor");
    }

    public void display() {
        for (int i = 0; i < pro.size(); i++) {
            System.out.println(pro.get(i) + " ");
        }
    }
    public Iterator createIterator(){
        return this.pro.iterator();
    }

    public void accept(NodeVisitor nv){
        System.out.println("Product List Reminder!!");
    }

}
