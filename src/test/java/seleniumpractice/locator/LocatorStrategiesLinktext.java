package seleniumpractice.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategiesLinktext {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        String dlownadText = driver.findElement(By.linkText("DownLoad Link")).getText();
        System.out.println(dlownadText);

        String downloadTag = driver.findElement(By.linkText("DownLoad Link")).getTagName();
        System.out.println(downloadTag);


        String chaneltext = driver.findElement(By.partialLinkText("Youtube Channel")).getText();
        System.out.println(chaneltext);

        String click_to_practice_text = driver.findElement(By.partialLinkText("Click to practice")).getText();
        System.out.println(click_to_practice_text);


        driver.quit();
    }
}
