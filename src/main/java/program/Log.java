package program;

import java.util.logging.Logger;

public class Log {
    private static final Logger logger = Logger.getLogger(Log.class.getName());

    public void printLog(String message) {
        logger.info(message);
    }
}
