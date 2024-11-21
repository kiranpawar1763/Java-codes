public class test6 
{
    int a = 10;
   // static int a = 10;   1.change the variable as a static
    public static void main(String[] args) 
    {
       // test6 obj = new test6();// 2. access the instance variable using object

        //System.out.println("A  value :  "+obj.a);
        System.out.println("A  value :  "+a);
    }

    
}

// Error= becuase However, a is a non-static (instance) variable, and non-static variables
 //cannot be directly accessed inside a static context (like the main method).
