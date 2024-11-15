
class Animal 
{
    protected String name;
    protected int Age;
    public Animal(String name, int Age) 
    {
        this.name = name;
        this.Age = Age;
    }

    public void displayInfo() 
    {
        System.out.println("Animal Name: " + name);
        System.out.println("Age :" + Age);
    }
    public void makesound()
    {
        System.out.println("The animal makes a generic sound.");
        
    }
}


class Lion extends Animal
{
    private int menLenghth;
    public Lion(String name, int menLenghth, int  age)
        {
        super(name, age);
        if (menLenghth <= 0)
        {
            System.out.println("Error Invalid Input");
            return;
        }
        this.menLenghth = menLenghth;
    }
    @Override
    public void makesound()
    {
   
    	System.out.println("The lion roars loudly");
        
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("MenLenghth = "+menLenghth);
    }

}
class Elephant extends Animal
{
    private float tuskLength;

    public Elephant(String name, int Age, float tuskLength)
        {
            super(name, Age);
            if (tuskLength <= 0) {
                System.out.println("Error Invalid Input");
                return;
            }
            
            this.tuskLength = tuskLength;
        }
    @Override
    public void makesound() {
        System.out.println("The elephant trumpets.");
    }


    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Size = "+tuskLength);
    }

}


public class ZooManegment
{
    public static void main(String[] args)
    {
        
        Lion lion = new Lion("shimba",20 , 5);
    

        System.out.println("Lion details:");
        lion.displayInfo();
        lion.makesound();
        System.out.println();

        Elephant elephant = new Elephant("Jumbo", 10,  (float)2.6);

        System.out.println("Elephat details:");
        
        elephant.displayInfo();
        elephant.makesound();
        
        
        

    
    }
}
