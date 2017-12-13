package pageObjects;

import core.MethodsFactory;

public class MainPage extends MethodsFactory {


    public LoginForm loginForm = new LoginFormMain();

    public void open(){
        get("https://kismia.com");
    }
}
