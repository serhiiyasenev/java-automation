package lesson22;

import core.BrowserFactory;
import imap.ImapClient;
import imap.With;
import lesson20.WorkWithTextInMessages;
import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import javax.mail.Message;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;
import java.util.Random;
/*
Написать тест на регистрацию kismia.com и активацию
аккаунта из почты (Перейти по ссылке полученого письма).
 */
public class TestKismiaPostRegistration extends BrowserFactory{
   private WorkWithTextInMessages workWithTextInMessages = new WorkWithTextInMessages();
   private static String myEmail = "serhii.yasenev@gmail.com";
   private static String myPostPassword = ".................";
   private static String kismiaEmail = "serhii.yasenev@gmail.com";

    @Test
    public void testFromKismiaEmail() throws EmailException, InterruptedException, MessagingException, IOException {

        driver().manage().window().maximize();
        get("https://kismia.com");
        driver.findElement(By.cssSelector("#form-registration")).click();
        driver.findElement(By.xpath("//*[@id=\"block-first\"]/div[1]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"block-first\"]/div[2]/div[2]/label")).click();
        Random random = new Random();
        String nameAndPass = "Test1.Kismia.Reg " + String.valueOf(random.nextInt(10)) ;
        driver.findElement(By.xpath("//*[@id=\"user-reg-myname\"]")).sendKeys(nameAndPass);
        driver.findElement(By.xpath("//*[@id=\"block-first\"]/button")).click();
        driver.findElement(By.id("user-reg-myemail")).sendKeys(myEmail);
        driver.findElement(By.id("user-reg-mypass")).sendKeys(nameAndPass);


        ImapClient imapClient = new ImapClient(myEmail, myPostPassword);
        imapClient.connect();

        List<Message> messages = imapClient.findMessages(With.from(kismiaEmail));


        for (Message message: messages){
            System.out.println(message.getSubject());
            System.out.println(workWithTextInMessages.getTextFromMessage(message));
        }
    }
}