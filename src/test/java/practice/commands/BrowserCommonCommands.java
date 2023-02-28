package practice.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserCommonCommands {
    public static void main(String [] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        driver.findElements(By.xpath("//input"));
        String title = driver.getTitle();
        String current_url = driver.getCurrentUrl();
        String pagesource = driver.getPageSource();

        Duration pageload_timeout = driver.manage().timeouts().getPageLoadTimeout(); // PT5M - Period of Time 5 Minutes

        System.out.println("Title: " + title);
        System.out.println("Current URL: " + current_url);
        System.out.println("Page Source: " + pagesource);
        System.out.println("Page Load Timeout: " + pageload_timeout);

/*
        close() -> closes single current window
        quit() -> closes all the windows in current driver instance
*/

//        driver.close();
        driver.quit();


    }
}
