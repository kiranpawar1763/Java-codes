public class Dog {
    // Properties
    private String name;
    private double height;
    private int age;

    // Constructor to initialize the properties
    public Dog(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    // Method to get dog information
    public void getDogInformation() {
        System.out.println("Dog Name: " + name);
        System.out.println("Height: " + height + " inches");
        System.out.println("Age: " + age + " years");
    }

    // Method to simulate the dog barking
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }

    public static void main(String[] args) 
    {
        // Creating a Dog object
        Dog myDog = new Dog("Buddy", 25.5, 3);

        // Displaying the dog's information
        myDog.getDogInformation();

        // Making the dog bark
        myDog.bark();
    }
}
