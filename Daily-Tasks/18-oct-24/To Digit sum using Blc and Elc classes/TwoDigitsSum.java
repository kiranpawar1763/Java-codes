public class TwoDigitsSum {
    // Method to calculate the sum of digits of a two-digit number
    public static int getSumOfDigits(int number) 
    {
        // Validate that the number is indeed a two-digit number
        if (number < 10 || number > 99)
         {
            throw new IllegalArgumentException("Input must be a two-digit number.");
        }
        
        // Calculate the sum of the digits
        int tens = number / 10;  // Get the tens digit
        int units = number % 10; // Get the units digit
        
        return tens + units; // Return the sum of the digits
    }
}
