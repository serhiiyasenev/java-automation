package lesson15;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ExampleMultiplyParams {

    List<String> recipientsList = new ArrayList<>();

    public void setRecipients(String ... recipients){
        for (String recipient : recipients) {
            recipientsList.add(recipient);
        }
    }

    @Test
    public void testMultiply(){
        setRecipients("JACK", "SPARROW", "SSSS");
        setRecipients("DDDD");

        recipientsList.forEach(s -> System.out.println(s));
    }
}
