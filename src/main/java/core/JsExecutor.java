package core;

import org.openqa.selenium.JavascriptExecutor;
import static core.MethodsFactory.driver;

public class JsExecutor {

    private static JavascriptExecutor executor(){
        return (JavascriptExecutor) driver();
    }

    public static Object executeScript(String script, Object ... args){
        return executor().executeScript(script, args);
    }
}
