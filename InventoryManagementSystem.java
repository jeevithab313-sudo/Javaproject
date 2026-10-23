import java.util.Scanner;

class Inventory
{
    int id, quantity;
    String name;
    double price;

    Inventory(int i, String n, int q, double p)
    {
        id = i;
        name = n;
        quantity = q;
        price = p;
    }

    void display()
    {
        System.out.println(id + " " + name + " " + quantity + " " + price);
    }

    void update(int q, double p)
    {
        quantity = q;
        price = p;
    }
}

public class InventoryManagementSystem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Inventory p1 = new Inventory(101, "Laptop", 10, 45000);
        Inventory p2 = new Inventory(102, "Mobile", 20, 25000);
        Inventory p3 = new Inventory(103, "Tablet", 15, 18000);

        System.out.println("1. Laptop");
        System.out.println("2. Mobile");
        System.out.println("3. Tablet");

        System.out.print("Choose product to update: ");
        int choice = sc.nextInt();

        System.out.print("Enter new quantity: ");
        int q = sc.nextInt();

        System.out.print("Enter new price: ");
        double p = sc.nextDouble();

        if(choice == 1)
            p1.update(q, p);
        else if(choice == 2)
            p2.update(q, p);
        else if(choice == 3)
            p3.update(q, p);
        else
            System.out.println("Invalid choice");

        System.out.println("\nUpdated Product:");

        if(choice == 1)
            p1.display();
        else if(choice == 2)
            p2.display();
        else if(choice == 3)
            p3.display();
    }
}