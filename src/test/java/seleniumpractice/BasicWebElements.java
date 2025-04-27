package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasicWebElements {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        // input
        WebElement emailInput = driver.findElement(By.xpath("//input[@title='Email']"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("hello@harry.com");
        emailInput.clear();
        emailInput.sendKeys("hello@hemoine.in");
        emailInput.sendKeys("hello@ron.com");
        System.out.println(emailInput.getAttribute("value"));


        // click
        WebElement submit_button = driver.findElement(By.xpath("//button[text()='Submit']"));
        submit_button.click();
        System.out.println(submit_button.getText());
        System.out.println(submit_button.getTagName());
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        BasicWebElements.waitFor(5);


        // checkbox
        WebElement checkbox = driver.findElement(By.cssSelector("input[name='chkSelectAll']"));
        System.out.println("Checkbox selected:"+checkbox.isSelected());
        checkbox.click();
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        BasicWebElements.waitFor(2);
        System.out.println("Checkbox selected:"+checkbox.isSelected());
        // Selecting the checkbox only if its unselected
        if(checkbox.isSelected()) {
            System.out.println("Already checkbox selected!");
        } else {
            checkbox.click();
            System.out.println("Checkbox is selected!");
        }
        // Unselecting the checkbox only if its selected
        if(!checkbox.isSelected()) {
            System.out.println("Already checkbox unselected!");
        } else {
            checkbox.click();
            System.out.println("Checkbox is unselected!");
        }

        int amountInt = 1000;
        float amountFloat =  (float) amountInt;



        // Select dropdown
        // Converting webelement to Select class to access methods in Select class
        Select chooseCar = new Select(driver.findElement(By.cssSelector("select[name='cars']")));
        // Printing options
        List<WebElement> carOptions = chooseCar.getOptions();
        System.out.println("Printing options...");
        for (WebElement carOption: carOptions) {
            System.out.println(carOption.getText());
        }
        // Checking whether the dropdown allows multiple selection
        System.out.println("Choose car suppports multiple selection: " + chooseCar.isMultiple());
        // Choose by index
        chooseCar.selectByIndex(2);
        BasicWebElements.waitFor(2);
        // Choose by value
        chooseCar.selectByValue("volvo");
        BasicWebElements.waitFor(2);
        // Choose by text
        chooseCar.selectByVisibleText("Audi");
        BasicWebElements.waitFor(2);
        // Choose by contains visible text
//        chooseCar.selectByContainsVisibleText("Sa");
//        BasicWebElements.waitFor(2);
        // Without using select class
        driver.findElement(By.cssSelector("select[name='cars']")).click();
        BasicWebElements.waitFor(1);
        driver.findElement(By.cssSelector("option[value='audi']")).click();
        BasicWebElements.waitFor(5);

        // Upload
        WebElement upload = driver.findElement(By.xpath("//input[@name='filename']"));
        upload.sendKeys("/Users/ganeshk/Automation Testing/Automation Classes/selenium-practice-2025/selenium-practice-2025/src/test/java/seleniumpractice/upload-file1.txt");
        System.out.println("File uploaded successfully!");

        // Date picker
        WebElement datePicker = driver.findElement(By.xpath("//input[@name='the_date']"));
        datePicker.sendKeys("03202014");
        System.out.println(datePicker.getAttribute("value"));

        BasicWebElements.waitFor(5);
        driver.quit();
    }

    private static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
