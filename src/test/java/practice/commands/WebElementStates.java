package practice.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElementStates {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Enter name']"));
        System.out.println(firstName.isEnabled());
        System.out.println(firstName.isDisplayed());
        System.out.println(firstName.isSelected());

        WebElement checkoutbutton = driver.findElement(By.xpath("//button[normalize-space()='Checkout here']"));
        System.out.println(checkoutbutton.getText());


        WebElement garrywhite = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_25']"));
        System.out.println(garrywhite.isSelected());
        garrywhite.click();

        try {
            Thread.sleep(5000);
        }
        catch (Exception e) {}
        System.out.println(garrywhite.isSelected());




        driver.quit();

    }
}
