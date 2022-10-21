package src;
import java.util.ArrayList;
import java.util.Iterator;

public class OfferingList {
    ArrayList<String> offlist = new ArrayList<>();

    OfferingList() {
        offlist.add("Offering Meat:Beef");
        offlist.add("Offering Meat:Pork");
        offlist.add("Offering Meat:Mutton");
        offlist.add("Offering Produce:Tomato");
        offlist.add("Offering Produce:Onion");
    }

    @SuppressWarnings("rawtypes")
    public Iterator createIterator() {
        return this.offlist.iterator();
    }
}
