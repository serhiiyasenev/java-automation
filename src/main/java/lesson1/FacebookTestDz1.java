package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class FacebookTestDz1 {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@automation.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("9379992");
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.quit();
    }

}

/*
Открыть браузер
Открыть https://www.facebook.com/
Ввести логин(емейл) в поле для ввода логина
Ввести пароль в поле для ввода пароля
Нажать кнопку “Вход”
Получить заголовок страницы
Закрыть браузер
*/