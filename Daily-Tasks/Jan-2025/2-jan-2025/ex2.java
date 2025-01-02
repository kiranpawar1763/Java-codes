class InvalidPassword extends Exception
{
	InvalidPassword(String str)
	 {
		super(str);
	}
}

public class ex2
{
	static void nit(String password) throws InvalidPassword
	{
		if(password.length()<5)
			throw new InvalidPassword("Invalid Password");
		else 
		{
			System.out.println("Valid Password");
		}
	}
	public static void main(String[] args)
	{
		try 
		{
			nit("shit");
		} catch (InvalidPassword  e) 
		{
			System.out.println("Exception "+e);
		}
		
	}
}
//op-valid password