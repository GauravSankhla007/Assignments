public class Logger {

    private Logger() {

    }

    private static Logger log = null;

    public static Logger getInstance() {

        if (log == null) {
            log = new Logger();
        }


        return log;
    }

    public void log(String message){
        log(message , LogLevel.INFO);
    }
    public void log(String message, LogLevel level){
        System.out.println("[" + level + "] " + message   );
    }
}
