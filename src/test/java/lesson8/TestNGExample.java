package lesson8;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class TestNGExample {

    public static WebDriver driver;

    @BeforeTest
    public void beforeTestExample () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void aTest () {
        driver.get("http://google.com");
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("Hello, world!");
        driver.findElement(By.cssSelector("button.sbico-c")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".g h3 a[href]")).click();
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void  afterTestExample () {
        driver.quit();
    }
    }