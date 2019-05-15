package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FilmInfo {

    public WebDriver driver;


    @Test
    public void FindFilm(){

        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver = new ChromeDriver();
        driver.get("https://www.imdb.com/chart/top");

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[contains(@class, 'lister-list')//tr/td")));

        String title = (driver.findElement(By.xpath("//*[contains(@class, 'lister-list')//tr/td"))).getText();
        System.out.println(title);

        driver.quit();

    }
}
