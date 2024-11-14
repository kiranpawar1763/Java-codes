
class Circle
{
	
	protected double radius;
	protected double pi = 3.14;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		if(radius >= 0) 
		{
			return pi * radius * radius;
		}
		else
		 {
			return -1;
		}
	}
}


class Cylinder extends Circle
{
	protected  double hight;
	Cylinder(double hight,double radius)
	{
		super(radius);
		this.hight=hight;
	}

	public double getVolume()
	{
		if(hight>=0)
		{
			return pi * radius *radius *hight;
		}
		else
		{
			return -1;
		}
	}

}
 

public class test3
{
	public static void main(String[] args) 
	{
		
		Cylinder c = new Cylinder(5,5);
		
		if(c.getArea() > 0)
		{
			System.out.println("Area of Circle   = "+c.getArea());
		}else {
			System.out.println(" Invalid");
		}
		
		if(c.getVolume()>0)

		{
			System.out.println("Volume of cylinder = "+c.getVolume());

		}
		 else
		 {
			System.out.println("Invalid");

		 }

	}
}

