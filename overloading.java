class Electronics {

    static String category = "Electronics";
    private String name;

    public void display() {
        System.out.println("Product: " + name);
    }

    public void setProduct(String n) {
        name = n;
    }

    public void setProduct(String n, double price) {
        name = n;
        System.out.println("Price: " + price);
    }

    static void showCategory() {
        System.out.println("Category: " + category);
    }
}

public class overloading{
    public static void main(String[] args) {

        Electronics e = new Electronics();

        e.setProduct("Laptop", 45000);
        e.display();
        Electronics.showCategory();
    }
}