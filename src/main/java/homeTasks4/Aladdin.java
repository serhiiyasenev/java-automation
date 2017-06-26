package homeTasks4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
1. Открыть сайт http://liniakino.com/showtimes/aladdin/
2. Открыть фильм «Форсаж 8»
3. Отобразить в консоль доступные варианты даты показа фильма
4. После выбора даты - отобразить доступные сеансы (время за выбранную дату) на фильм «Форсаж 8»
5. После выбора сеанса - Вывести в консоль список занятых и свободных мест. (в любом удобном для вас виде)
 */

public class Aladdin {

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