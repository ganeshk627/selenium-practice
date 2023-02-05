package practice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsStrategy {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // two methods to locate
        driver.findElement(By.xpath("//input"));
        driver.findElements(By.xpath("//input"));

        //
        driver.findElement(By.xpath(""));
        driver.findElement(By.cssSelector(""));
        driver.findElement(By.className(""));
        driver.findElement(By.id(""));
        driver.findElement(By.name(""));
        driver.findElement(By.tagName(""));
        driver.findElement(By.linkText(""));
        driver.findElement(By.partialLinkText(""));
    }
}
