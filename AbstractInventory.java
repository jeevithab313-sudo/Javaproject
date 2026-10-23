import java.util.Scanner;
abstract class Inventory {
    abstract void calculateBill(ProductDetails details);
}
class ProductDetails {
    String name;
    int quantity;
    ProductDetails(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
class Product extends Inventory {
    void calculateBill(ProductDetails details) {
        int price = 50000;
        int total = details.quantity * price;
        System.out.println("\n----- BILL -----");
        System.out.println("Price Per Item : Rs." + price);
        System.out.println("Total Amount : Rs." + total);
        details.quantity = details.quantity + 1;
    }
}
public class AbstractInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String product = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        ProductDetails details = new ProductDetails(product, quantity);
        Inventory p = new Product();
        p.calculateBill(details);
        System.out.println("\n----- AFTER BILL -----");
        System.out.println("Product Name : " + details.name);
        System.out.println("Updated Quantity : " + details.quantity);
    }
}