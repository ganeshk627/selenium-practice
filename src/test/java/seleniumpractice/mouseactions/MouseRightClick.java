package seleniumpractice.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import seleniumpractice.utils.WaitUtils;

import java.time.Duration;

public class MouseRightClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://selectorshub.com/xpath-practice-page/");


        WebElement checkouthere = driver.findElement(By.xpath("//button[@class='dropbtn']"));

        Actions actions = new Actions(driver);

        // right click
        actions.moveToElement(checkouthere)
                .contextClick()
                .build().perform();


        WaitUtils.waitFor(5);
        driver.quit();
    }
}
