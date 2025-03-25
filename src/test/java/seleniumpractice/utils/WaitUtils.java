package seleniumpractice.utils;

public class WaitUtils {

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
