package lesson11;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class FindElementsExample extends BrowserFactory{

@Test

    public void testBrowserNavigatorCssSelectors()
{
    System.out.println("Первый элемент: ");
    driver.get("https://www.imdb.com/chart/top");
    WebElement element = driver.findElement(By.cssSelector(".lister-list tr"));
    System.out.println(element.getText());


    System.out.println("Bсе элементы: ");
    driver.get("https://www.imdb.com/chart/top");
    List<WebElement> elements = driver.findElements(By.cssSelector(".lister-list tr"));
    for (WebElement elementFromList : elements)
        System.out.println(elementFromList.getText());
    }
}
