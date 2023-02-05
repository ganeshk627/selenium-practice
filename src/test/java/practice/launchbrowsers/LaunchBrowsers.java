package practice.launchbrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowsers {
     /*
     we don't need any drivers to be downloaded or webdrivermanager
     if we are using selenium version 4.5.x or more
     */

    public void launchBrowserBefore4_5_x(String browser){
        if(browser.equalsIgnoreCase("chrome")){
//            https://chromedriver.chromium.org
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
//            https://github.com/mozilla/geckodriver/releases
            System.setProperty("webdriver.gecko.driver", "");
            WebDriver driver = new FirefoxDriver();
        }else if (browser.equals("ie")) {
//            https://github.com/SeleniumHQ/selenium/releases/download/selenium-3.0.0/IEDriverServer_Win32_3.0.0.zip
//            https://github.com/SeleniumHQ/selenium/releases/download/selenium-3.0.0/IEDriverServer_x64_3.0.0.zip
            System.setProperty("webdriver.ie.driver", "");
            WebDriver driver = new InternetExplorerDriver();
        }else if (browser.equals("edge")) {
//            https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads
            System.setProperty("webdriver.edge.driver", "");
            WebDriver driver = new EdgeDriver();
        }else if (browser.equals("opera")) {
//            https://github.com/operasoftware/operachromiumdriver/releases
            System.setProperty("webdriver.opera.driver", "");
            WebDriver driver = new OperaDriver();
        }else if (browser.equals("safari")) {
//            /usr/bin/safaridriver
//            safaridriver --enable
            WebDriver driver = new SafariDriver();
        }
    }

    public void launchBrowserWithWebdrivermanager(String browser){

        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
        }else if (browser.equals("ie")) {
            WebDriverManager.iedriver().setup();
            WebDriver driver = new InternetExplorerDriver();
        }else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
        }else if (browser.equals("opera")) {
            WebDriverManager.operadriver().setup();
            WebDriver driver = new OperaDriver();
        }else if (browser.equals("safari")) {
//            /usr/bin/safaridriver
//            safaridriver --enable
            WebDriver driver = new SafariDriver();
        }
    }

    public void launchBrowserAfter4_5_x(String browser){

    }



    public static void main(String [] args){
        String browser = "chrome";
        LaunchBrowsers launchBrowsers = new LaunchBrowsers();
        launchBrowsers.launchBrowserBefore4_5_x(browser);

    }


}
