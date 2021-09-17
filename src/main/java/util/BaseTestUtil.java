package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import driver.DriverFactory;

public class BaseTestUtil {
    private WebDriver driver;
    
    @Parameters("browser")
    @BeforeMethod()
    public void initDriver(@Optional("safari") String browserName) {
        driver = DriverFactory.createDriver(browserName);
    }
    
    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }
}
