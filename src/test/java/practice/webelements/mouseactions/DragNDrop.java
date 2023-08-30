package practice.webelements.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragNDrop {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        //Element which needs to drag.
        WebElement from = driver.findElement(By.id("fourth"));

        //Element on which need to drop.
        WebElement to = driver.findElement(By.xpath("//ol[@id='amt7']"));

        //Using Action class for drag and drop.
        Actions actions=new Actions(driver);

        //Dragged and dropped.
        actions.dragAndDrop(from, to).build().perform();
    }
}
