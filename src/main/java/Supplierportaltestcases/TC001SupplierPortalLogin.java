package Supplierportaltestcases;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DpOne;
import wrappers.ProjectWrappers;

public class TC001SupplierPortalLogin extends ProjectWrappers {
    @BeforeClass
    public void beforeClass(){
        testCaseName="TC001 Supplier Portal Login";
        testDescription="Reshma - To Validate login of supplier portal ";
        author="Reshma";
        category="Regression";
        browserName="chrome";
    }@Test(dataProvider="TC001SupplierPortalLogin",dataProviderClass= DpOne.class)
    public void tc001(String UserID,String Password){

        new SupplierLoginPage(driver, test)
                .enterUserName(UserID)
                .enterPassword(Password)
                .clickLoginButton();
}}
