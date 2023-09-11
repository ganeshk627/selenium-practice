package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    WebDriver ldriver;

    public DashboardPage(WebDriver rdriver) {
        ldriver = rdriver;
    }

    public void verifyDashboard() {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains("dashboard"));

        String actual_url = ldriver.getCurrentUrl();
        System.out.println(actual_url);
        String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

        if(expected_url.equals(actual_url)) {
            System.out.println("Matching...");
        } else {
            System.out.println("Not matching...");
        }

        try {
            Thread.sleep(2000);
        } catch (Exception e){}
    }
}
