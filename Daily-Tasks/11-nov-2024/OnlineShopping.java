
class Product 
{
    protected String name;
    protected double price;
    public Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() 
    {
        System.out.println("Product Name: " + name);
        System.out.println("Price: Rs" + price);
    }
    public double calculateTotalCost(int quantity)
        {
        return price * quantity;
    }
}


class Electronics extends Product 
{
    private String brand;
    public Electronics(String name, double price, String brand)
        {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Brand = "+brand);
    }

}
class Clothing extends Product
{
    private String size;

    public Clothing(String name, double price, String size)
    {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Size = "+size);
    }

}


public class OnlineShopping
{
    public static void main(String[] args)
    {
        
        Electronics laptop = new Electronics("Laptop", 30000.0, "Dell");

        System.out.println("Electronics Product Details:");

        laptop.displayInfo();

        System.out.println("Total Cost for 3 units: Rs" + laptop.calculateTotalCost(3));

        System.out.println();

        Clothing tshirt = new Clothing("T-Shirt", 500.0, "M");

        System.out.println("Clothing Product Details:");
        
        tshirt.displayInfo();

        System.out.println("Total Cost for 5 units: Rs" + tshirt.calculateTotalCost(5));
    }
}
