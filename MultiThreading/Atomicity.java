package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

import common.util.FastReader;

class SharedCounter{
    private AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }
}
public class Atomicity {
    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        SharedCounter sharedCounter = new SharedCounter();
        new Thread(() ->{
            System.out.println("Thread 1 Started");
            for(int i =0; i<50000; i++){
                sharedCounter.increment();
            }
        }).start();

        new Thread(() -> {
            System.out.println("Thread 2 started");
            for(int i = 0; i<50000; i++){
                sharedCounter.increment();
            }
        }).start();

        

        try{
            Thread.sleep(2000);
            System.out.println("final count : " + sharedCounter.getCount());
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
