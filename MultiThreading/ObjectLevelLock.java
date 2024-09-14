package MultiThreading;


class Geek implements Runnable{
    public void run(){
        LOCK();
    }
    public void LOCK(){
        System.out.println(Thread.currentThread().getName());
        synchronized(this){
            System.out.println("in block " + Thread.currentThread().getName());
            System.out.println("In block " + Thread.currentThread().getName() + " end");
        }
    }
}
public class ObjectLevelLock {
    public static void main(String[] args) {
        Geek g = new Geek();
        Thread t1 = new Thread(g,"t1"); 
        Thread t2 = new Thread(g, "t2");

        Geek g1 = new Geek();
        Thread t3 = new Thread(g1, "t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
