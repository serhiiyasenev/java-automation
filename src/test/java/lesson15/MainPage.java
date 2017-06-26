package lesson15;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;


public class MainPage extends MethodsFactory{

    Elem emeilField = new Elem(By.cssSelector(""), "EAIL FIELD");
    Elem passField = new Elem(By.cssSelector(""), "PASS FIELD");

    public void login(){
        emeilField.click();
        passField.click();
    }
}
