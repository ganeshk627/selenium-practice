package seleniumpractice.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import seleniumpractice.utils.WaitUtils;

public class LeftClick {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();


        WaitUtils.waitFor(2);


        // checkbox
//        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.xpath("//button[text()='Submit']")))
                        .build()
                                .perform();

        WaitUtils.waitFor(2);
        driver.quit();
    }

//    private static void waitFor(int seconds) {
//        try {
//            Thread.sleep(seconds*1000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
