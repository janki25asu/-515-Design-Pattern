package src;
import java.util.ArrayList;

/**
 * Produce Product Menu class responsible for bridge and factory pattern
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public class ProduceProductMenu extends ProductMenu{

    ArrayList<String> produceProduct = new ArrayList<>();
    ProduceProductMenu() {
        produceProduct.add("Tomato");
        produceProduct.add("Onion");
    }


    public void ShowMenu(int b){
        System.out.println("Produce Produce Menu is listed below");
        for (int i = 0; i < produceProduct.size(); i++) {
            System.out.println(produceProduct.get(i) + " ");
        }
    }

    public void selectProduct(int userType) {
        System.out.println("Bridge Pattern is used here");
        Person person;
        if (userType == 0) {
            person = new  Buyer(0,"Buyer2");

        } else
        {
            person = new  Seller(1,"Seller2");

        }
        person.ShowMenu(1);
    }

    @Override
    public void ShowAddButtons() {
        System.out.println();
    }

    @Override
    public void ShowViewButtons() {
        System.out.println();
    }

    @Override
    public void ShowRadioButton() {
        System.out.println();
    }

    @Override
    public void showComboxes() {
        System.out.println();
    }

    @Override
    public void ShowLabels() {
        System.out.println();

    }
}
