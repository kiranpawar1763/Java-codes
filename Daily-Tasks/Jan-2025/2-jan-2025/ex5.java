class Age extends Exception
{
	
}

public class ex5
{
	public static void main(String[] args) {
		try {
			throw new Age();
		} catch (Age e) {
			System.out.println("Exception "+e.getMessage());
		}
		
	}
}

//op-Exception null
//becuase age exception is not having any message so it will print null