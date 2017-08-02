package pdfFiller;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PdfFillerLogin extends BrowserFactory{

    private static String myEmail = "serhii.yasenev@gmail.com";
    private static String myPassword = "serhii.yasenev@gmail.com";


    @Test
    public void pdfillerLogin() throws InterruptedException {

        driver().manage().window().maximize();
        get("https://www.pdffiller.com/en/login.htm");
        driver.findElement(By.id("form-login-email")).sendKeys(myEmail);
        driver.findElement(By.id("form-login-password")).sendKeys(myPassword);
        driver.findElement(By.id("form-login-submit")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class=\"mf-sb__title-name\"]")).isDisplayed(), "Folders is not present - you are not logged in!");

    }
}
/*
"//nav[@class='mf-listWrap']//*[contains(text(), \"+myFolderName+\")]"

 */