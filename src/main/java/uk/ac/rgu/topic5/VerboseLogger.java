package uk.ac.rgu.topic5;

/**
 * Singleton class to define a Verbose Logger
 */
public class VerboseLogger implements Logger {
 
    //---------- FIELDS ----------

    private static VerboseLogger instance = null;
    private int numTimesUsed = 0;

    //---------- CONSTRUCTORS ----------

    private VerboseLogger() {

    }

    //---------- OTHER METHODS ----------

    /**
     * Singleton method to return the instance of the logger
     * @return The VerboseLogger instance
     */
    public static VerboseLogger getInstance() {
        if (instance == null) {
            instance = new VerboseLogger();
        } 
        return instance;
    }

    public void log(String message) {
        numTimesUsed++;
        System.out.println("Verbose Logger: "  + message + "; Used " + numTimesUsed + " times");
    }

}
