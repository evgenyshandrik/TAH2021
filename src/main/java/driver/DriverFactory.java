package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
    
    static {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
    }
    
    public DriverFactory() {
    }
    
    public static WebDriver createDriver(String browserName) {
        WebDriver driver;
        if (browserName.contentEquals("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new SafariDriver();
        }
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        
        driver.get("https://google.com");
        
        return driver;
    }
}
