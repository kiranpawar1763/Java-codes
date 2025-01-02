class Student{    
	void message(){  //line 1
		System.out.println("Hai Student");  
		}    
	}    
	    
class Faculty extends Student{    
	void message()throws ArithmeticException {  // line 2
		System.out.println("hai faculty");  
		}
}
public class ex9
{
	public static void main(String args[]) {    
	   Student nit = new Faculty();    
	     
	   try {    
	   nit.message();    
	   }  
	   catch (Exception e){
}   
	 
	  }    
}

