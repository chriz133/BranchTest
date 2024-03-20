package mypackage;
import java.util.logging.Logger;

public class MainClass {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        int a =5;
        logger.fine(Integer.toString(a));
    }
}
