package pageObjects;

import core.Elem;
import org.openqa.selenium.By;


public class LoginFormMain extends ILoginForm{
    @Override
    protected void typeLogin(String login) {
        emailField.type(login);

    }

    @Override
    protected void typePassword(String password) {
            passwordField.type(password);
    }

    @Override
    protected void clickSubmit() {
        loginButton.click();

    }

    private Elem emailField = new Elem(By.cssSelector("#user-email"), "Email Field");
    private Elem passwordField = new Elem(By.cssSelector("#user-password"), "Password Field");
    private Elem loginButton = new Elem(By.cssSelector("#sign-in-form .submit"), "Login Button");


}
