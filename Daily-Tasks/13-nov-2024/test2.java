class Student
{
    protected String name;
    protected int Rollno;
     
    public Student(String name, int Rollno) 
    {
        this.name = name;
         
        this.Rollno = Rollno;

    }

    public void displayInfo() 
    {
        System.out.println("Product make: " + name);
        System.out.println("Product model: " + Rollno);
        
         
    }

    public double calculatePercentage()
    {
        return 0;
    }
    
}
class scince extends Student
{
    private int physicsmarks;
    private int chemmarks;
    private int mathmarks;
     scince(String name,int Rollno,int physicsmarks,int chemmarks ,int mathmarks)
    {
        super(name,Rollno);
        this.physicsmarks = physicsmarks;
        this.chemmarks=chemmarks;
        this.mathmarks=mathmarks;
  
    }
    @Override
    public void displayInfo()
    {
        System.out.println("\nstudent marks");
        super.displayInfo();
        
        if(physicsmarks>0)
        {
            System.out.println("physics marks"+physicsmarks);

        }
        else
        {
            System.out.println("Invalid");
        }
        if(chemmarks>0)
        {
            System.out.println("chem marks"+chemmarks);

        }
        else
        {
            System.out.println("Invalid");

        }
        if(mathmarks>0)
        {
            System.out.println("math marks"+mathmarks);

        }
        else
        {
            System.out.println("Invalid");

        }

    }
    @Override
    public double calculatePercentage()
    {
        return (physicsmarks+chemmarks+mathmarks)/3;

    }
}
class Arts extends Student
{
    private int historyMarks;
    private int geographyMarks;
    private int englishMarks;
     Arts(String name,int Rollno,int historyMarks,int geographyMarks ,int englishMarks)
    {
        super(name,Rollno);
        this.historyMarks = historyMarks;
        this.geographyMarks=geographyMarks;
        this.englishMarks=englishMarks;
  
    }
    @Override
    public void displayInfo()
    {
        System.out.println("\nstudent marks");
        super.displayInfo();
        
        if(historyMarks>0)
        {
            System.out.println("physics marks"+historyMarks);

        }
        else
        {
            System.out.println("Invalid");
        }
        if(geographyMarks>0)
        {
            System.out.println("chem marks"+geographyMarks);

        }
        else
        {
            System.out.println("Invalid");

        }
        if(englishMarks>0)
        {
            System.out.println("math marks"+englishMarks);

        }
        else
        {
            System.out.println("Invalid");

        }

    }
    @Override
	public double calculatePercentage()
	{
		return (historyMarks + geographyMarks + englishMarks) / 3;
	}
}
public class test2
{

   public static void main(String[]args)
   {
   scince s1 = new scince ("kiran",101,85,90,80);
   s1.displayInfo();
   System.out.println("Science Student Percentage = "+s1.calculatePercentage());
   System.out.println();

    Arts a1 = new Arts("Anjali",102,75,80,85);
   a1.displayInfo();
   System.out.println("Arts students percentage = "+a1.calculatePercentage());
   
   }
}

