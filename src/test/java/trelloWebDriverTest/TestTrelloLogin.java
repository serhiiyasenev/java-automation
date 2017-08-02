package trelloWebDriverTest;

import core.BrowserFactory;
import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestTrelloLogin extends BrowserFactory{

    private static String myTrelloEmail = "serhii.yasenev@gmail.com";
    private static String myTrelloPassword = "serhii.yasenev@gmail.com";
    private static String myTestList1 = "myTestList1";
    private static String myTestList2 = "myTestList2";
    private static String myTestCard1 = "myTestCard";

    @Test
    public void testTrelloWebDriver() throws EmailException, InterruptedException, MessagingException, IOException {

        driver().manage().window().maximize();
        get("https://trello.com/login");
        driver.findElement(By.id("user")).sendKeys(myTrelloEmail);
        driver.findElement(By.id("password")).sendKeys(myTrelloPassword);
        driver.findElement(By.id("login")).click();
        Thread.sleep(5000);
       // int ii2 = driver.findElements(By.xpath("//span[@title=\"testTrelloWebDiver\" and text()='testTrelloWebDiver']")).size();
        get("https://trello.com/b/gGIgxW8x/testtrellowebdiver");
        int i = driver.findElements(By.xpath("//textarea[@aria-label=\"myTestList1\"]")).size();
        if (i<1) {
            driver.findElement(By.xpath("//span[@class=\"placeholder.js-open-add-list\"]")).click();
            driver.findElement(By.cssSelector(".list-name-input")).sendKeys(myTestList1);
            driver.findElement(By.cssSelector(".primary.mod-list-add-button.js-save-edit")).click();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//textarea[@aria-label=\"myTestList1\"]")).isDisplayed(), "myTestList1 is not present");

        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]"));
        //int card = element1.findElement()
        element1.findElement(By.xpath("//a[@class=\"open-card-composer js-open-card-composer\"]")).click();
        element1.findElement(By.xpath("//textarea[@class=\"list-card-composer-textarea js-card-title\"]")).sendKeys(myTestCard1);
        element1.findElement(By.xpath("//input[@class=\"primary confirm mod-compact js-add-card\"]")).click();

    }
}
/*


 */