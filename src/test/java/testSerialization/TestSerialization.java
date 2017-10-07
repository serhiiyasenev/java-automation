package testSerialization;


import dataLoader.FailedTestInfoLoader;
import dataLoader.FailedTestInfo;

public class TestSerialization {

    public static void main (String [] args) {

        FailedTestInfo failedTestinfo = new FailedTestInfo();
        failedTestinfo.suiteName = "Suite1";
        failedTestinfo.testName = "Test1";
        failedTestinfo.testMethodName = "TestMethod1";
        failedTestinfo.errorMsg = "ErrorMsg1";

        FailedTestInfoLoader.serializeStorage(failedTestinfo, "JACK1");

    }
}
