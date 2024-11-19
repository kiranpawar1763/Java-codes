
class Bank
{
    protected int accountNumber;
    protected static double balance;
        public Bank(int accountNumber, double balance) 
        {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    
        public void displayInfo() 
        {
            System.out.println("account number: " + accountNumber);
            System.out.println("balance :" + balance);
        }
        public static void deposit(double amount)
            {
                if(amount>0)
                {
                    System.out.println("before deposite amount" + balance );
                    balance=amount+balance;
                System.out.println("After deposite amount" + balance );
            }
            else
            {
                System.out.println("Invalid Deposite amount");
            }
            
        }
        public double getBalance()
         {
            return balance;
        }
        public void withdraw(double amount)
                        {
                            if(amount>0)
                            {
                                System.out.println("before withDraw amount" + balance );
                                balance=amount -balance;
                                System.out.println("After withdraw amount" + balance );
                            }
                            else
                            {
                                System.out.println("Invalid withdraw amount");
                            }
                        }
                    }
                    
                    
                    class savingaccount extends Bank
                    {
                        private int intrestRate;
                    
                        
                        public savingaccount(int accountNumber, double balance, int intrestRate)
                            {
                            super(accountNumber, balance);
                            this.intrestRate = intrestRate;
                        }
                    
                        public void addInterest(int amount)
                        {
                            
                        
                            if (amount > 0) 
                            {
                                int intrestrate = amount + (amount * intrestRate / 100);
                                
                                System.out.println("Rate of intrest " + intrestrate);
                               
                            } 
                            else 
                            {
                                System.out.println("Invalid loan amount.");
                               
                            }
                            
                        }
                        class CheckingAccount extends Bank
                        {
                            private double overdraftLimit;
                        
                            public CheckingAccount(int accountNumber, double balance, double overdraftLimit)
                             {
                                super(accountNumber, balance);
                                this.overdraftLimit = overdraftLimit;
                            }
                        
                            @Override
                            public void withdraw(double amount) 
                            {
                                if (amount <= getBalance() + overdraftLimit)
                                {
                                    super.withdraw(amount); 
                                } 
                                else 
                                {
                                    System.out.println(" overdraft limet execced");
                                }
                            }
                }
                
            
                
            }
            
            public class simpalBankSystem
            {
                public static void main(String[] args)
                {
                    
                    savingaccount ac = new savingaccount(111,3000 , 5);
                
            
                    System.out.println("Account details");
                    ac.displayInfo();
                    savingaccount.deposit(500);
                
    
       
        
        
        

    
    }
}
