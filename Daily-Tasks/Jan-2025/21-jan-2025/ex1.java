/withdraw the money respectively from the ATM machine.
class Account
{
    private int balance = 0;

    public synchronized void withdraw(int amount) 
    {
        if (balance < amount) 
        {
            try {
                wait();
            } catch (InterruptedException e)
             {
                Thread.currentThread().interrupt();
            }
        }
        balance =balance- amount;
        System.out.println("Withdrawn:" +amount + ", Remaining :" + balance);
        notify();
    }

    public synchronized void deposit(int amount) 
    {
        balance=balance+amount;
        System.out.println("Deposited: " +amount + ", Updated Bal: " + balance);
        notify();
    }
}

class Drawer extends Thread 
{
    private Account account;

    public Drawer(Account account)
     {
        this.account = account;
    }

    @Override
    public void run() 
    {
        int[] withdrawals = {10033, 200, 300};
        for (int withdrawal : withdrawals) 
        {
            account.withdraw(withdrawal);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Depositor extends Thread
 {
    private Account account;

    public Depositor(Account account)
     {
        this.account = account;
    }

    @Override
    public void run()
     {
        int[] deposits = {5222, 300, 200};
        for (int deposit : deposits) 
        {
            account.deposit(deposit);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e)
             {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ex1
 {
    public static void main(String[] args)
     {
        Account account = new Account();
        Depositor depositor = new Depositor(account);
        Drawer drawer = new Drawer(account);

        depositor.start();
    
        drawer.start();
    }
}
