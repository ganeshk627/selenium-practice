package practice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LocatorsStrategy {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //default implicit time 0

    /*
    Common syntax for xpath
    //tagname[@attribute='value']
    */

        // two methods to locate
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");
//        username.clear();
        username.click();

//        driver.findElement(By.xpath("//input1"));
        List<WebElement> inputs1 = driver.findElements(By.xpath("//input"));
        System.out.println(inputs1.size());
        List<WebElement> inputs2 = driver.findElements(By.xpath("//input1"));
        System.out.println(inputs2.size());

        // locator methods

/*
            Xpath - 2 types
            1. Absolute - /
            2. Relative - //
 */
        driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        driver.findElement(By.cssSelector("button[type='submit']"));
        driver.findElement(By.className("oxd-input oxd-input--active"));
        driver.findElement(By.id("app"));
        driver.findElement(By.name("username"));
        driver.findElement(By.tagName("button"));
        driver.findElement(By.linkText("OrangeHRM, Inc"));
        driver.findElement(By.partialLinkText("OrangeHRM"));

        driver.close();
    }
}
