package utilities;

public class UsefulMethodsForSelenium {
   // sleep method using seconds
    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000)); // the reason why we are casting to long since the user enters double and the sleep data is Long (builtin)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}