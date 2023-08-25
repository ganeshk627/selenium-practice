package practice.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonWebElements {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");


        // textbox
        WebElement user = driver.findElement(By.id("userId"));
        user.sendKeys("ganesh@k.com");
        user.clear();

        driver.findElement(By.id("userId"))
                .sendKeys("k@ganesh");

        // button
//        driver.findElement(By.xpath("//input[@value='Submit']")).click();

        // select dropdown
//        Select cars = (Select) driver.findElement(By.xpath("//select[@id='cars']"));
//        cars.selectByVisibleText("Audi");
//        System.out.println("Is cars multiple? "+cars.isMultiple());

        // checkbox
//        driver.findElement(By.id("ohrmList_chkSelectRecord_15")).click();
//        try {
//            Thread.sleep(2000);
//        }catch (Exception e) {}
//        System.out.println(driver.findElement(By.id("ohrmList_chkSelectRecord_15")).isSelected());;


        // date picker
        driver.findElement(By.xpath("//input[@name='the_date']"))
                .sendKeys("06082023");

                // upload - sendkeys(rel-path)
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload"))
                .sendKeys("/Users/ganeshk/Automation Testing/Automation Classes/Selenium Practice/Custom/upload-file.txt");




        try {
            Thread.sleep(5000);
        }catch (Exception e) {}

        driver.close();
    }
}
