package lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class RealTestNDTest {
    private String expected_title = "Save Time Editing PDF Documents Online For Free";
    private WebDriver driver;

    @BeforeTest
    public void main() {

    }

    @Test
    public void firstTestNgGetexample() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.pdffiller.com/");
        WebElement title_element = driver.findElement(By.xpath("//*[class='page-title]"));

    }

    @Test
    public void secondTestNgGetexample() {
        driver = new ChromeDriver();

        driver.get("https://www.pdffiller.com/");
        WebElement title_element_new = driver.findElement(By.xpath("//*[class='page-title]"));
        String actualTitle = title_element_new.getText();
        Assert.assertEquals(expected_title, actualTitle, "Title is correct");
        Assert.assertNotEquals(expected_title, actualTitle, "Title is incorrect");

    }
}
