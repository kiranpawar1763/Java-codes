
class Bank 
{
    protected String Bankname;
    protected  String Bankbranch ;
    public static    String IfCCode; 
        public Bank(String Bankname, String Bankbranch,String IFCCode) 
        {
            this.Bankname = Bankname;
            this.Bankbranch = Bankbranch;
            this.IfCCode=IFCCode;
        }
    
        public void displayInfo() 
        {
            System.out.println("Bank Name: " + Bankname);
            System.out.println("Bank Branch :" + Bankbranch);
            System.out.println("IFC code:"+IfCCode);
        }
        public void withdraw(double amount)
        {
            System.out.println(" Amount to be Withdraw:");
            
        }
        public void deposit(double amount)
        {
            System.out.println("Amount to be Deposite:");
        }
        public void transfer(double amount, BankAccount fromAccount, BankAccount toAccount)
        {
        
        }
        public void loan(double amount, int years)
        {
    
        }
    }
    
    
    class Axis extends Bank
    {
        private Double intrestrate;
        public Axis(String Bankname, String Bankbranch, String IFCCode)
            {
            super(Bankname,Bankbranch,IfCCode);
        this.intrestrate = intrestrate;
       }
       @Override
       public void withdraw(double amount)
        {
           if (amount > 0) 
           {
               System.out.println("Withdrawal of " + amount);
           } 
           
           else
            {
               System.out.println("Invalid withdrawal amount.");
           }
       }
    }
    @Override
    public void deposit(double amount)
    {
        if(amount>0)
        {
            System.out.println("Depodite of" + amount );
        }
        else
        {
            System.out.println("Invalid Deposite amount");
        }
    }

    @Override
    public boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount) 
    {
        if (amount > 0 && fromAccount.getBalance() >= amount) 
        {
            fromAccount.setBalance(fromAccount.getBalance() - amount);

            toAccount.setBalance(toAccount.getBalance() + amount);

            System.out.println("Transfer of " + amount + " successful.");
            return true;
        }
      else
      {
        System.out.println("Invalid Transfer");
        
        return false;
     }
    }
     
    @Override
    public double loan(double amount, int years) 
    {
        if (amount > 0) 
        {
            double intrestrate;
                        double totalPayable = amount + (amount * intrestrate * years / 100);
            
            System.out.println("Loan approved. Total payable: " + totalPayable);
            return totalPayable;
        } 
        else 
        {
            System.out.println("Invalid loan amount.");
        }
           return 0;
 }
class ICICI extends Bank
{
    private double loanlimite;
    public ICICI(String Bankname, String Bankbranch, String IFCCode)
        {
            
        super(Bankname,Bankbranch,IfCCode);
        this.loanlimite = loanlimite;
       }
       @Override
       public void withdraw(double amount)
        {
           if (amount > 0) 
           {
               System.out.println("Withdrawal of " + amount);
           } 
           
           else
            {
               System.out.println("Invalid amount");
           }
       }
    }
    @Override
    public void deposit(double amount)
    {
        if(amount>0)
        {
            System.out.println("Depodite of" + amount );
        }
        else
        {
            System.out.println("Invalid Deposite amount");
        }
    }

    @Override
    public boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount) 
    {
        if (amount > 0 && fromAccount.getBalance() >= amount) 
        {
            fromAccount.setBalance(fromAccount.getBalance() - amount);

            toAccount.setBalance(toAccount.getBalance() + amount);

            System.out.println("Transfer of " + amount + " successful.");
            return true;
        }
      else
      {
        System.out.println("Invalid Transfer");
        return false;
      
     }
    }
     
    @Override
    public double loan(double amount) 
    {
        double loanlimite;
        if (amount > 0 && amount<=loanlimite) 
        {
        
            System.out.println("Loan approved" );
        } 
        else 
        {
            System.out.println("Invalid loan amount.");
            return 0;
        }

    
}
class SBI extends Bank
{
    private Double minBalance;
    public SBI(String Bankname,String BankBranch)
    {
        super(Bankname, BankBranch)
    }

}


public class BankManegment
{
    public static void main(String[] args)
    {
        
        
        

    
    }
}
