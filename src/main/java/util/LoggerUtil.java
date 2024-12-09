package main.java.util;

public class LoggerUtil {

    public static void logInfo(String message) {
        System.out.println("INFO: " + message);
    }

    public static void logError(String message) {
        System.err.println("ERROR: " + message);
    }
}
