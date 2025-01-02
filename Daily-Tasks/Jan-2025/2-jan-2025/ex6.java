class Age extends Exception
{
	Age(String str) 
	{
		super(str);
	}
}
public class ex6 
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
		try {
			nit(19);
		} catch (Age e) {
			System.out.println("Exception "+e);
		}
		finally {
			System.out.println("Vote count");
		}
	}
}

//op-Vote and Vote count

//finally block will always execute irrespective of exception is thrown or not
//if exception is thrown then catch block will execute and then finally block will execute
//if exception is not thrown then try block will execute and then finally block will execute
//finally block will always execute
//finally block is used to close the resources like file, database connection etc
//finally block is used to execute the important code which should be executed irrespective of exception is thrown or not	
