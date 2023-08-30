package practice.nonwebelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavascriptAlerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // simple alert - ok
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"))
                .click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();

        try {
            Thread.sleep(2000);
        } catch (Exception e){}


        // confirm alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"))
                .click();
        Alert confirm = driver.switchTo().alert();
        confirm.accept();
//        confirm.dismiss();

        try {
            Thread.sleep(2000);
        } catch (Exception e){}


        // prompt alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"))
                .click();
        Alert prompt = driver.switchTo().alert();
        try {
            Thread.sleep(2000);
        } catch (Exception e){}
        prompt.sendKeys("harry");
        prompt.accept();
    }
}
