class StockMonitor extends Thread {

    String itemName;
    int quantity;

    StockMonitor(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public void run() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);

        if (quantity < 5) {
            System.out.println("Status: Low Stock");
        } else {
            System.out.println("Status: Available");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        StockMonitor item1 = new StockMonitor("Mobile", 10);
        StockMonitor item2 = new StockMonitor("Laptop", 3);
        StockMonitor item3 = new StockMonitor("Headphone", 15);

        item1.start();
        item2.start();
        item3.start();
    }
}