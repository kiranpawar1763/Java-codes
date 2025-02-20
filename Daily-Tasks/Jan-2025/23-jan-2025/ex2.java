class Ex2Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("1st thread");
    }
}

class Ex2Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("2nd thread");
    }
}

public class ex2 {
    public static void main(String[] args) {
        // Create and start the first thread
        Ex2Thread1 thread1 = new Ex2Thread1();
        thread1.start(); // This invokes the `run()` method in Ex2Thread1

        // Create and start the second thread
        Ex2Thread2 thread2 = new Ex2Thread2();
        thread2.start(); // This invokes the `run()` method in Ex2Thread2
    }
}
