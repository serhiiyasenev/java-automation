package lesson12;

import core.BrowserFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InterfaceExample extends BrowserFactory {

  @DataProvider
  public Object [] [] pages() {
      return new Object[][] {
              {new KinopoiskSearchPage(driver)},
              {new ImdbSearchPage(driver)}
      };
  }

    @Test (dataProvider = "pages")
    public void testSearch(SearchPage searchPage) throws InterruptedException{

    searchPage.open();
    searchPage.inputText("Побег из Шоушенка");
    searchPage.submit();
    Thread.sleep(3000);
    }
}