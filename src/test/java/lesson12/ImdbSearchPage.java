package lesson12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbSearchPage implements SearchPage {

   private WebDriver driver;

   public ImdbSearchPage(WebDriver driver){
            this.driver = driver;
   }

    @Override
    public void inputText(String text) {
    driver.findElement(By.cssSelector("#navbar-query")).clear();
    driver.findElement(By.cssSelector("#navbar-query")).sendKeys(text);
    }

    @Override
    public void submit() {
        driver.findElement(By.cssSelector(".magnifyingglass")).click();
    }

    @Override
    public void open() {
       driver.get("http://www.imdb.com/");

    }
}
