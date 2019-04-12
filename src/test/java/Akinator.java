import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;

public class Akinator {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.get("https://ru.akinator.com");
        driver.findElement(By.className("btn-play")).click();

        boolean gameNotOver = driver.findElements(By.className("proposal-title")).isEmpty();

        while (gameNotOver) {

            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("overlayed")));

            System.out.println("\n--- Ответьте на вопрос ---");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("question-text")));
            System.out.println(driver.findElement(By.className("question-text")).getText());

            Scanner in = new Scanner(System.in);
            System.out.println("\n--- Введите номер ответа: ---");
            System.out.println("\n" + driver.findElement(By.id("a_yes")).getText() + " - 1");
            System.out.println("\n" + driver.findElement(By.id("a_no")).getText() + " - 2");
            System.out.println("\n" + driver.findElement(By.id("a_dont_know")).getText() + " - 3");
            System.out.println("\n" + driver.findElement(By.id("a_probably")).getText() + " - 4");
            System.out.println("\n" + driver.findElement(By.id("a_probaly_not")).getText() + " - 5\n");

            int answer = in.nextInt();
            String answerPositon;
            switch (answer) {
                case 1:
                    answerPositon = "a_yes";
                    break;
                case 2:
                    answerPositon = "a_no";
                    break;
                case 3:
                    answerPositon = "a_dont_know";
                    break;
                case 4:
                    answerPositon = "a_probably";
                    break;
                case 5:
                    answerPositon = "a_probaly_not";
                    break;
                default:
                    answerPositon = "Нет такого ответа. Выбирай числа от 1 до 5.";
                    break;
            }
            if (answer > 0 && answer < 6) {
                driver.findElement(By.id(answerPositon)).click();
            } else {
                System.out.print(answerPositon);
            }

            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("overlayed")));
            gameNotOver = driver.findElements(By.className("proposal-title")).isEmpty();
        }

        System.out.println("\n--- Ответ: ---");
        System.out.println(driver.findElement(By.className("\nproposal-title")).getText());
        System.out.println(driver.findElement(By.className("\nproposal-subtitle")).getText());

        driver.close();
    }
}
