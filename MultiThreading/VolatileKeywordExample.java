package MultiThreading;

class SharedResource{
    private boolean flag = false;
    public synchronized void setFlag(boolean flag){
        this.flag = flag;
    }
    public synchronized boolean getFlag(){
        return flag;
    }
}

public class VolatileKeywordExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        new Thread(() -> {
            System.out.println("Thred 1 started");
            try {
                System.out.println("Thread 1 logic started");
                Thread.sleep(1000);
                System.out.println("Thread 1 logic completed");
                sharedResource.setFlag(true);
                System.out.println("Flag set by thread 1");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }).start();

        new Thread(() ->{
            System.out.println("Thread 2 started");
            while(!sharedResource.getFlag()){

            }
            System.out.println("Thread 2 logic completed");
        }).start();
    }
}
