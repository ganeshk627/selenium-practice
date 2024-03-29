package practice.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class KeyboardActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/intl/en/inputtools/try/");

//        driver.findElement(By.id("demobox")).sendKeys("Hello, \n" +
//                "World");

        driver.findElement(By.id("demobox")).sendKeys("Hello,");
        driver.findElement(By.id("demobox")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("demobox")).sendKeys("World");
        driver.findElement(By.id("demobox")).sendKeys(Keys.BACK_SPACE);


        try {
            Thread.sleep(2000);
        } catch (Exception e){}

        // multiple keys in single sendkeys()
        driver.findElement(By.id("demobox"))
                .sendKeys(Keys.chord(Keys.COMMAND, "a")); // mac
//                .sendKeys(Keys.chord(Keys.CONTROL, "a")); // windows and linux
        driver.findElement(By.id("demobox")).sendKeys(Keys.DELETE);



    }
}
