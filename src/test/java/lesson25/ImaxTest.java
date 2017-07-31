package lesson25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
/*
Открыть https://planetakino.ua/showtimes/
Выбрать технологию “IMAX”
Найти последний сеанс на сегодня
Перейти в “выбор мест”
Получить кол-во всех мест в зале и занятых мест
Посчитать % занятых мест от всех мест в зале.
Сделать Assert (проверку) на этот показатель, если занятых мест меньше 50% - тест должен упасть
----------------------
Написать тест - создать testng.xml - создать job в дженкинсе с Аллюр отчетом результатов выполнения этого теста.
----------------------
Написать тест который заходит на сайт imax, делает скриншот расписания фильмов на сегодня
сеансы (IMAX 3D) и присылает скриншот и список сеансов (ФИЛЬМ и ВРЕМЯ) на почту.
 */

public class ImaxTest {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://liniakino.com/showtimes/aladdin/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Форсаж 8']")).click();
        driver.findElement(By.xpath("//*[@value=\"Сеанси / Купити online / Забронювати\"]")).click();

        int i = driver.findElements(By.xpath("//*[@class=\"day-block showtime-day\"]")).size();
        String [] list = new String[i];
        for (int a=0; a < i; a++) {
            list[a] = driver.findElements(By.xpath("//*[@class=\"day-block showtime-day\"]")).get(a).getText();
        }
        // вывод дат
        for (String enableDates:list)
        {
        int ii = enableDates.indexOf("\n");
        System.out.println(enableDates.substring(0, ii));
        }
        System.out.print("------------" + "\n" + "Input your date from 1 to " + i + "\n");
        // вывод времени за выбраную дату
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toString();
        int d = new Integer(s);
        System.out.println(list[d-1].substring(9));
        // выбираем сеанс
        System.out.print("Input your time." + "\n");

        driver.quit();
        }
    }