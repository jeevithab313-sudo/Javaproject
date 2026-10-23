import java.util.Scanner;

class Inventory {
    int choice;

    void selectProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Product List");
        System.out.println("101. Laptop");
        System.out.println("102. Keyboard");
        System.out.println("103. Mouse");
        System.out.println("104. Monitor");
        System.out.println("105. Printer");

        System.out.print("Enter Product Number: ");
        choice = sc.nextInt();
    }
}

class Electronics extends Inventory {
    String product;
    double price;

    void getProduct() {
        switch(choice) {
            case 101:
                product = "Laptop";
                price = 60000;
                break;
            case 102:
                product = "Keyboard";
                price = 1500;
                break;
            case 103:
                product = "Mouse";
                price = 800;
                break;
            case 104:
                product = "Monitor";
                price = 12000;
                break;
            case 105:
                product = "Printer";
                price = 10000;
                break;
            default:
                product = "Invalid";
                price = 0;
        }
    }
}

class Product extends Electronics {
    void display() {
        System.out.println("\nSelected Product : " + product);
        System.out.println("Price : Rs." + price);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Product p = new Product();

        p.selectProduct();
        p.getProduct();
        p.display();
    }
}