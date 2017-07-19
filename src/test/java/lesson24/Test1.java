package lesson24;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

public class Test1 {

    @Test
    public void myFirstTest(){
        sendEmail();
        login();
        sendEmail();
        login();
    }

    @Test
    public void mySecondTest(){
        login();
    }

    @Step
    public void sendEmail(){
    }

    @Step("Вход на сайт")
    public void login(){
        typeUserName("Jack");
    }

    public void typeUserName(String name){
        System.out.println(name);
    }
}
