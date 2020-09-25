package Adminportaltestcases;

import Adminportalpages.AdminLoginPage;
import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrappers.ProjectWrappersAdminPortal;

public class TC001AdminPortalLogin extends ProjectWrappersAdminPortal {
    @BeforeClass
    public void beforeClass(){
        testCaseName="TC001 Admin Portal Login";
        testDescription="To Validate login of admin portal ";
        author="Reshma";
        category="Regression";
        browserName="chrome";
    }@Test
    public void tc001(){

        new AdminLoginPage(driver, test)
                .enterUserName("tcstester")
                .enterPassword("Tcstester1")
                .clickLoginButton();
    }}
