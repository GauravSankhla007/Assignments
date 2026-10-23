public class Main {
    public static void main(String[] args) {

  Logger logger1 = Logger.getInstance();
  Logger logger2 = Logger.getInstance();
        System.out.println(logger1==logger2);

        logger1.log("Payment failed", LogLevel.ERROR);
        logger1.log("User logged in");
        logger1.log("Storage is almost full", LogLevel.WARNING);
    }
}