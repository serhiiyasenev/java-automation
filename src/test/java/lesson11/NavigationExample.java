package lesson11;

import core.BrowserFactory;
import org.testng.annotations.Test;


public class NavigationExample extends BrowserFactory{

@Test

    public void testBrowserNavigator()
{
    driver.get("https://google.com");
    driver.get("https://facebook.com");

    System.out.println("CURRENT URL: " + driver.getCurrentUrl());

    driver.navigate().back();
    System.out.println("AFTER.back() URL: " + driver.getCurrentUrl());

    driver.navigate().forward();
    System.out.println("AFTER.forward() URL: " + driver.getCurrentUrl());
}
}
