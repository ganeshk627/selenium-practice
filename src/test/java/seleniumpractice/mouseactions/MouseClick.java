package seleniumpractice.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import seleniumpractice.CommonActions;

import java.time.Duration;

public class MouseClick {
    public static void main(String[] args) {
//        CommonActions commonActions = new CommonActions();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://the-internet.herokuapp.com/checkboxes");



        // Mouse actions class
        Actions actions = new Actions(driver);

        // Single click
        WebElement checkbox1 = driver.findElement(By.xpath("//input[1]"));
        actions.click(checkbox1)
                        .build().perform();

//        commonActions.waitFor(2); // wait for 2 seconds


        //  click
        WebElement checkbox2 = driver.findElement(By.xpath("//input[2]"));
        actions.click(checkbox2)
                .build().perform();

//        commonActions.waitFor(2); // wait for 2 seconds


        driver.quit();
    }
}
