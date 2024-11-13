class Vehicle
{
    protected String make;
    protected int year;
    protected String model;
     
    public Vehicle(String make, String model, int year) 
    {
        this.make = make;
         
        this.year = year;
        this.model =model;

    }

    public void displayInfo() 
    {
        System.out.println("Product make: " + make);
        System.out.println("Product model: " + model);
        System.out.println("product year: " + year);
         
    }
    
}


class car extends Vehicle
{
    private int numberOfDoors;
    public car(String make, String model, int year, int numberOfDoors)
    {
        super(make,model,year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("\nCar details");
        super.displayInfo();
        System.out.println("numbrs of door = "+numberOfDoors);
    }

}
class bike extends Vehicle
{
    private String type;

    bike(String make, String model, int year, String type)
    {
        super(make,model,year);
        this.type = type;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("\nBike details");
        super.displayInfo();
        System.out.println("bike type = "+type);
    }

}


public class test
{
    public static void main(String[] args)
    {
        
     
            car c1 = new car("Audi", "Q8", 2021, 4);
            c1.displayInfo();
    

        

        bike bike = new bike("Yamaha", "MT-07", 2020, "Sports");
              
               bike.displayInfo();
    }
}
