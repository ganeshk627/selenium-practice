package seleniumpractice.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategiesCssSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        //// css selector
        //css selector syntax - tagname[attrname="attrvalue"]
        driver.findElement(By.cssSelector("input[placeholder='Enter Password']"))
                .sendKeys("Hello@1");

        // Text based xpath
        driver.findElement(By.xpath("//button[text()='Submit']")).click();


        // Text with leading spaces
//        driver.findElement(By.xpath("//a[normalize-space()='SelectorsHub Youtube Channel']")).click();


        // Locate by id
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("Aa123!");


    }
}
