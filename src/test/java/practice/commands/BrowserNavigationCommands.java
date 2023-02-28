package practice.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserNavigationCommands {
    public static void main(String [] args) {
        String url1 = "https://opensource-demo.orangehrmlive.com/";
        String url2 = "https://www.google.com/";

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(url1);
        driver.navigate().to(url2); // internally calls get()
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();

        driver.quit();
    }
}
