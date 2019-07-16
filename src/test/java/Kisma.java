import com.sun.prism.Presentable;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.xml.bind.Element;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Listeners
public class Kisma {
    // mepsulirto@desoz.com 123456
    private By emailFld = By.cssSelector("[name='email']");
    private By passwordFld = By.cssSelector("[name='password']");
    private By submitBtn = By.cssSelector(".js_signInForm > a");
    private By loggedMenuPnl = By.cssSelector(".new-header");

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 15);

    @AfterTest
    public void closeWindow() {
//        driver.quit();
    }

    @Test
    public void testLogin() {
        login("mepsulirto@desoz.com", "123456");
        Assert.assertTrue(driver.findElement(loggedMenuPnl).isDisplayed());
    }

    @Test
    public void testSendMessage() {
        String message = randomString(20);
        login("mepsulirto@desoz.com", "123456");
        String allMessages = sendMessage(message);
        Assert.assertTrue(allMessages.contains(message));
    }

    @Test
    public void testChageSettings() throws InterruptedException {
        login("mepsulirto@desoz.com", "123456");
        driver.findElement(By.cssSelector(".new-header__photo")).click();
        driver.findElement(By.cssSelector("[href='/profile/settings']")).click();
        wait.until(ExpectedConditions.urlContains("profile/settings"));
        driver.findElement(By.cssSelector("[data-tab='profile']")).click();

        int dayNewValue = selectRandomvalue(By.cssSelector("[id='day']"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("settings-path__select settings-path__select--day")));
        driver.findElement(By.cssSelector("settings-path__select settings-path__select--day")).click();

    }

    private void login(String email, String password) {
        driver.get("https://kismia.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        driver.findElement(emailFld).sendKeys(email);
        driver.findElement(passwordFld).sendKeys(password);
        driver.findElement(submitBtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(loggedMenuPnl));
            }

    private String sendMessage(String message) {

        String messages = new String();

        wait.until(ExpectedConditions.elementToBeClickable(By.className("icon--header-messages")));
        driver.findElement(By.className("icon--header-messages")).click();
        wait.until(ExpectedConditions.urlContains("messages"));
        driver.findElement(By.cssSelector(".thread__user-photo")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("chat-controls__textarea")));
        driver.findElement(By.className("chat-controls__textarea")).clear();
        driver.findElement(By.className("chat-controls__textarea")).sendKeys(message);
        driver.findElement(By.cssSelector(".chat-controls__button-submit")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".chat-controls__button-submit:disabled")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".chat-controls__button-submit:enabled")));
        messages = driver.findElement(By.cssSelector(("#messages-list"))).getText();
        return messages;
    }

    @NotNull
    private static String randomString(int count) {
        final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder builder = new StringBuilder();

        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();

    }

    private int selectRandomvalue(By by){

        Select dropDown = new Select(driver.findElement(by));

        List<WebElement> optionsList = dropDown.getOptions();
        int optionsCount = optionsList.size();
        int randElement = 1 + (int) (Math.random() * optionsCount);
        //надо выбрать рандомный элемент из списка
        return randElement;
    }
}
