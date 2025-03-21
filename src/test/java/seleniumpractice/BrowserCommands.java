package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) {

        // Opening Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Launch url in browser
        driver.get("https://www.google.com/");

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // navigation commands
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();


        // browser commands
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().minimize();


        // driver methods
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        // Close the browser
        driver.close();
//        driver.quit();


    }
}
