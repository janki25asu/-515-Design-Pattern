package src;

/**
 * Person abstract class
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public abstract class Person {
    protected static ProductMenu theProductMenu;

    public abstract void ShowMenu(int menuType);

    public abstract ProductMenu CreateProductMenu(int num);

    @SuppressWarnings("static-access")
    Person(ProductMenu theProductMenu) {
        this.theProductMenu = theProductMenu;
    }

    public void ShowAddButtons() {
        theProductMenu.ShowAddButtons();
        System.out.println("Add Button");
    }

    public void showViewButtons() {
        theProductMenu.ShowViewButtons();
    }

    public void ShowRadioButton() {
        theProductMenu.ShowRadioButton();
        System.out.println("Radio Button");
    }

    public void showCombos() {
        theProductMenu.showComboxes();
        System.out.println("Comboxes");
    }

    public void showLabels() {
        theProductMenu.ShowLabels();
        System.out.println("Lables");
    }
}





