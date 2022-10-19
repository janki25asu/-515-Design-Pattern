package src;

public class Buyer extends Person{
    Buyer() {
        super(theProductMenu);
    }

    Buyer(ProductMenu theProductMenu) {
        super(theProductMenu);
    }

    @Override
    public void ShowMenu() {
        System.out.println("Buyer Menu items are listed below");

    }

    @Override
    public ProductMenu CreateProductMenu() {
        String test = "Meat Product Menu";
        if (test.equalsIgnoreCase("Meat Product Menu")) {
            return new MeatProductMenu();
        } else {
            return new ProduceProductMenu();
        }

    }
}
