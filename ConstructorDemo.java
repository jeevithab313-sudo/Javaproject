class Electronics
{
    String name;
    double price;

    
    Electronics()
    {
        name = "No Product";
        price = 0;
    }

     
    Electronics(String n, double p)
    {
        name = n;
        price = p;
    }

    
    Electronics(Electronics e)
    {
        name = e.name;
        price = e.price;
    }

    void display()
    {
        System.out.println(name + " " + price);
    }
}

public class ConstructorDemo
{
    public static void main(String args[])
    {
        Electronics e1 = new Electronics();
        Electronics e2 = new Electronics("Laptop", 45000);
        Electronics e3 = new Electronics(e2);

        e1.display();
        e2.display();
        e3.display();
    }
}