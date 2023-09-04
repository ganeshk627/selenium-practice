package practice.nonwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavascriptExecutorPracitce {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("g@k.com");


//        driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_14']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("console.log('Hello world!');");



        // Handling ElementClickInterceptedException 1
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_14']"));
        js.executeScript("arguments[0].click();", checkbox1);

        // Handling ElementClickInterceptedException 2
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_14']"));
          js.executeScript("arguments[0].scrollIntoView();", checkbox2);
          checkbox2.click(); // or js click


        // printing title using jsscript
        String title  = (String) js.executeScript("return document.title");
        System.out.println(title);



    }
}
