package src;
import java.time.Duration;
import java.util.HashMap;
import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Reminder Visitor class responsible for implementing visitor pattern
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public class ReminderVisitor extends NodeVisitor{

    String m_Reminder;
    HashMap<String, LocalDate> proAndExpiryDates = new HashMap<String, LocalDate>();
    public ReminderVisitor(){
        proAndExpiryDates.put("Meat:Beef",LocalDate.of(2022, 12, 12));
        proAndExpiryDates.put("Meat:Pork",LocalDate.of(2022, 12, 6));
        proAndExpiryDates.put("Meat:Mutton",LocalDate.of(2022, 12, 10));
        proAndExpiryDates.put("Produce:Tomato",LocalDate.of(2022, 12, 1));
        proAndExpiryDates.put("Produce:Onion",LocalDate.of(2022, 12, 12));
    }



    @Override
    public void visitFacade(PTBSFacade pfacade) {
        System.out.println("visiting Facade");
    }

    @Override
    public void visitTrading(Trading t) {
        System.out.println("visiting Trading");
        //System.out.println("Days remaining for trading = ",)
        for(String key: proAndExpiryDates.keySet()){
            System.out.println("Product = "+ key + " Total days remaining for Trading = " + Duration.between(LocalDate.now().atStartOfDay(), proAndExpiryDates.get(key).atStartOfDay()).toDays());
        }
    }

    @Override
    public Reminder visitProduct(ProductList prol) {
        System.out.println("visiting Product");
        return prol;
    }
}
