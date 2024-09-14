package MultiThreading;

// method 1 to create thread class
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread 1 is running");
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Hello Manish");

        // method 1 to create thread
        MyThread objMyThread = new MyThread();
        objMyThread.start();

        // method 2 to create thread
        Thread objThread2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
        });

        objThread2.start();

        // method 3
        // Runnable objRunnable = new Runnable() {
        //     @Override
        //     public void run(){
        //         System.out.println("Thread 3 is running");
        //         System.out.println(Thread.currentThread().getName());
        //         System.out.println(Thread.currentThread().getState());
        //         try {
        //             Thread.sleep(2000);
        //         } catch (InterruptedException e) {
        //             // TODO Auto-generated catch block
        //             e.printStackTrace();
        //         }
        //     }
        // };

        // Thread objThread3 = new Thread(objRunnable, "Runnable thread");
        // objThread3.start();


        // method 4 using lambda expression
        Runnable objRunnable2 = () -> {
            System.out.println("Thread 4 is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Thread 4 is completed");
        };

        Thread objThread4 = new Thread(objRunnable2, "runable thread2");
        objThread4.setDaemon(true);
        objThread4.start();
        System.out.println("Main thread ended");
    }
}
