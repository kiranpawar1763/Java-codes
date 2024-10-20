class test11
{
    public static void main(String[] argv)
    {
         long  x = 400;
         switch(x)
          {
                case 100 : System.out.println("One hundred");break ;
                case 200 : System.out.println("Two hundred");break ;
                case 400 : System.out.println("Three hundred");break ;
        }
    }
    
    
    
}

/* output = error
  In the provided code, you're using a long variable (x) in a switch statement.
   However, in Java, the switch statement supports only certain primitive types
    (such as int, char, short, byte, and their corresponding wrapper types) 
*/