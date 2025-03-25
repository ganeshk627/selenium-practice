package seleniumpractice.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import seleniumpractice.utils.WaitUtils;

import java.time.Duration;

public class DragNDrop {

    public static void main(String[] args) {

//        WebDriver driver = new EdgeDriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        // source element
//        WebElement A = driver.findElement(By.id("column-a"));
        WebElement A = driver.findElement(By.xpath("//header[normalize-space()='A']"));

        // target element
//        WebElement B = driver.findElement(By.id("column-b"));
        WebElement B = driver.findElement(By.xpath("//header[normalize-space()='B']"));

        // Reference to perform mouse actions
        Actions a = new Actions(driver);

        // 1. drag and drop - predefined method
        a.dragAndDrop(A, B)
                .build().perform();

        WaitUtils.waitFor(5); // waiting for 5 seconds

        // 2. drag and drop - multiple actions
        // source element
        WebElement source = driver.findElement(By.xpath("//header[normalize-space()='A']"));
        // target element
        WebElement target = driver.findElement(By.xpath("//header[normalize-space()='B']"));
        a.moveToElement(source)
                .clickAndHold(source)  // passing source element is optional
                .moveToElement(target)
                .release(target) // passing target element is optional
                .build().perform();

        WaitUtils.waitFor(5); // waiting for 5 seconds

        // closing browser
        driver.close();
    }
}
