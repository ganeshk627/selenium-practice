package seleniumpractice.nonwebelements.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.utils.WaitUtils;

import java.time.Duration;

public class ExecutorExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://selectorshub.com/xpath-practice-page/");

       WebElement alertWindow = driver.findElement(By.xpath("//button[@onclick='windowAlertFunction()']"));

//       alertWindow.click(); //ElementClickInterceptedException

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. scroll and click
//        js.executeScript("arguments[0].scrollIntoView();", alertWindow);
//        WaitUtils.waitFor(2);
//        alertWindow.click();


        // 2. jsclick
        js.executeScript("document.querySelector('button[onclick=\"windowAlertFunction()\"]').click()");
//        js.executeScript("arguments[0].click();", alertWindow);

    }
}
