package lesson14;

import core.CustomConditions;
import core.constants.WaitTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;


public class ScreenShotExample {
    protected static WebDriver driver;

    public static WebDriver driver(){
        return driver;
    }

    protected WebDriverWait getWebDriverWait(long timeout){
        return new WebDriverWait(driver(), timeout);
    }

    public void get (){
        getWebDriverWait(WaitTime.DEFAULT_ELEMENT_WAIT).until(CustomConditions.pageLoaded());
    }

    @Test
    public void testTakeScreen() throws IOException {

            driver = new ChromeDriver();
            driver.get("https://google.com");
            driver.manage().window().maximize();
            driver.findElement(By.id("lst-ib")).clear();
            driver.findElement(By.id("lst-ib")).sendKeys("Hello, world!");
            getWebDriverWait(15).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button.sbico-c"))));
            driver.findElement(By.cssSelector("button.sbico-c")).click();
            getWebDriverWait(15).until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(".g h3 a[href]"))));
            driver.findElement(By.cssSelector(".g h3 a[href]")).click();
            File ScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            for (int i=0; i<3; i++) {
                FileUtils.copyFile(ScreenshotFile, new File("C:\\Users\\Natali\\Desktop\\Auto\\testwe" + Integer.toString(i) + ".jpg"));
            }
            driver.quit();
            }
    }