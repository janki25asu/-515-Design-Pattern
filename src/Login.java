package src;
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Login class - using facade implementing the login functionality
 *
 * @author
 * Name: Janki Padiya
 * ASU ID: 1226130804
 * Email: jpadiya@asu.edu
 */

public class Login {
    int userType;
    HashMap<String,String> buyerInfoMap = new HashMap<String,String>();
    HashMap<String,String> SellerInfoMap = new HashMap<String,String>();

    Login() {
        userType = 0;
    }

    public void readFromFileData() {
        try {
            File obj = new File("E:\\Downloads\\515p\\515-Design-Pattern\\src\\BuyerInfo.txt");
            Scanner scan = new Scanner(obj);
            while (scan.hasNextLine()) {
                String str = scan.nextLine();
                String[] strArray = str.split(":");
                buyerInfoMap.put(strArray[0], strArray[1]);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Thrown Exception. An error has occurred!");
            e.printStackTrace();
        }

        try {
            File obj = new File("E:\\Downloads\\515p\\515-Design-Pattern\\src\\SellerInfo.txt");
            Scanner scan = new Scanner(obj);
            while (scan.hasNextLine()) {
                String str = scan.nextLine();
                String[] strArray = str.split(":");
                SellerInfoMap.put(strArray[0], strArray[1]);
                System.out.println(strArray);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Thrown Exception. An error has occurred!");
            e.printStackTrace();
        }
    }

    public int login() {
        System.out.println("Enter Username ");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String username = scan.next();
        System.out.println("Enter Password ");
        String password = scan.next();

        readFromFileData();

        int flag = 0;
        if(buyerInfoMap.containsKey(username)){
            if (password.equals(buyerInfoMap.get(username))){
                userType = 0;           //type = 0 means a buyer
                Buyer b1 = new Buyer(0,username);
                System.out.println("Welcome Buyer!");
            }else{
                System.out.println("Credentials are incorrect!!");
                System.exit(-1);
            }
        }
        else if(SellerInfoMap.containsKey(username)){
            if (password.equals(SellerInfoMap.get(username))){
                userType = 1;           //type = 1 means a seller
                System.out.println("Welcome Seller!");
            }
            else{
                System.out.println("Credentials are incorrect!!");
                System.exit(-1);
            }
        }
        else{
            System.out.println("Invalid Credentials!!");
            System.exit(-1);
        }
        return userType;
    }
}
