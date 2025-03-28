package seleniumpractice.waitmechanisms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumpractice.utils.WaitUtils;

import java.time.Duration;

public class ImplicitExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // implicit wait


//        WaitUtils.waitFor(5); // explicit wait
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
//        WaitUtils.waitFor(5); // explicit wait

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//        WaitUtils.waitFor(5); // explicit wait

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//        WaitUtils.waitFor(10); // explicit wait

//        WaitUtils.waitFor(5);
//        String header = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText(); // implicit
//        System.out.println(header);

        // Explicit wait - waits untill the url contains 'dashboard'
        Wait explicit_wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        explicit_wait.until(ExpectedConditions.urlContains("dashboard"));


        String url = driver.getCurrentUrl();
        if(url.contains("dashboard")) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Unsuccessful!");
        }

        driver.quit();
    }
}
