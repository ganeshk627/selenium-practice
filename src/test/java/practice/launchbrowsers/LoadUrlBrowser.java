package practice.launchbrowsers;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadUrlBrowser {
    public static void main(String []args){
        WebDriver driver = new ChromeDriver(); //1
        driver.get("https://www.google.com/"); //2 - wait for max 5 minutes till all the web elements loaded
//        driver.get("https://google.com/");
//        driver.get("http://www.google.com/");
//        driver.get("www.google.com/");
//        driver.get("http://www.google.com/logo");
        System.out.println(driver.getTitle());
        driver.close();//3
    }
}
