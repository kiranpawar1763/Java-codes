public class main
 {
    public static void main(String[] args) {
        // Test the TwoDigitsSum class
        int number = 34; // Example input
        int sum = TwoDigitsSum.getSumOfDigits(number); // Call the method
        
        // Output the result
        System.out.println("The sum of the digits of " + number + " is: " + sum);
        
        // Additional test case
        number = 57; // Another example input
        sum = TwoDigitsSum.getSumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}

    

