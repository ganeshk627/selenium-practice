package practice.webelements.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement checkout_here = driver.findElement(By.xpath("//button[normalize-space()='Checkout here']"));

        Actions actions = new Actions(driver);
//         single mouse action - .perform()
//        actions.moveToElement(checkout_here).build().perform();
//        actions.contextClick(checkout_here).perform();



        // combined mouse action - .build().perform();
        actions.moveToElement(checkout_here)
                .click(checkout_here)
                .build().perform();




    }
}
