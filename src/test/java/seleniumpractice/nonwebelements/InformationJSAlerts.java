package seleniumpractice.nonwebelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.utils.WaitUtils;

import java.time.Duration;

public class InformationJSAlerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


        // 1. Information js alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        WaitUtils.waitFor(2);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText()); // printing the message
        alert.accept();

        WaitUtils.waitFor(5);
        driver.quit();


    }
}
