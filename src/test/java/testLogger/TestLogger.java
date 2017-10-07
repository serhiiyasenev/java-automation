package testLogger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class TestLogger {
    private Logger logger = LoggerFactory.getLogger("Driver");

    @Test
    public void testlog(){
        logger.info("Jack!");

    }

}
