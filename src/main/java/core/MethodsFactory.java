package core;

import core.constants.WaitTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MethodsFactory{

    protected static WebDriver driver;

    public static WebDriver driver(){
        return driver;
    }

    protected WebDriverWait getWebDriverWait(long timeout){
        return new WebDriverWait(driver(), timeout);
    }

    public void get (String url){
        driver.get(url);
        getWebDriverWait(WaitTime.DEFAULT_ELEMENT_WAIT).until(CustomConditions.pageLoaded());
    }

}



