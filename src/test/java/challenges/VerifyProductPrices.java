package challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class VerifyProductPrices {

    private static final By SEARCH_INPUT = By.xpath("//input[@aria-label='Search Amazon.in']");
    private static final By FIRST_SUGGESTION = By.cssSelector(".left-pane-results-container >:first-child .s-suggestion-container");
    private static final By OUT_OF_STOCK = By.xpath("//li[@aria-label='Include Out of Stock']//input");
    private static final By ROW_OF_RESULTS = By.className("puisg-row");
    private static final By PRODUCT_NAME = By.xpath("//h2");
    private static final By PRODUCT_PRICE = By.cssSelector(".a-price .a-price-whole");

    private static WebDriver driver;



    // Opening amazon.com
    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }


    @Test
    public void VerifyAllTheProductsHavingPrice() {


        // Searching for "iphone 11"
        driver.findElement(SEARCH_INPUT).sendKeys("iphone 11");

        // Selecting the first suggestion
        driver.findElement(FIRST_SUGGESTION).click();

        // Including out of stocks
        WebElement out_of_stock = driver.findElement(OUT_OF_STOCK);
        Actions actions = new Actions(driver);
        actions.scrollToElement(out_of_stock)
                .click(out_of_stock)
                .build()
                .perform();

        try{
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Verifying that all the products are having price attribute
        List<WebElement> rows = driver.findElements(ROW_OF_RESULTS);
        System.out.println("Rows count: " + rows.size());


        SoftAssert priceAssert = new SoftAssert();
        Duration timout = driver.manage().timeouts().getImplicitWaitTimeout();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        for (WebElement row:rows) {
                if(row.findElements(PRODUCT_PRICE).size()>0) {
                    System.out.println(row.findElement(PRODUCT_NAME).getText() + " is having price: " + row.findElement(PRODUCT_PRICE).getText());
                } else {
                    priceAssert.fail(row.findElement(PRODUCT_NAME).getText()+" is not having price value!!!");
                }
        }
        priceAssert.assertAll("Below products are not having prices:");

        driver.manage().timeouts().implicitlyWait(timout);

    }


    // closing browser
    @AfterMethod(alwaysRun = true)
    public void teardown() {
        driver.quit();
    }
}
