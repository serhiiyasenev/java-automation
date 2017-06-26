package lesson14;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class CapabiltiesExample {
    public static WebDriver driver;

    @Test
    public void testActionsWithCapability() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability("pageLoadStrategy", "none"); // or "complete" or "interactive"
        driver = new ChromeDriver(capabilities);

        driver.get("https://www.imdb.com/");
        WebElement elem = driver.findElement(By.cssSelector("#consumer_mai_nav_#navTitleMenu"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elem).perform();
    }
}
