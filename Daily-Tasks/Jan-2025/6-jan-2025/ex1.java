/*ues - 3
--------------
Simple Shopping Application
Objective:
Develop a Java program for a simple shopping application that allows users to add products to a shopping cart and calculate the total price of the items in the cart. You will define custom exceptions for handling specific error cases and implement the necessary classes and methods to support the shopping functionality.

Requirements:
Custom Exceptions:

class InsufficientQuantityException(make it a Checked Exception) :
Methods:
Parameterized Constructor with String as parameter

Purpose : Thrown when the requested quantity of a product is not available.

class InvalidProductException(make it an Unchecked Exception):
Methods:
Parameterized Constructor with String as parameter.

Purpose : Thrown when a product is not found in the inventory.

BLC Product Class:

Attributes:
id: int: representing the product's unique identifier.
name: String: representing the product's name.
price: double: representing the product's price.
quantity: int: representing the available quantity of the product.


Constructor: 
Parameterized Constructor to initialize all the atributes.

methods : 
Method name: decreaseQuantity 
Access Modifier : public
return type : void
parameters : amount: int
Takes an integer amount as a parameter and decreases the product's quantity. Throws InsufficientQuantityException if the requested quantity is not available.

BLC  ShoppingCart Class:
Attributes:
cartItems: Product[] : to store items in the cart.
itemCount: int : An integer representing the number of items in the cart.

Constructor:
parameter : capacity : int 
Initialize the cartItems with a Product[] based on the given 
capacity.

Mehtods:

Method name: addToCart 
Access Modifier : public
return type : void
parameters : Product,int
Adds the product to the cart or updates its quantity.Throws InsufficientQuantityException if the requested quantity is not available, or InvalidProductException if the product is not found.


Method name: calculateTotal 
Access Modifier : public
return type : double
parameters : no param
Method: Calculates and returns the total price of all items in the cart.


ElC ShoppingApplication Class:

Main Method: Demonstrates the shopping application's functionality.
Creates some sample products and a shopping cart with a capacity of 10 products.
Adds products to the cart and handles exceptions as needed.
Calculates and displays the total price of the items in the cart.

Test Cases for Shopping Application
-----------------------------------------
Valid Product Addition:
Action: Add valid quantities of products to the cart.
Expected Output: Total price should be calculated correctly.

Insufficient Quantity:
Action: Attempt to add more quantity of a product than available.
Expected Output: Should throw InsufficientQuantityException with appropriate message.

Invalid Product Addition:
Action: Attempt to add a product that does not exist(i,e null).
Expected Output: Should throw InvalidProductException with appropriate message.

Full Cart:
Action: Attempt to add more products than the cart's capacity.
Expected Output: Should throw InvalidProductException with appropriate message.

Calculate Total with Empty Cart:
Action: Calculate total price with no products added.
Expected Output: Total price should be 0.0.

Calculate Total with Mixed Products:
Action: Add different products and quantities, then calculate total price.
Expected Output: Total price should reflect all products and quantities correctly.*/


//Shopping Application

import java.util.Scanner;

class InsufficientQuantityException extends Exception {
    public InsufficientQuantityException(String message) {
        super(message);
    }
}

class InvalidProductException extends RuntimeException {
    public InvalidProductException(String message) {
        super(message);
    }
}

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity(int amount) throws InsufficientQuantityException {
        if (amount > quantity) {
            throw new InsufficientQuantityException("Requested quantity not available for product: " + name);
        }
        quantity -= amount;
    }
}


class ShoppingCart {
    private Product[] cartItems;
    private int itemCount;

    public ShoppingCart(int capacity) {
        this.cartItems = new Product[capacity];
        this.itemCount = 0;
    }

    public void addToCart(Product product, int quantity) throws InsufficientQuantityException {
        if (product == null) {
            throw new InvalidProductException("Product not found.");
        }

        if (itemCount >= cartItems.length) {
            throw new InvalidProductException("Cart is full. Cannot add more products.");
        }

        product.decreaseQuantity(quantity);
        cartItems[itemCount++] = product;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += cartItems[i].getPrice();
        }
        return total;
    }
}


public class ShoppingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product1 = new Product(1, "Laptop", 1000.0, 10);
        Product product2 = new Product(2, "Phone", 500.0, 20);
        Product product3 = new Product(3, "Headphones", 100.0, 15);

        ShoppingCart cart = new ShoppingCart(10);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add to Cart");
            System.out.println("2. Calculate Total");
            System.out.println("3. Exit");
            System.out.print("Enter your option: ");

            int option = scanner.nextInt();

            try {
                switch (option) {
                    case 1:
                        System.out.println("Available Products:");
                        System.out.println("1. Laptop - $1000.0");
                        System.out.println("2. Phone - $500.0");
                        System.out.println("3. Headphones - $100.0");

                        System.out.print("Enter product ID to add: ");
                        int productId = scanner.nextInt();

                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();

                        Product selectedProduct = null;
                        if (productId == 1) {
                            selectedProduct = product1;
                        } else if (productId == 2) {
                            selectedProduct = product2;
                        } else if (productId == 3) {
                            selectedProduct = product3;
                        } else {
                            throw new InvalidProductException("Invalid product ID.");
                        }

                        cart.addToCart(selectedProduct, quantity);
                        System.out.println("Product added to cart successfully.");
                        break;

                    case 2:
                        double total = cart.calculateTotal();
                        System.out.println("Total price of items in the cart: $" + total);
                        break;

                    case 3:
                        System.out.println("Thank you for shopping. Goodbye!");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } catch (InsufficientQuantityException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InvalidProductException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
