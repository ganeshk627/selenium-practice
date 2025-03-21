package seleniumpractice.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategiesName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");


        // Locate by id
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys("Fintekpoint");



        driver.quit();
    }
}
