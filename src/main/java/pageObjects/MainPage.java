package pageObjects;

import core.MethodsFactory;

public class MainPage extends MethodsFactory {


    public ILoginForm loginForm = new LoginFormMain();

    public void open(){
        get("https://kismia.com");
    }
}
