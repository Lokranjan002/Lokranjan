package Exercise1;

public class Main {
	
	    public static void main(String[] args) {
	        // Attempt to get multiple instances
	        Logger logger1 = Logger.getInstance();
	        Logger logger2 = Logger.getInstance();

	        // Use the logger
	        logger1.log("This is the first log message.");
	        logger2.log("This is the second log message.");

	        // Check if both instances are same
	        if (logger1 == logger2) {
	            System.out.println("Both logger instances are the same (Singleton works).");
	        } else {
	            System.out.println("Different logger instances found (Singleton failed).");
	        }
	    }
	}


