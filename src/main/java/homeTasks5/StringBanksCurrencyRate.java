package homeTasks5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class StringBanksCurrencyRate {


    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // UkrSibBank
        Thread.sleep(2000);
        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        String usdToUahBuyUkrSibBank = driver.findElement(By.xpath("//*[@id=\"no_tabs_content\"]/table/tbody/tr[1]/td[3]")).getText().replace(",", ".");
        String keyword = "доллар США";
        String usdToUahBuyUkrSibBank1 = driver.getPageSource();
        if (usdToUahBuyUkrSibBank1.contains(keyword))
        {
            int i = usdToUahBuyUkrSibBank1.indexOf(keyword) + keyword.length() + 9;
            usdToUahBuyUkrSibBank1 = usdToUahBuyUkrSibBank1.substring(i, (i+7));
        }
        double UkrSibBank_Buy1 = Double.parseDouble(usdToUahBuyUkrSibBank1.replace(",","."));
        double UkrSibBank_Buy = Double.parseDouble(usdToUahBuyUkrSibBank);

        // далее по такому же принципу, также можно взять индекс с другой стороны "keyword1" чтоб не использовать абсолютных значений

        driver.quit();
    }
}