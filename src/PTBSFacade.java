package src;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Facade class to take care of the facade pattern
 * The interface class between the GUI and the underlining system, the
 * control logic and many of the operating functions are included in this class.
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public class PTBSFacade {
    int UserType;
    String theSelectProduct;
    int nProductCategory;
    int theProductList;
    int thePerson;
    Person person;
    int menuType;
    private ProductList productList;

    public void startFacade() {
        System.out.println("Facade pattern called");
        UserType = login(new Login());

        System.out.println("Do you want to add Trading ?(1/0)");
        Scanner scan = new Scanner(System.in);
        int trade = scan.nextInt();
        if(trade == 1){
            System.out.println("Add trading");
            this.addTrading();
        }

        System.out.println("Do you want to view trading?(1/0)");
        trade= scan.nextInt();
        if(trade==1){
            viewTrading();
        }

        UserInfoItem a = new UserInfoItem(this.UserType,"Janki");
        createUser(a);
        ProductList proList= new ProductList();
        selectProduct(proList);

        System.out.println("Implementing Visitor Pattern");
        remind();
        System.out.println("Implementing Iterator pattern");
        ProductList p = new ProductList();
        Iterator iterate = (Iterator) p.createIterator();
        ProductIterator pIterator = new ProductIterator();
        ProductList pList1 = new ProductList();
        Iterator iterate2 = (Iterator) pList1.createIterator();
        ProductIterator si = new ProductIterator();
        while (pIterator.HasNext(iterate)) {
            System.out.println(pIterator.Next(iterate));
        }
        System.out.println("Select from available Product Menus " +
                        "\n 1. Meat Produce Menu " +
                        "\n 2. Produce Product Menu");
        menuType= scan.nextInt();
        scan.close();
    }

    public int login(Login obj) {
        return obj.login();
    }

    public void addTrading(){
        System.out.println("Trading information is provided below");
        if(this.UserType==0){
            BuyerTradingMenu.buyertradingMenu();
        }
        else{
            SellerTradingMenu.sellertradingMenu();
        }

    }

    public void createProductList(ProductMenu PM) {
        PM.createProductList();
    }

    public void viewTrading(){
        System.out.println("Viewing trading info");
        if(this.UserType==0){
            BuyerTradingMenu.buyertradingMenu();
        }
        else{
            SellerTradingMenu.sellertradingMenu();
        }
////        p.addTrading();
    }
    public void viewOffering(){
        System.out.println("View Offerings");
    }
    public void markOffering(Offering a){
        a.setDeal();
    }
    public void submitOffering(Offering a){
        a.submitOffering();
    }
    //    public void decideBidding(Bidding b){
//        b.decideBidding();
//    }
//    public void discussBidding(){}
//    public void submitBidding(){}
    public void remind(){
        System.out.println("This is remind message");
    }

    public void productOperation(ProductMenu p){
        p.productOperation();
    }
    public void attachProductToUser(ProductMenu p){
        p.attachProductToUser();
    }
    public void createUser(UserInfoItem userinfoitem){
        userinfoitem.createUser();
    }
    public void createProductlist(ProductMenu p){
        p.createProductList();
    }
    public String selectProduct(ProductList p){
        p.display();
        System.out.println("Enter id of product to select");
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();

        System.out.println(p.pro.get(t));
        Product p1 =new Product(p.pro.get(t));
        return theSelectProduct;
    }
}


