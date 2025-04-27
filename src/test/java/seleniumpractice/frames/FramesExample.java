package seleniumpractice.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class FramesExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//       Select menu = new Select(driver.findElement(By.cssSelector("select.selectnav")));
//        List<WebElement> options = menu.getOptions();
//        for(WebElement option: options) {
//            System.out.println(option.getText());
//        }

        WebElement frame1 = driver.findElement(By.cssSelector("#frm1"));
//        driver.switchTo().frame(0)
//        driver.switchTo().frame("frm1")
        driver.switchTo().frame(frame1);
        Select menu = new Select(driver.findElement(By.cssSelector("select.selectnav")));
        List<WebElement> options = menu.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }


//        driver.switchTo().frame("frm3");
//        driver.switchTo().frame(0);
//               Select menu = new Select(driver.findElement(By.cssSelector("select#selectnav2")));
//        List<WebElement> options = menu.getOptions();
//        for(WebElement option: options) {
//            System.out.println(option.getText());
//        }


    }
}
