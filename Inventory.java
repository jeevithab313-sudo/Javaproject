package InventorySystem.Store;

import java.util.*;

class Product {
    String name, category;
    int productId, quantity;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Name:");
        name = sc.nextLine();

        System.out.println("Enter Product ID:");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Category:");
        category = sc.nextLine();

        System.out.println("Enter Quantity:");
        quantity = sc.nextInt();
    }
}

class Stock extends Product {
    double price;

    public void getinput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Price:");
        price = sc.nextDouble();
    }
}

public class Inventory extends Stock {

    public void checkStock() {
        if (quantity > 0)
            System.out.println("Stock Status : Available");
        else
            System.out.println("Stock Status : Out of Stock");
    }

    public void display() {
        System.out.println("===================================");
        System.out.println("       INVENTORY DETAILS");
        System.out.println("===================================");
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + name);
        System.out.println("Category : " + category);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        checkStock();
    }
}