package JavaProgramming.DesignPattern.CreationalDesignPattern;

/**
 * Logger -> Product interface
 */
interface Logger {
    void log(String message);
}

// Concrete product classes
class ConsoleLogger implements Logger{
    @Override
    public void log(String message){
        System.out.println("Console Logger : " + message);
    }
}

class FileLogger implements Logger{
    @Override
    public void log(String messsage){
        System.out.println("File Logger : " + messsage);
    }
}

class DatabaseLogger implements Logger{
    @Override
    public void log(String message){
        System.out.println("Database Logger : " + message);
    }
}

class NetworkLogger implements Logger {
    @Override
    public void log(String message) {
        // Code to log the message to a database
        System.out.println("Database Logger: " + message);
    }
}

// Factory class
class LoggerFactory{
    public static Logger getLogger(String type){
        return switch(type){
            case "console" -> new ConsoleLogger();
            case "file" -> new FileLogger();
            case "database" -> new DatabaseLogger();
            case "network" -> new NetworkLogger();
            default -> throw new IllegalArgumentException();
        };
    }
}


public class FactoryPatternExample {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("console");
        logger.log("This is a console log message");

        logger = LoggerFactory.getLogger("file");
        logger.log("This is a file log message");

    }
}
