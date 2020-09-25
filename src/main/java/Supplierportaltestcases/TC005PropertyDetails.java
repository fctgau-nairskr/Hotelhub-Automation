package Supplierportaltestcases;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DpFive;
import utils.DpFour;
import wrappers.ProjectWrappers;

public class TC005PropertyDetails extends ProjectWrappers {
    @BeforeClass
    public void beforeClass(){
        testCaseName="TC005 Property Details";
        testDescription="To Validate hotel property of supplier portal ";
        author="Reshma";
        category="Regression";
        browserName="chrome";
    }@Test(dataProvider="TC005PropertyDetails",dataProviderClass= DpFive.class)
    public void tc005(String UserID,String Password,
                      String getPropertyName,
                      String getPropertyReservationName,
                      String getPropertyReservationPhone,
                      String getPropertyReservationEmail ) {

        new SupplierLoginPage(driver, test)
                .enterUserName(UserID)
                .enterPassword(Password)
                .clickLoginButton()
                .clickPropertyTab()
                .getPropertyId()
                .getPropertyName(getPropertyName)
                .clickPropertySpecials()
                .getPropertyInclusions()
                .clickPropertyContact()
                .getPropertyReservationName(getPropertyReservationName)
                .getPropertyReservationPhone(getPropertyReservationPhone)
                .getPropertyReservationEmail(getPropertyReservationEmail);
    }}