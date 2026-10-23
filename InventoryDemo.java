import java.util.Scanner;

class StockException extends Exception {
    StockException(String msg) {
        super(msg);
    }
}

class Inventory {
    int stock = 10;

    void sell(int quantity) throws StockException {
        if (quantity > stock) {
            throw new StockException("Insufficient Stock!");
        }

        stock = stock - quantity;
        System.out.println("Product sold successfully!");
        System.out.println("Remaining stock: " + stock);
    }
}

public class InventoryDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventory obj = new Inventory();

        System.out.println("===== INVENTORY MANAGEMENT SYSTEM =====");
        System.out.println("Available Stock: 10");

        try {
            System.out.print("Enter quantity to sell: ");
            int quantity = sc.nextInt();

            obj.sell(quantity);

        } catch (StockException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }

        sc.close();
    }
}