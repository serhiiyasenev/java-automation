package dataLoader;

import java.io.Serializable;

public class FailedTestInfo implements Serializable{

    public transient String suiteName;
    public String testName;
    public String testMethodName;
    public String errorMsg;
}
