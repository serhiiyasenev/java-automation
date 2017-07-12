package lesson20;

import imap.ImapClient;
import imap.With;
import org.apache.commons.mail.EmailException;
import org.testng.annotations.Test;
import javax.mail.Message;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

public class TestSendEmail {
   private WorkWithTextInMessages workWithTextInMessages = new WorkWithTextInMessages();
    @Test
    public void testSendEmail() throws EmailException, InterruptedException, MessagingException, IOException {
        ImapClient imapClient = new ImapClient("serhii.yasenev@gmail.com", "----------------");
        imapClient.connect();
        List<Message> messages = imapClient.findMessages(With.from("serhii.yasenev@gmail.com"));
        for (Message message: messages){
            System.out.println(message.getSubject());
            System.out.println(workWithTextInMessages.getTextFromMessage(message));
        }
    }
}