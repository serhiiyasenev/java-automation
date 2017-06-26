package lesson14;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionsExample {
    public static WebDriver driver;

    @Test
    public void testActions() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.imdb.com/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consumer_mai_nav_#navTitleMenu")));
        WebElement elem = driver.findElement(By.cssSelector("#consumer_mai_nav_#navTitleMenu"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elem).perform();
    }
}
