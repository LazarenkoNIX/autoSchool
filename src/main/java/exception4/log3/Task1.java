package exception4.log3;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task1 {
    private static Logger logger = LogManager.getLogger(Main.class);
    private static void first() {
        logger.info("This is information massage");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        logger.fatal("This is fatal message");
//        System.out.println("Private Method was called");
        logger.info("Private Method was called");
    }

    public static void second() {
        first();
        logger.info("This is information massage");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        logger.fatal("This is fatal message");
//        System.out.println("Public Method was called");
        logger.info("Public Method was called");
    }
}