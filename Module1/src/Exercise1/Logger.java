package Exercise1;

public class Logger {
	    // Step 1: Private static instance of Logger (eager initialization)
	    private static Logger instance = new Logger();

	    // Step 2: Private constructor to prevent external instantiation
	    private Logger() {
	        System.out.println("Logger initialized.");
	    }

	    // Step 3: Public method to return the single instance
	    public static Logger getInstance() {
	        return instance;
	    }

	    // Logger utility method
	    public void log(String message) {
	        System.out.println("Log: " + message);
	    }
	}


