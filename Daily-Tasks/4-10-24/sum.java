
 public class tax
 {
	public static void main(String []args)
	 {
		int num,total;
		num= Integer.parseInt(args[0]);
		 
		  total=num%10;
		  num =num/10;
		 
		int sum = num +total;
		System .out.println("total="+sum);

	 }

 }