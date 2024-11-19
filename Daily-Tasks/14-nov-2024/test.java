class Animal
{
    private String name;
    
     
    public Animal(String name) 
    {
        this.name = name;
         

    }

    public void displayInfo() 
    {
        System.out.println("Animal name: " + name);
        
         
    }
    
}


class Mammal extends Animal
{
    private boolean  hasFur;
    public Mammal(String name, boolean hasFur) 
    {
        super(name); 
        this.hasFur = hasFur;
    }
    
    @Override
    public void displayInfo()
    {
        System.out.println("mammal details");
        super.displayInfo();
        System.out.println("hasFur"+hasFur);
    }

}
class Dog extends Mammal
{
    private String breed;

    public Dog(String name, boolean hasFur, String breed)
     {
        super(name, hasFur); 
        
        this.breed = breed;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("breed details");
        super.displayInfo();
        System.out.println("brred type = "+breed);
    }

}


public class test
{
    public static void main(String[] args)
    {
         Dog myDog = new Dog("Buddy", true, "Golden Retriever");
          myDog.displayInfo();
    }
}
