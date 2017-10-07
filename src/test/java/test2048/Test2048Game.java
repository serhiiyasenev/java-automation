package test2048;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import trelloApi.TrelloApiClient;
import java.io.IOException;

public class Test2048Game extends TrelloApiClient {

    public static WebDriver driver;

    @Test
    public void alala1() throws IOException, InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://2048game.com/");
        Actions actions = new Actions(driver);

        for (int i = 0; i < 10; i++) {
            int f = driver.findElements(By.xpath("//div[@class=\"game-message game-over\"]/p")).size();
            if (f>0) {
                driver.findElement(By.cssSelector(".restart-button")).click();
            }
                while (driver.findElements(By.xpath("//div[@class=\"game-message game-over\"]/p")).size()==0) {
                    actions.sendKeys(Keys.ENTER).perform();
                    actions.sendKeys(Keys.ARROW_UP).perform();
                    actions.sendKeys(Keys.ARROW_LEFT).perform();
                    // actions.sendKeys(Keys.ARROW_RIGHT).perform();
                    Thread.sleep(300);
                }
            String score = driver.findElement(By.cssSelector(".score-container")).getText();
            if (score.length()>4)
            {
                score = score.substring(0, 3);
            }
            System.out.println(createCard(listId, score));
            driver.findElement(By.cssSelector(".restart-button")).click();
            }
        }
    }