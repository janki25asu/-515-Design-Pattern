package src;
import java.util.Scanner;

/**
 * Instructor class inherits person class
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public class Seller extends Person {
    Seller() {
        super(theProductMenu);
        System.out.println("Calling seller constructor");
    }

    int UserType;
    String userName;
    Seller(int userType,String userName){
        this();
        this.UserType=userType;
        this.userName=userName;
        System.out.println("Seller is: "+userName);
    }

    Seller(ProductMenu theProductMenu) {
        super(theProductMenu);
    }

    public void ShowMenu(int b)  {
        System.out.println("Buyer Menu items are listed below");
        System.out.println("1. Meat Product Menu");
        System.out.println("2. Produce Product Menu");
        System.out.println("Please select either 1 or 2 from the above mentioned options");

        Scanner scan = new Scanner(System.in);
        int menuNum = scan.nextInt();
        if(menuNum == 1){
            System.out.println("Meat Produce Menu");
            MeatProductMenu mpm = new MeatProductMenu() ;
            mpm.ShowMenu(menuNum);
        }
        if(menuNum == 2){
            System.out.println("Produce Produce Menu");
            ProduceProductMenu ppm = new ProduceProductMenu() ;
            ppm.ShowMenu(menuNum);
        }
    }

    public ProductMenu CreateProductMenu(int b){
        String s = "Meat Produce";
        if (s.equalsIgnoreCase("Meat Produce")) {
            return new MeatProductMenu();
        } else {
            return new ProduceProductMenu();
        }
    }
}
