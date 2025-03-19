package seleniumpractice.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategiesId {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");


        // Locate by id
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("Aa123!");



        driver.quit();
    }
}
