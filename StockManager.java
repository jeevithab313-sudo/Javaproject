class StockManager implements Runnable {

    int stock = 1;

    synchronized void sell() {
        try {
            while (stock == 0) {
                System.out.println("Stock Empty - Waiting...");
                wait();
            }

            stock--;
            System.out.println("Sold 1 item. Stock = " + stock);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    synchronized void addStock() {
        stock++;
        System.out.println("Added 1 item. Stock = " + stock);

        notifyAll();
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            if (Thread.currentThread().getName().equals("Seller"))
                sell();
            else
                addStock();
        }
    }

    public static void main(String[] args) {

        StockManager obj = new StockManager();

        Thread seller = new Thread(obj, "Seller");
        Thread supplier = new Thread(obj, "Supplier");

        seller.start();
        supplier.start();
    }
}