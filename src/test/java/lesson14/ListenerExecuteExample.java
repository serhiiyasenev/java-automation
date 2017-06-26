package lesson14;


import core.BrowserFactory;
import lesson12.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ListenerExecuteExample extends BrowserFactory {

   private WebDriver driver;

   public ListenerExecuteExample(WebDriver driver){
            this.driver = driver;
   }

    @Test
    public void open() {
       driver.get("https://www.kinopoisk.ru/");
       driver.findElement(By.cssSelector(".weg"));

    }
}
