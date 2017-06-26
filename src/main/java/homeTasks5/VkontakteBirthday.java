package homeTasks5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class VkontakteBirthday {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://vk.com/");
        driver.findElement(By.xpath("//*[@id=\"index_email\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"index_email\"]")).sendKeys(""); // email
        driver.findElement(By.xpath("//*[@id=\"index_pass\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"index_pass\"]")).sendKeys(""); // password
        driver.findElement(By.xpath("//*[@id=\"index_login_button\"]")).click();
        Thread.sleep(5000);

        Random random = new Random();
        String [] phrases = {"с ДР!", "с Днюхой!", "с Днём Рождения!", "с днем рождения!"};
        String phraseDr = phrases[(random.nextInt(phrases.length))];

        driver.findElement(By.xpath("//*[@id=\"l_fr\"]/a/span/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui_rmenu_all\"]/span/span")).click();

        List<WebElement> recentB = driver.findElements(By.xpath("//*[contains(@class,'today')]"));
        if (recentB.contains("//*[@class=\"bd_user_cells\"]"))
        {
            driver.findElement(By.xpath("//*[@class=\"bd_user_cells_1 bd_user_cell_0\"]")).click();
            driver.findElement(By.xpath("//*[@class=\"flat_button profile_btn_cut_left\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"mail_box_editable\"]")).sendKeys("Привет, " + phraseDr);
            // send button click
        }
        else
        {
            System.out.println("No birthday today!");
        }

        driver.quit();
    }

}

/*
Написать программу которая будет заходить в вконтакте. Проверять есть ли у кого-то день рождения сегодня.
Если есть то:
Отправляете ему поздравление в виде - Привет, Имя_юзера! + рандомная фраза из списка заготовленных фраз.

То есть, вы должны:
1.	Создать список заготовленных фраз
2.	Создать метод для входа в вк
3.	Метод для проверки есть ли у кого-то день рождения сегодня
4.	Метод для отправки сообщения
*/