package src;

/**
 * Buyer Class inheriting from person class and implementing bridge pattern
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */
public class Buyer extends Person{
    Buyer() {
        super(theProductMenu);
        System.out.println("Calling buyer constructor");
    }
    Buyer(ProductMenu theProductMenu) {
        super(theProductMenu);
    }

    int UserType;
    String userName;
    Buyer(int userType,String userName){
        this();
        this.UserType=userType;
        this.userName=userName;
        System.out.println("Buyer is: "+userName);
    }

    //getter method
    public int getUserType() {
        return UserType;
    }

    //getter method
    public String getUsername() {
        return userName;
    }

    @Override
    public void ShowMenu(int menuType) {
        System.out.println("Buyer Menu items are listed below");
        System.out.println("1. Meat Product Menu");
        System.out.println("2. Produce Product Menu");
        System.out.println("Please select either 1 or 2 from the above mentioned options");

        if(menuType == 1){
            System.out.println("Meat Product Menu");
            CreateProductMenu(1);
        }
        if(menuType == 2){
            System.out.println("Produce Product Menu");
            CreateProductMenu(2);
        }
    }

    @Override
    public ProductMenu CreateProductMenu(int menuType) {
        System.out.println("You've selected product: "+menuType);

        if(menuType == 1){
            //if option 1 is selected then MeatProductMenu() will be executed
            MeatProductMenu mpm = new MeatProductMenu();
            mpm.ShowMenu(menuType);
            return mpm;
        }
        if(menuType == 2){
            //if option 2 is selected then ProduceProductMenu() will be executed
            ProduceProductMenu ppm = new ProduceProductMenu();
            ppm.ShowMenu(menuType);
            return ppm;
        }
        return null;
    }
}
