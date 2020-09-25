package wrappers;

import org.testng.annotations.*;

public class ProjectWrappersAdminPortal extends GenericWrappersAdminPortal {


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
        invokeApp(browserName,urladmin);
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
