class Age extends Exception
{
	Age(String str) 
	{
		super(str);
	}
}
public class ex4
{
	static void nit(int age) throws Age
	{
		if(age<18)
			throw new Age("Not for Vote");
		else 
		{
			System.out.println("Vote");
		}
	}
	public static void main(String[] args) 
	{
		try 
		{
			nit(15);
		} catch (Age e) 
		{
			System.out.println("Exception "+e);
		}		
	}
}
