package practice.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class EnableAndFill {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://selectorshub.com/xpath-practice-page/");

        driver.findElement(By.xpath("//label[normalize-space()='Can you enter name here through automation']//*[name()='svg']"))
                .click();

        try {
            Thread.sleep(2000);
        } catch (Exception e){}

        driver.findElement(By.xpath("//input[@placeholder='First Enter name']"))
                .sendKeys("Harry");
    }
}
