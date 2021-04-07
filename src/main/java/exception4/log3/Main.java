package exception4.log3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Task1.second();

        logger.info("This is information massage");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        logger.fatal("This is fatal message");
    }

    private static Logger logger = LogManager.getLogger(Main.class);

}