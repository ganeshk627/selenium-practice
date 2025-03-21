package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementStates {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement email = driver.findElement(By.cssSelector("input[title='Email']"));
        System.out.println("Email displayed:"+ email.isDisplayed());
        System.out.println("Email enabled:"+ email.isEnabled());
        System.out.println("Email checked:"+ email.isSelected());

        WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Enter name']"));
        System.out.println("First name displayed:"+ firstName.isDisplayed());
        System.out.println("First name enabled:"+ firstName.isEnabled());
        System.out.println("First name checked:"+ firstName.isSelected());

        WebElement checkbox = driver.findElement(By.xpath("//input[@name='chkSelectAll']"));
        System.out.println("Checbox displayed:"+ checkbox.isDisplayed());
        System.out.println("Checbox enabled:"+ checkbox.isEnabled());
        System.out.println("Checbox checked:"+ checkbox.isSelected());


        driver.quit();
    }
}
