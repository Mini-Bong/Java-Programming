package MultiThreading;

public class ThreadSharedObject {

    public static Object sharedObject = new Object();
    public static void main(String[] args) {
        Runnable objRunnable1 = () -> {
            System.out.println("Thread 1 is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            System.out.println(sharedObject.hashCode());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Thread 1 is completed");
        };

        Runnable objRunnable2 = () -> {
            System.out.println("Thread 2 is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            System.out.println(sharedObject.hashCode());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Thread 2 is completed");
        };

        Thread objThread1 = new Thread(objRunnable1, "runable thread1");
        objThread1.start();

        Thread objThread2 = new Thread(objRunnable2, "runable thread2");
        objThread2.start();
        
        
    }
}
