package homeTasks2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DZ2_CurrencyRate {


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
        double UkrSibBank_Buy = Double.parseDouble(usdToUahBuyUkrSibBank);
        String usdToUahSaleUkrSibBank = driver.findElement(By.xpath("//*[@id=\"no_tabs_content\"]/table/tbody/tr[1]/td[4]")).getText().replace(",", ".");
        double UkrSibBank_Sale = Double.parseDouble(usdToUahSaleUkrSibBank);
        // Privat
        driver.get("https://privatbank.ua/business/");
        String usdToUahBuyPrivat = driver.findElement(By.xpath("//*[@id=\"selectByPB\"]/tr[3]/td[2]")).getText();
        double Privat_Buy = Double.parseDouble(usdToUahBuyPrivat);
        String usdToUahSalePrivat = driver.findElement(By.xpath("//*[@id=\"selectByPB\"]/tr[3]/td[3]")).getText();
        double Privat_Sale = Double.parseDouble(usdToUahSalePrivat);
        // Aval
        driver.get("https://www.aval.ua/ru/personal/everyday/exchange/exchange/");
        String usdToUahBuyAval = driver.findElement(By.xpath("//*[@id=\"bar-center\"]/div[1]/div/div[1]/table/tbody/tr[2]/td[2]")).getText().replace(",", ".");
        double Aval_Buy = Double.parseDouble(usdToUahBuyAval);
        String usdToUahSaleAval = driver.findElement(By.xpath("//*[@id=\"bar-center\"]/div[1]/div/div[1]/table/tbody/tr[2]/td[3]")).getText().replace(",", ".");
        double Aval_Sale = Double.parseDouble(usdToUahSaleAval);
        // Oschadbank
        driver.get("http://www.oschadbank.ua/ua/");
        String usdToUahBuyOschadbank = driver.findElement(By.xpath("//*[@id=\"site-content\"]/section[2]/div/div/div/div[1]/div/div[1]/span[2]/strong[1]")).getText().replace(",", ".");
        double Oschadbank_Bay = Double.parseDouble(usdToUahBuyOschadbank);
        String usdToUahSaleOschadbank = driver.findElement(By.xpath("//*[@id=\"site-content\"]/section[2]/div/div/div/div[1]/div/div[1]/span[2]/strong[2]")).getText().replace(",", ".");
        double Oschadbank_Sale = Double.parseDouble(usdToUahSaleOschadbank);
        // NBU
        driver.get("http://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        String usdToUahBuyNBU = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div[4]/table[4]/tbody/tr[9]/td[5]")).getText();
        double NBU_Buy = Double.parseDouble(usdToUahBuyNBU) / 100;
        String usdToUahSaleNBU = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div[4]/table[4]/tbody/tr[9]/td[5]")).getText();
        double NBU_Sale = Double.parseDouble(usdToUahSaleNBU) / 100;

        double [] buyRates = {Privat_Buy, UkrSibBank_Buy, Aval_Buy, Oschadbank_Bay, NBU_Buy};
        double [] saleRates = {Privat_Sale, UkrSibBank_Sale, Aval_Sale, Oschadbank_Sale, NBU_Sale};
        double buyAvr = 0.00d;
        double saleAvr = 0.00d;
        for (int i = 0; i < buyRates.length; i++) {
            buyAvr = buyAvr + buyRates[i];
        }
        buyAvr = buyAvr / buyRates.length;
        for (int i = 0; i < saleRates.length; i++) {
            saleAvr = saleAvr + saleRates[i];
        }
        saleAvr = saleAvr / buyRates.length;
        double minBuy = buyRates[0];
        for (int i = 1; i < buyRates.length; i++) {
            if (buyRates[i] < minBuy) minBuy = buyRates[i];
        }
        double maxSale = saleRates[0];
        for (int i = 1; i < saleRates.length; i++) {
            if (saleRates[i] > maxSale) maxSale = saleRates[i];
        }

        System.out.println("The average rate for buying USD is: " + String.format("%.3f", buyAvr).replace("," , "."));
        System.out.println("The average rate for selling USD is: " + String.format("%.3f", saleAvr).replace("," , ".") + "\n" + "--------");
        System.out.println("Minimum BuyRate is: " + String.format("%.3f", minBuy).replace("," , "."));
        System.out.println("Maximum SaleRate is: " + String.format("%.3f", maxSale).replace("," , "."));
        Thread.sleep(3000);
        driver.quit();
    }
}