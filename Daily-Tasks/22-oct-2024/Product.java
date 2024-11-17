import java.util.Scanner;

class Product {
    // Properties
    private int productId;
    private String productName;
    private double productPrice;

    // Method to set product data
    public void setProductData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        this.productId = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter Product Name: ");
        this.productName = scanner.nextLine();

        System.out.print("Enter Product Price: ");
        this.productPrice = scanner.nextDouble();

        System.out.println("Product data has been set successfully.\n");
    }

    // Method to get product information
    public void getProductInfo() {
        System.out.println("Product Details:");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Product product = new Product();

        // Set product data
        product.setProductData();

        // Display product info
        product.getProductInfo();
    }
}
