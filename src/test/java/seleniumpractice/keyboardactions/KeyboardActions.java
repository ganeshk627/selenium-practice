package seleniumpractice.keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.utils.WaitUtils;

public class KeyboardActions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://translate.google.co.in/?sl=en&tl=hi&op=translate");

        WaitUtils.waitFor(2);
        WebElement text_area = driver.findElement(By.cssSelector("textarea[aria-label='Source text']"));

        text_area.sendKeys("I am running out on time");
        WaitUtils.waitFor(1);
        text_area.sendKeys(Keys.ARROW_LEFT);
        text_area.sendKeys(Keys.ARROW_LEFT);
        text_area.sendKeys(Keys.ARROW_LEFT);
        text_area.sendKeys(Keys.ARROW_LEFT);
        text_area.sendKeys(Keys.BACK_SPACE); // windows/ linux/ mac
        text_area.sendKeys(Keys.BACK_SPACE);
        text_area.sendKeys(Keys.BACK_SPACE);
        WaitUtils.waitFor(1);


        // Compound keys
//        text_area.sendKeys(Keys.chord(Keys.CONTROL, "a"));  windows/ linux/
        text_area.sendKeys(Keys.chord(Keys.COMMAND, "a")); // mac
        WaitUtils.waitFor(1);
        text_area.sendKeys(Keys.chord(Keys.COMMAND, "c")); // mac
        WaitUtils.waitFor(1);

        text_area.sendKeys("I am running out of time");
        WaitUtils.waitFor(1);

        text_area.sendKeys(Keys.chord(Keys.COMMAND, "a")); // mac
        WaitUtils.waitFor(1);
        text_area.sendKeys(Keys.chord(Keys.COMMAND, "v")); // mac



        WaitUtils.waitFor(5);
driver.quit();

    }
}
