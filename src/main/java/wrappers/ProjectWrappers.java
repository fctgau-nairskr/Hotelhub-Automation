package wrappers;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utils.GetScreenshot;

import java.io.IOException;

public class ProjectWrappers extends GenericWrappers {


    public String browserName;


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("reported");
        startReport();
    }///Generic wrapper extends reporting

    @BeforeTest
    public void beforeTest()
    {
        loadObjects(); //reserved
    }


    @BeforeMethod
    public void beforeMethod(){
        startTest(testCaseName,testDescription );
        //invokeApp(browserName,"https://www.irctc.co.in");
       invokeApp(browserName,url);
    }

   @AfterMethod
    public void afterMethod(){

        //closeAllBrowsers();
    }

   @AfterClass
    public void afterClass(){ //before class is declared at test case level
        endTest();
    }

    @AfterTest
    public void afterTest(){
        unloadObjects();//reserved
    }


    @AfterSuite
    public void afterSuite(){
        endReport();
    }
}
