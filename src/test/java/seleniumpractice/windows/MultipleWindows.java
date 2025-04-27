package seleniumpractice.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumpractice.utils.WaitUtils;

import java.time.Duration;
import java.util.Set;

public class MultipleWindows {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//a[@href='https://selectorshub.com/selectorshub/']//span//span[contains(text(),'Install')]")).click();
        WaitUtils.waitFor(2);
        driver.findElement(By.xpath("//a[@href='https://selectorshub.com/testcase-studio/']//span//span[contains(text(),'Install')]")).click();
        WaitUtils.waitFor(2);
        System.out.println(driver.getCurrentUrl());


        String current_window = driver.getWindowHandle();
        System.out.println("Current Window ID:" + current_window);

        Set<String> all_windows = driver.getWindowHandles();
        System.out.println(all_windows.size());

        for (String window : all_windows) {
            if (current_window.equals(window)) {
                System.out.println("Already in window: " + window);
            } else {
                driver.switchTo().window(window);
                System.out.println("Switched to window: " + window);
                System.out.println("URL after switched: " + driver.getCurrentUrl());
//                if(driver.getCurrentUrl().contains("testcase-studio")) {
//                    break;
//                }
            }
            WaitUtils.waitFor(2);
        }


        WaitUtils.waitFor(5);
        driver.quit();

    }
}
