package Supplierportaltestcases;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DpFour;
import wrappers.ProjectWrappers;

public class TC004GetBookingDetails extends ProjectWrappers {
    @BeforeClass
    public void beforeClass() {
        testCaseName = "TC004 Get BookingDetails";
        testDescription = "To Validate booking number is retrieved";
        author = "Reshma";
        category = "Regression";
        browserName = "chrome";
    }

    @Test(dataProvider="TC004GetBookingDetails",dataProviderClass= DpFour.class)
    public void tc004(String UserID,String Password,String BookingStatus) {

        new SupplierLoginPage(driver, test)
                .enterUserName(UserID)
                .enterPassword(Password)
                .clickLoginButton()
                .clickBookingTab()
                .selectBookingStatus(BookingStatus)
                .clickDisplayBookings()
                .printBookingNumber()
                .clickBookings();
    }
}
