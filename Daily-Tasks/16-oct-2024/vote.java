import java.util.*;
class vote
{
    public static void main(String[]args)
    {
        
        int age;
    age =Integer.parseInt(args[0]);
    //   Scanner sc =new Scanner(System.in);
    //   System.out.println("enter the marks");
       //int age = sc.Next();
        if(age>18)
        {
        System.out.println("eligible for voting");
        }
        
        else
        {
            System.out.println("not eligible for voting");
        }

    }
}