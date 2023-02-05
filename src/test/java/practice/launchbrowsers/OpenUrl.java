package practice.launchbrowsers;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {
    public static void main(String []args){
        WebDriver driver = new ChromeDriver(); //1
        driver.get("https://www.google.com/"); //2
//        driver.get("https://google.com/");
//        driver.get("http://www.google.com/");
//        driver.get("www.google.com/");
//        driver.get("http://www.google.com/logo");
        System.out.println(driver.getTitle());
        driver.close();//3
    }
}
