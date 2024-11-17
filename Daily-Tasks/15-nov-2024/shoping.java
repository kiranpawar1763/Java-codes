class Product
{
    protected String name;
    protected double price;
    public Product(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    public  void displayInfo()
    {
        System.out.println("product categary =" + name);
        System.out.println("product price = "+price);
    }
    public double calculateTotalCost(int Quantity)
    {
        return price * Quantity;
    }
}
 class Electronics extends Product
 {
    private String brand;
    public Electronics(String name ,double price,String brand)
    {
    super(name,price);
    this.brand=brand;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Brand name ="+brand);
    }
 }
 class Clothing extends Product
 {
    private String size;
    public Clothing(String name,double price,String size)
    {
        super(name,price);
        this.size=size;
    }
    @Override
    public void displayInfo()
    { 
        super.displayInfo();
        System.out.println("size ="+size);
    }
 }
public class shoping
{
    public static void main(String[]args)
    {
        Electronics laptop = new Electronics("Laptop", 1200.00, "Dell");
        int laptopQuantity = 2;
        System.out.println("Electronics Details:");
        laptop.displayInfo();
        System.out.println("Total Cost for " + laptopQuantity + " units: " + laptop.calculateTotalCost(laptopQuantity));
        System.out.println();  
        
        Clothing shirts =new Clothing(" shirt",25,"xl");
        int shirtQuentity =2;
        System.out .println("clothas Details:");
        shirts.displayInfo();
        System.out.println("total cost for shirts = " +shirtQuentity+ "Units :" +shirts.calculateTotalCost(shirtQuentity));
        System.out.println();
    }

}