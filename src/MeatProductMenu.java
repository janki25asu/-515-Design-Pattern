package src;
import java.util.ArrayList;

/**
 * Meat Product Menu class responsible for bridge and factory pattern
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public class MeatProductMenu extends ProductMenu{

    ArrayList<String> meatProducts = new ArrayList<>();
    MeatProductMenu() {
        System.out.println("Meat Product Menu is listed below");
        meatProducts.add("Pork");
        meatProducts.add("Beef");
        meatProducts.add("Mutton");
    }

    public void ShowMenu(int menuType){
        System.out.println("Meat Product Menu");
        for (int i = 0; i < meatProducts.size(); i++) {
            System.out.println(meatProducts.get(i) + " ");
        }
    }

    public void selectProduct(int userType) {
        System.out.println("Bridge Pattern is used here");
        Person person;
        if (userType == 0) {
            person = new Buyer(0,"Buyer2");

        } else
        {
            person = new Seller(1,"Seller2");

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
