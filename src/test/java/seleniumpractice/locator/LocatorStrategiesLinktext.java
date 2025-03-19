package seleniumpractice.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategiesTagname {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

//        driver.findElement(By.cssSelector("form[role='search'] div")).click();

        // Locate by tagname
        driver.findElement(By.tagName("input")).sendKeys("hello");



//        driver.quit();
    }
}
