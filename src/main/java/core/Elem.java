package core;

import core.constants.WaitTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static core.MethodsFactory.driver;

public class Elem extends MethodsFactory{

    public Elem(By by, String name){
        this.by = by;
        this.name = name;
    }

    private By by;
    private String name = "";


    public void click(){
        driver().findElement(by).click();
    }

    public void type(String text){
        find().clear();
        find().sendKeys(text);
    }

    public WebElement find() {
        getWebDriverWait(WaitTime.DEFAULT_ELEMENT_WAIT).until(ExpectedConditions.presenceOfElementLocated(by));
        return driver().findElement(by);
    }

        public String getAttribute(String attributeName){
            return find().getAttribute(attributeName);
    }
    }



