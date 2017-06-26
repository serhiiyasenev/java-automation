package lesson15;


import core.BrowserFactory;
import org.testng.annotations.Test;

public class TestBrowserFactory extends BrowserFactory{
    @Test
    public void testLallal(){
        get("https://google.com");
    }
    }

