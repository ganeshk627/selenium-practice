package practice.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://selectorshub.com/xpath-practice-page/");


        driver.findElement(By.linkText("Find out how to automate these controls without XPath")).click();

        try {
            Thread.sleep(2000);
        } catch (Exception e){}

        System.out.println(driver.getTitle());

        String current_window = driver.getWindowHandle();
        Set<String> all_windows = driver.getWindowHandles();
//        System.out.println(current_window);



        for(String window : all_windows) {
            System.out.println(window);
            if(!window.equalsIgnoreCase(current_window)) {
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
            }
        }


        driver.quit(); // closes all the tabs and windows in the session
//        driver.close(); // closes only current single tab


    }
}
