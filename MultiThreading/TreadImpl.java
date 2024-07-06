package JavaProgramming.MultiThreading;

import common.util.FastReader;

class MyThread extends Thread{
    public void run(){
        for(int i = 0; i< 10 ; i++){
            System.out.println("Thread : " + Thread.currentThread().getId() + 
            ": " + i);
        }
    }
}

public class TreadImpl {
    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

    }
}
