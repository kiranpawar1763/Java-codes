

/*Write a Java program that demonstrates how to handle ArithmeticException. 
The program should include a method that performs division and throws an 
ArithmeticException if division by zero occurs. 
Implement exception handling in the main method to catch and handle this exception.

Instructions:
Create a class named DivisionExample:

Implement a static method performDivision :
Takes two integer parameters: dividend and divisor.
Access Modifier : public
Non-Access Modifier : static
return type : int
parameters : int, int

Performs division dividend / divisor.
Throws an ArithmeticException if divisor is zero.

Implement the main method:
Inside the main method, call the performDivision method with different inputs, including zero as a divisor.
Use a try-catch block to catch and handle any ArithmeticException thrown by performDivision.
Print an appropriate error message when division by zero occurs.
Test the program:

Write test cases to cover scenarios with valid and invalid inputs for the divisor, including zero.


Test Case 1: Valid division
Input as : 
Enter dividend : 10
Enter divisor : 2

Output as :
Result of division: 5

Test Case 2: Division by zero
Input as : 
Enter dividend : 5
Enter divisor : 0

Output :
ArithmeticException caught: Division by zero: dividend=5, divisor=0

*/
import java.util.Scanner;
public class DivisionExample 
{

    public static int performDivision(int dividend, int divisor) 
    {
        if (divisor == 0) 
        {
            throw new ArithmeticException("Division by zero: dividend=" + dividend + ", divisor=" + divisor);
        }
        return dividend / divisor;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter dividend: ");
        int dividend = scanner.nextInt();

        System.err.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        try 
        {
            int result = performDivision(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) 
        {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        }

        scanner.close();
    }
}