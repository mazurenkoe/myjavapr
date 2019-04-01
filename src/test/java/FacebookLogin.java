import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin {
    public static void main(String[] args) throws InterruptedException {

        String email = "testdar1@mail.ru";
        String password = "testdar1@mail.ru";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.get("https://facebook.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_form")));
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("loginbutton")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("homeSideNav")));

        driver.get("https://www.facebook.com/messages/t");

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'uiScrollableAreaContent')]//div/div[2]/div[last()]")));

        String content = (driver.findElement(By.xpath("//div[contains(@class, 'uiScrollableAreaContent')]//div/div[2]/div[last()]/span"))).getText();
        System.out.println(content);

        driver.quit();
    }
}
