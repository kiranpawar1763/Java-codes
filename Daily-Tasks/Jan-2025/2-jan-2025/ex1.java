public class ex1
{
	static void nit(int marks) 
	{
		if(marks<0||marks>50)
		{
			throw new IllegalArgumentException(Integer.toString(marks));
		}
	}
	public static void main(String[] args) {
		nit(55);
	}
}

//op-:Exception in thread "main" java.lang.IllegalArgumentException: 55