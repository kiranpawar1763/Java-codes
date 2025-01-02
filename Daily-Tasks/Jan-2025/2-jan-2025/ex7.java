class Student{    
	void message()throws ArithmeticException {  //line 1
		System.out.println("Hai Student");  
		}    
	}    
class Faculty extends Student{    
	void message()throws Exception {  // line 2
		System.out.println("hai faculty");  
		}
}
public class ex7 
{
	public static void main(String args[]) {    
	   Student nit = new Faculty();    
	     
	   try {    
	   nit.message();    
	   }  
	   catch (Exception e){}   
	  
	  }    
}     

//op-compile time error
//because in line 2 we are throwing exception which is not thrown by parent class method
//so it will give compile time error
//if we remove throws Exception from line 2 then it will give output as Hai Student
//because we are calling child class method using parent class reference
//so it will call child class method

