
//vaccine

 class VaccineEligibility
 {
     private int age;
     private boolean hasHealthCondition;


     public VaccineEligibility(int age, boolean hasHealthCondition)
     {
     this.hasHealthCondition=hasHealthCondition;
     this.age=age;
     
     }
    public boolean  isEligible()
     {
        return (age >= 18 && age < 60 && hasHealthCondition);
    }



 }
  
  class doseBooking
 {
    private boolean booked=false;

    public synchronized void bookDose() 
    {
        if (booked) 
        {
            throw new RuntimeException("Dose already booked.");
        }
         else 
        {
            booked = true;
            System.out.println("Dose booked successfully.");
        }
    }
        public boolean isDoseBooked() 
        {
        return booked;
      }

 }

class User
 {
    private String name;
    private  doseBooking doseBooking;
    private VaccineEligibility eligibility ;

    public User( String name, int age,boolean hasHealthCondition)
    {
        this. name=name;
        this. eligibility=new VaccineEligibility(age,hasHealthCondition);
        this.doseBooking=new doseBooking();
    }
    
   public boolean isDoseBooked() 
    {
     return doseBooking.isDoseBooked();
    }
    public void bookDose()
     {
        if (!isEligible()) 
        {
            throw new RuntimeException(name + " is not eligible");
        }
        doseBooking.bookDose();
        System.out.println("Dose booked successfully : " + name);
    }
    

    boolean isEligible()
     {
      return eligibility.isEligible();
    }

 }

 public class ex2
  {
    public static void main(String[] args)
     {
        User user1 = new User("Ramesh", 25, true); 
        User user2 = new User("Suresh", 17, false);  

        Thread thread1 = new Thread(new Runnable()
         {
            @Override
            public void run()
             {
               
                        user1.bookDose();  
                  
            }
        });

        Thread thread2 = new Thread(new Runnable()
        {
            @Override
            public void run() 
            {
               
                        user2.bookDose();  
            }
        });

        thread1.start();
        thread2.start();
     }
}

