public class test13 
{
    public static void main(String args[])
        {    
          final int a=10,b=20;
          while(a<b)
          {
          System.out.println("Hello");
          }
          System.out.println("World");
        }
}

/*Error
 The code will still result in a compile-time error because of the use of the final 
 keyword and an infinite loop. Specifically, the final keyword means the variables 
 a and b cannot be modified once initialized, and since a is always less than b, the 
 condition a < b will always evaluate to true, creating an infinite loop.

The compiler also detects that the line System.out.println("World"); 
is unreachable because the loop will never terminate, which leads to the
 "unreachable code" error.
*/