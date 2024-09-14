package MultiThreading;

class Geek1 implements Runnable{
    public void run(){
        LOCK();
    }
    public void LOCK(){
        System.out.println(Thread.currentThread().getName());
        synchronized(Geek1.class){
            System.out.println("in Lock block " + Thread.currentThread().getName());
            System.out.println("in lock block " + Thread.currentThread().getName() + " end");
        }
    }
}

public class ClassLevelLock {
    public static void main(String[] args) {
        Geek1 g1 = new Geek1();
        Thread t1 = new Thread(g1, "t1");
        Thread t2 = new Thread(g1, "t2");
        Geek1 g2 = new Geek1();
        Thread t3 = new Thread(g2, "t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
