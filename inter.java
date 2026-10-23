
import java.util.Scanner;
interface Inventory {
    void bill(ProductDetails p);
}
interface Discount {
    void showDiscount();
}
class ProductDetails {
    String name;
    int price;
    ProductDetails(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
class Product implements Inventory, Discount {
    public void bill(ProductDetails p) {
        int discount = 1000;
        p.price = p.price - discount;
        System.out.println("\n------ BILL ------");
        System.out.println("Product Name : " + p.name);
        System.out.println("Original Price : Rs." + (p.price + discount));
        System.out.println("Discount : Rs." + discount);
        System.out.println("Final Price : Rs." + p.price);
    }
    public void showDiscount() {
        System.out.println("Discount is available");
    }
}
public class inter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        int price = sc.nextInt();
        ProductDetails details = new ProductDetails(name, price);
        Product p = new Product();
        p.showDiscount();
        p.bill(details);
        System.out.println("\nPrice after bill method : Rs." + details.price);
    }
}