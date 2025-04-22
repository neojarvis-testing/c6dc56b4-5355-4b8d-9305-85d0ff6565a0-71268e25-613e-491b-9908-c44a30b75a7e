package utils;
 
import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
 
public class LoggerHandler {
    private static final Logger logger = LogManager.getLogger(LoggerHandler.class);
 
    static {
        File logsDir = new File("logs");
        if (!logsDir.exists()) {
            logsDir.mkdirs();
        }
    }
   
    public static void trace(String message) {
        logger.trace(message);
    }
 
    public static void debug(String message) {
        logger.debug(message);
    }
 
    public static void info(String message) {
        logger.info(message);
    }
 
    public static void warn(String message) {
        logger.warn(message);
    }
 
    public static void error(String message) {
        logger.error(message);
    }
 
    public static void fatal(String message) {
        logger.fatal(message);
    }
}