package lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


/**
 *
 */
public class BaseTest {

    public class BrowserFactory {

    WebDriver driver;

    @BeforeTest
        public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterTest
        public void tearDown()   {
        driver.close();
    }
}
}
