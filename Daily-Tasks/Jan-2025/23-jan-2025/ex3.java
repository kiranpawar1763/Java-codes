public class ex3
{
	public static void main(String[] args) {
		NIT thread = new NIT();
		NIT1 thread1 = new NIT1();
		
		thread.start();
		System.out.println(thread.getPriority());
		System.out.println(thread.isAlive());
		System.out.println(thread1.isAlive());
		thread1.start();
		System.out.println(thread1.getPriority());
		
    }
}
