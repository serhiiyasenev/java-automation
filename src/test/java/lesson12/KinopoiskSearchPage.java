package lesson12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KinopoiskSearchPage implements SearchPage {

   private WebDriver driver;

   public KinopoiskSearchPage(WebDriver driver){
            this.driver = driver;
   }

    @Override
    public void inputText(String text) {
    driver.findElement(By.cssSelector("#search_input")).clear();
    driver.findElement(By.cssSelector("#search_input")).sendKeys(text);
    }

    @Override
    public void submit() {
        driver.findElement(By.cssSelector(".searchButton1")).click();
    }

    @Override
    public void open() {
       driver.get("https://www.kinopoisk.ru/");

    }
}
