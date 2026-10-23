class ProductStock implements Runnable {

    String productName;
    int stock;

    ProductStock(String productName, int stock) {
        this.productName = productName;
        this.stock = stock;
    }

    public void run() {

        System.out.println("Product Name : " + productName);
        System.out.println("Stock        : " + stock);

        if (stock < 5)
            System.out.println("Status       : Low Stock");
        else
            System.out.println("Status       : Available");

        System.out.println();
    }

    public static void main(String[] args) {

        ProductStock p1 = new ProductStock("Mobile", 10);
        ProductStock p2 = new ProductStock("Laptop", 3);
        ProductStock p3 = new ProductStock("Headphone", 15);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t1.start();
        t2.start();
        t3.start();
    }
}