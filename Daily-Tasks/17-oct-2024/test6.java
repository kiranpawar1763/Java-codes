public class test6
{
    public static void main(String[]args)
    {
        int temp = 90;
        switch(temp)
        {
            case 80:System.out.println("80");
            case 80:System.out.println("80");
            case 90:System.out.println("90");
            default : System.out.println("invalid");

        }
    }
}
// output = Error
 //Reasone :- In switch case duplicate case label not allowed
