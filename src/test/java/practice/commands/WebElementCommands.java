package practice.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElementCommands {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("Demo User");
        username.clear();
        username.sendKeys("Admin");

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        WebElement login_button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));

        String loginText = login_button.getText();
        String loginType = login_button.getAttribute("type");

        System.out.println(loginText);
        System.out.println(loginType);

/*
        click() -> performs click action on specified element
        submit() -> submits the form
*/

        login_button.click();
//        login_button.submit();

        driver.quit();
    }
}
