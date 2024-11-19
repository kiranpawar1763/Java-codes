class Vehicle
{
    
        protected String brand;
        protected int year;
        public Vehicle(String brand, int year) 
        {
            this.brand = brand;
            this.year = year;
        }
        public void displayInfo() 
    {
        System.out.println("Brand Name: " + brand);
        System.out.println("manufacture year" + year);

    }
    
}

class Motorcycle extends Vehicle
{
    private String brand;
    public Motorcycle(int engin, int cc)
        {
        super(engin, cc);
        this.brand = brand;
    }
}
