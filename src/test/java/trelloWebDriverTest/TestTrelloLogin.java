package trelloWebDriverTest;

import core.BrowserFactory;
import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import javax.mail.MessagingException;
import java.io.IOException;


public class TestTrelloLogin extends BrowserFactory{

    private static String myTrelloEmail = "serhii.yasenev@gmail.com";
    private static String myTrelloPassword = "serhii.yasenev@gmail.com";

    private static String myTestList1 = "myTestList1";
    private static String myTestList2 = "myTestList2";
    private static String myTestCard1 = "myTestCard";


    @Test
    public void testTrelloWebDriver() throws EmailException, InterruptedException, MessagingException, IOException {

        driver().manage().window().maximize();
        get("https://trello.com");
        driver.findElement(By.cssSelector(".global-header-section-button")).click();
        driver.findElement(By.id("user")).sendKeys(myTrelloEmail);
        driver.findElement(By.id("password")).sendKeys(myTrelloPassword);
        driver.findElement(By.id("login")).click();
        get("https://trello.com/b/gGIgxW8x/testtrellowebdiver");

        int i = driver.findElements(By.xpath("//textarea[@aria-label=\"myTestList1\"]")).size();
        if (i<1) {
            driver.findElement(By.xpath("//span[@class=\"placeholder js-open-add-list\"]")).click();
            driver.findElement(By.cssSelector(".list-name-input")).sendKeys(myTestList1);
            driver.findElement(By.cssSelector(".primary.mod-list-add-button.js-save-edit")).click();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//textarea[@aria-label=\"myTestList1\"]")).isDisplayed(), "myTestList1 is not present");
        /*
        WebElement myList = driver.findElement(By.cssSelector(".lister-list tr"));
        driver.findElement(By.xpath("//a[@class=\"open-card-composer js-open-card-composer\"]")).click();
       */

    }
}