package pdfFiller;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Random;

public class PdfFillerCreateFolder extends BrowserFactory{

    private static String myEmail = "serhii.yasenev@gmail.com";
    private static String myPassword = "serhii.yasenev@gmail.com";
    private Random random = new Random();
    private int packageRandomInt = random.nextInt(900) + 100;
    private String packageRandomIntString = String.valueOf(packageRandomInt);
    private String myFolderName = "myFolder " + packageRandomIntString;

    @Test
    public void pdfFillerCreateFolder() throws InterruptedException {
/*
        driver().manage().window().maximize();
        get("https://www.pdffiller.com/en/login.htm");
        driver.findElement(By.id("form-login-email")).sendKeys(myEmail);
        driver.findElement(By.id("form-login-password")).sendKeys(myPassword);
        driver.findElement(By.id("form-login-submit")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class=\"mf-sb__title-name\"]")).isDisplayed(), "Folder is not present - you are not logged in!");
*/
        driver.findElement(By.xpath("//span[@class=\"g-ibtn i-add-folder folder_buttons tooltip--top tooltipstered\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Folder Name\"]")).clear();
        driver.findElement(By.xpath("//input[@placeholder=\"Folder Name\"]")).sendKeys(myFolderName);
        driver.findElement(By.cssSelector(".modal-body .btn.-sm.-orange")).click();

        String currentFolderXpath = "//nav[@class='mf-listWrap']//*[contains(text(), "+"'"+myFolderName+"'"+")]";
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath(currentFolderXpath)).isDisplayed(), "The new Folder is not present - check creation procedure!");
    }
}