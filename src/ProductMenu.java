package src;

/**
 * abstract Product Menu class
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public abstract class ProductMenu {

    public abstract void ShowAddButtons();

    public abstract void ShowViewButtons();

    public abstract void ShowRadioButton();

    public abstract void showComboxes();

    public abstract void ShowLabels();

    public abstract void selectProduct(int USerType);

    public void createProductList() {
        System.out.println("Product List created!");
    }

    public void attachProductToUser() {
        System.out.println("User Attached!");
    }

    public void productOperation() {
        System.out.println("Operation performed on the product!");
    }

}
