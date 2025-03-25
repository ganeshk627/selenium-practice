package seleniumpractice.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import seleniumpractice.utils.WaitUtils;

import java.time.Duration;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://selectorshub.com/xpath-practice-page/");


        WebElement checkouthere = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        WaitUtils.waitFor(5);

        // Mouse hover and click
        Actions actions = new Actions(driver);
        actions.moveToElement(checkouthere)
//                .click()
                .build().perform();
        //// Seperately
// mouse hover
//        actions.moveToElement(checkouthere)
//                .build().perform();
        // mouse left click
//        actions.click(checkouthere)
//                .build().perform();


        WaitUtils.waitFor(5);
        driver.quit();


    }
}
