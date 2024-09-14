package MultiThreading;

class MyCustomThread extends Thread{
    public void run(){
        System.out.println("Thread from extending the Thread class is running");
    }
}

public class ThreadExampleMySelf {

    public static void main(String[] args) {
        MyCustomThread myThread = new MyCustomThread();
        myThread.start();

        Thread myThread2 = new Thread(()->{
            System.out.println("My thread 2 is rnning");
        });

        myThread2.start();

        Thread myThread3 = new Thread(){
            @Override
            public void run(){
                System.out.println("My tnread 3 is running");
            }
        };
        myThread3.start();


        Runnable myRunnable1 = new Runnable() {
            @Override
            public void run(){
                System.out.println("My Thread 4 is running");
            }
        };

        Thread myThread4 = new Thread(myRunnable1);
        myThread4.start();

        Runnable myRunnable2 = ()->{
            System.out.println("My thread 5 is running");
        };
        Thread myThread5 = new Thread(myRunnable2);
        myThread5.start();
    }
    
}
