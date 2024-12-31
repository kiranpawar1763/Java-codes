/*Handling ArrayStoreException in Java
Objective:
Write a Java program that demonstrates how to handle ArrayStoreException. 
The program should include a method that attempts to store objects of incompatible
 types into an array of String[]. Implement exception handling in the main method to 
 catch and handle this exception.

Instructions:
Create a class named ArrayStoreExample:

Implement a static method storeObjects that:

method name : storeObjects
Access Modifiers : public
Non-Access Modifier : static
return type : void

Initializes an Object array of type String[] with a size of 5.
Attempts to store objects of different types (String, Integer, etc.) into the
 array using array indexing.
Throws an ArrayStoreException if an attempt is made to store an object that is not
 compatible with String.

Implement the main method:
Inside the main method, call the storeObjects method with different objects, 
including objects of incompatible types.
Use a try-catch block to catch and handle any ArrayStoreException thrown by 
storeObjects.
Print an appropriate error message when an incompatible object type is attempted 
to be stored in the array.
Test the program:

Test Case 1:
Store objects of different types in the array
      strings[0] = "Hello";   // Storing a String
      strings[1] = "World";   // Storing another String
      strings[2] = "Java";    // Storing another String
Output as :
Objects stored successfully.

Test Case 2:
 // Store objects of different types in the array
            strings[0] = "Hello";   // Storing a String
            strings[1] = "World";   // Storing another String
            strings[2] = 123;       // Trying to store an Integer in a String array

Output as :
ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in
 an array of java.lang.String

*/

public class ArrayStoreException
 {
    public static void main(String[] args) 
    {
        storeObjects();
    }

    public static void storeObjects() 
    {
        Object[] strings = new String[5];
        try
        { 
        // test 1
        // strings[0] = "Hello";
        // strings[1] = "World";
        // strings[2] = "Java";

        //test 2 
        strings[0]="Hellow";
        strings[1]="word";
        strings[2]=123;
        System.err.println("Objects stored successfully.");
        }
    
        catch (java.lang.ArrayStoreException e) 
        {
            System.out.println("ArrayStoreException caught: Incompatible type: " + e.getMessage()+"cannot be stored object in java.lan");
        }
                    
    }
            
}
