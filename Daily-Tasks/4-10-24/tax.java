
 public class tax
 {
	public static void main(String []args)
	 {
		int amt;
		float tax;
		
		
		amt= Integer.parseInt(args[0]);
		tax = Float.parseFloat(args[1]);
	     float totalTax = (amt/100)*tax;
		
		System .out.println("total payble tax="+totalTax);

	 }

 }