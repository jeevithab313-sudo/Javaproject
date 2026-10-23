class Inventory implements Runnable {

    String itemName;
    int quantity;

    Inventory(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public void run() {

        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity  : " + quantity);

        if (quantity < 5)
            System.out.println("Status    : Low Stock");
        else
            System.out.println("Status    : Available");

        System.out.println();
    }

    public static void main(String[] args) {

        Inventory item1 = new Inventory("Mobile", 10);
        Inventory item2 = new Inventory("Laptop", 3);
        Inventory item3 = new Inventory("Headphone", 15);

        Thread t1 = new Thread(item1);
        Thread t2 = new Thread(item2);
        Thread t3 = new Thread(item3);

        t1.start();
        t2.start();
        t3.start();
    }
}