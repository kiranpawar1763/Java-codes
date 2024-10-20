import java.util.Scanner;
public class PrintTheTabelUsingScannerClass
{


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}

    

