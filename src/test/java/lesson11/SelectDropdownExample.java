package lesson11;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropdownExample extends BrowserFactory{

@Test

    public void testBrowserNavigatorCssSelectors() throws InterruptedException
{
    driver.get("https://www.imdb.com/chart/top");

    Select select = new Select(driver.findElement(By.cssSelector(".lister-sort-by")));
    select.selectByIndex(2);

    System.out.println();

    // select.selectByValue("SomeValue");
    // select.selectByVisibleText("someText");
    }
}
