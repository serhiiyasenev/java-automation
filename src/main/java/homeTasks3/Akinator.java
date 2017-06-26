package homeTasks3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Akinator {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://ru.akinator.com/personnages/");
        Thread.sleep(3000);
        System.out.println("Please, input your age: from 0 to 99. And press Enter than.");
        Scanner scanner = new Scanner(System.in); // Объявляем сканнер
        String s = scanner.nextLine().toString(); // получем введенную линию в String
        int d = new Integer(s); // переводим в int

        driver.findElement(By.xpath("//*[@id=\"elokence_sitebundle_identification_age\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"elokence_sitebundle_identification_age\"]")).sendKeys(String.valueOf(d));
        driver.findElement(By.xpath("//*[@id=\"infos-area-footer\"]/input")).click();
        Thread.sleep(3000);

            while (driver.findElements(By.xpath("//*[@id=\"infos-perso-title\"]/p")).size()==0)
            {
                System.out.println("Please, input your answer: from 1 to 5. And press Enter than.");
                s = scanner.nextLine().toString();
                d = new Integer(s);
                switch (d) {
                    case 1:
                        driver.findElement(By.xpath("//*[@id=\"reponse1\"]")).click();
                        break;
                    case 2:
                        driver.findElement(By.xpath("//*[@id=\"reponse2\"]")).click();
                        break;
                    case 3:
                        driver.findElement(By.xpath("//*[@id=\"reponse3\"]")).click();
                        break;
                    case 4:
                        driver.findElement(By.xpath("//*[@id=\"reponse4\"]")).click();
                        break;
                    case 5:
                        driver.findElement(By.xpath("//*[@id=\"reponse5\"]")).click();
                        break;
                    default:
                        System.out.println("Please, input a CORRECT number: from 1 to 5, and press Enter than.");
                        break;
                }
            }
            String correctName = "Майкл Джексон";
            if (driver.findElement(By.xpath("//*[@id=\"perso\"]")).getText().equals(correctName))
            {
                driver.findElement(By.xpath("//*[@id=\"yesLink\"]")).click();
            }
            else
            {
                driver.findElement(By.xpath("//*[@id=\"noLink\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"noLink\"]")).click();
                driver.get("http://ru.akinator.com/personnages/");
            }
        driver.quit();
    }
}