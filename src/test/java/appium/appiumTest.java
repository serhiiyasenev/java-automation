package appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


public class appiumTest {

    WebDriver driver;
    @BeforeClass

    public void setUp() throws Exception {
            //location of the app
            File app = new File("C:\\Users\\NEERAJ\\Downloads", "ContactManager.apk");
            //To create an object of Desired Capabilities
            DesiredCapabilities capability = new DesiredCapabilities();
            //OS Name
            capability.setCapability("device", "Android");
            capability.setCapability(CapabilityType.BROWSER_NAME, "");
            //Mobile OS version. In My case its running on Android 4.2
            capability.setCapability(CapabilityType.VERSION, "4.2");
            capability.setCapability("app", app.getAbsolutePath());
            //To Setup the device name
            capability.setCapability("deviceName", "Moto G");
            capability.setCapability("platformName","Android");
            //set the package name of the app
            capability.setCapability("app-package", "com.example.android.contactmanager-1");
            //set the Launcher activity name of the app
            capability.setCapability("app-activity", ".ContactManager");
            //driver object with new Url and Capabilities
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
            }

        @Test

 public void testApp() throws MalformedURLException{

                    System.out.println("App launched");

                    WebElement addContactButton = driver.findElement(By.name("Add Contact"));

            addContactButton.click();

            //locate input fields and type name and email for a new contact and save it

            List<WebElement>textFields = driver.findElements(By.className("android.widget.EditText"));

            textFields.get(0).sendKeys("Neeraj Test");

            textFields.get(1).sendKeys("9999999999");

            textFields.get(2).sendKeys("testemail@domain.com");

            driver.findElement(By.name("Save")).click();

            //insert assertions here

    }
}
