package InterviewProblem;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    
    private BlockingQueue<Integer> bq;
    public Producer(BlockingQueue<Integer> bq){
        this.bq = bq;
    }

    @Override
    public void run(){
        int val = 0;
        try{
            while(true){
                System.out.println("Produer produced : " + val);
                bq.put(val++);
                Thread.sleep(150);
            }
        } catch(InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> bq;
    int maxSize;
    public Consumer(BlockingQueue<Integer> bq, int maxSize){
        this.bq = bq;
        this.maxSize = maxSize;
    }


    @Override
    public void run(){
        while(true){
            // if(bq.size() == maxSize){
            //     System.out.println("Consumer is consuming all items");
            //     while(!bq.isEmpty()){
            //         int item = bq.poll();
            //         System.out.println("Consumer consumed : " + item);
            //     }
            // }
            try{            
                Integer item = bq.take();
                System.out.println("Consumer consumed : " + item);
                Thread.sleep(150);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerUsingBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(100);
        Thread producerThread = new Thread(new Producer(bq));
        Thread consumerThread = new Thread(new Consumer(bq, 10));
        producerThread.start();
        consumerThread.start();
    }
}
