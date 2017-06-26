package lesson16;

import core.BrowserFactory;
import org.testng.annotations.Test;
import pageObjects.MainPage;


public class TestLogin extends BrowserFactory {

@Test
public void tryLogin() throws InterruptedException {
    MainPage mainPage = new MainPage();
    mainPage.open();
    mainPage.loginForm.login("loliktest1@mail.ru", "qwe1rty2");
}
}
