package core;

import core.listeners.DriverEvenListenerExample;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BrowserFactory extends MethodsFactory{

    @BeforeTest
    public void beforeTestExample () {
        driver = new ChromeDriver();
        driver = new EventFiringWebDriver(driver).register(new DriverEvenListenerExample());
        driver.manage().window().maximize();
    }

    @AfterTest
    public void  afterTestExample () {
        driver.quit();
    }
}



