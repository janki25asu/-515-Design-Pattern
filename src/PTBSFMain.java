package src;

/**
 * PTBS main class to call the facade
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public class PTBSFMain {

    public static void main(String[] args) {
        // Facade Design Pattern is called here
        PTBSFacade object = new PTBSFacade();
        object.startFacade();

        Person h = new Buyer(0, "buyer1");
        System.out.println("Please Select \n 1. Meat Produce Menu \n 2. Produce Product Menu");

        Product p = new Product();
        h.ShowMenu(object.menuType);

        h.CreateProductMenu(object.menuType);

        ReminderVisitor rv = new ReminderVisitor();
        System.out.println("Reminder Visitor class has been called here");
        Trading t = new Trading();
        rv.visitTrading(t);
    }
}
