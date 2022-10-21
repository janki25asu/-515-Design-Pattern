package src;

public class Product {
    String name;
    Product(){
    }
    Product(String n){
        this.name=n;
        System.out.println("Product " + n + " created");
    }

}
