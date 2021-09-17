import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.BaseTestUtil;

public class SimpleTest extends BaseTestUtil {
    private WebDriver driver;
    
    @Test
    public void test1() {
        System.out.println("test");
    }
}
