package seleniumpractice.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import seleniumpractice.utils.WaitUtils;
//import seleniumpractice.CommonActions;

import java.time.Duration;

public class DoubleClick {
    public static void main(String[] args) {
//        CommonActions commonActions = new CommonActions();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");


        WaitUtils.waitFor(2);
        // Mouse actions class
        Actions actions = new Actions(driver);

      // Double click
        WebElement dbl = driver.findElement(By.xpath("//div[@id='box']"));
        actions.doubleClick(dbl)
                .build().perform();

        WaitUtils.waitFor(5); // wait for 5 seconds

        driver.quit();
    }
}
