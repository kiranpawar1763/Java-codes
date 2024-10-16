public class test5 
{
    public static void main(String[] args) 
	{
		//if(true) ||(call(7)))
        if((call(3)) ||(call(7)))
		{
			System.out.println("Result is true");		//2	
		}
		if((call(6)) ||(call(9)))
		{
			System.out.println("Result is true");			
		}
	}
	public static boolean call(int i)//9
	{
		if(i<5)
		{
			System.out.println("i < 5");//1
			return true;
		}
		else
		{
			System.out.println("i>=5");//3 4
			return false;
		}
	}
}
