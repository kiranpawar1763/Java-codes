class NIT implements Runnable 
{
	@Override
	public void run() 
    {
		for(int a=0;a<10;a++)
		{
			System.out.println("NareshIT1");
			try {
				 Thread.sleep(2000);
			} catch (InterruptedException e)
             {
				System.out.println("NIT Thread failed");
			}
		}
	}
}

class NIT1 implements Runnable
{
	@Override
	public void run() {
		for(int a =0;a<10;a++) 
		{
			System.out.println("NareshIT2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("NIT1 Thread failed");
			}
		}
		
	}
}

public class ex4 {
	public static void main(String[] args) {
		Runnable nit = new NIT();
		Runnable nit1 = new NIT1();
		
		Thread thread = new Thread(nit);
		Thread thread1 = new Thread(nit1);
		
		thread.start();
		thread1.start();
    }
}