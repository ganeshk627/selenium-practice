package seleniumpractice.nonwebelements.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.utils.WaitUtils;

import java.time.Duration;

public class ConfirmationJSAlerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");



        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        WaitUtils.waitFor(2);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText()); // printing the message
//        alert.accept();
        alert.dismiss();

        WaitUtils.waitFor(5);
        driver.quit();


    }
}
