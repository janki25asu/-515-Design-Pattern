package src;

/**
 * Person Factory class responsible for factory pattern and returning the desired objects
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public class PersonFactory extends Person {

    PersonFactory(ProductMenu theProductMenu) {
        super(theProductMenu);
    }

    @Override
    public void ShowMenu(int num) {
        System.out.println("Menu");
    }

    @Override
    public ProductMenu CreateProductMenu(int num) {
        // TODO Auto-generated method stub
        return null;
    }

    public static Person createObject(String str) {
        Person person;
        System.out.println("For user creation - Factory Pattern Initiated");
        if (str.equalsIgnoreCase("Buyer")) {
            person = new Buyer();
        } else

        {
            person = new Seller();
        }
        return person;
    }
}
