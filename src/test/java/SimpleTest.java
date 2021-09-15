import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.DriverFactory;

public class SimpleTest {
    private WebDriver driver;
    
    @Parameters("browser")
    @BeforeMethod()
    public void initDriver(@Optional("safari") String browserName) {
        driver = DriverFactory.createDriver(browserName);
    }
    
    @Test
    public void test1(){
        System.out.println("test");
    }
}
