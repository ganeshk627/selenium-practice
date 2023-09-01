package practice.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingNestedFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/nested_frames");



        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        String middletext = driver.findElement(By.id("content")).getText();
        System.out.println(middletext);

        driver.switchTo().parentFrame();


        driver.switchTo().frame("frame-right");
        String righttext = driver.findElement(By.tagName("body")).getText();
        System.out.println(righttext);

        driver.switchTo().defaultContent();

        driver.quit();
    }
}
