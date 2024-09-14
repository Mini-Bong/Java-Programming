package DesignPattern.CreationalDesignPattern;


class Singleton{
    // static variable to hold the single instance of the class
    // Using 'volatile' to ensure visibility of changes to 'instance' across threads
    private static volatile Singleton instance;

    private Singleton(){
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
        System.out.println("Singleton instance created");
    }


    // method to maintain singleton property during deserialization
    protected Object readResolve(){
        return getInstance();
    }

    // Prevent cloning of the singleton instance
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Singleton, cannot be cloned");
    }

    public static Singleton getInstance(){
        // first check for existing instance without synchronized for performance
        if(instance == null){
            // Synchronized on the class to ensure thread safety during instantiation
            synchronized(Singleton.class){
                // Double-checked locking to avoid unnecessary synchronization
                if(instance == null){
                    System.out.println("Creating first instance");
                    instance = new Singleton();
                }
            }
        }
        System.out.println("Fetching instance");
        return instance;
    }
}




public class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Are both instances are the same? " + (singleton1 == singleton2));
    }
}
