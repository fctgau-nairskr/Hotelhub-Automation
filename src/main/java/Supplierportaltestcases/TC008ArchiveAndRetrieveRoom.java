package Supplierportaltestcases;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DpEight;
import utils.DpSix;
import wrappers.ProjectWrappers;

public class TC008ArchiveAndRetrieveRoom extends ProjectWrappers {
    @BeforeClass
    public void beforeClass() {
        testCaseName = "TC008 Archive And Retrieve Room";
        testDescription = "To archive a room type and to retrieve room type";
        author = "Reshma";
        category = "Regression";
        browserName = "chrome";
    }

    @Test(dataProvider="TC008ArchiveAndRetrieveRoom",dataProviderClass= DpEight.class)
    public void tc008(String UserID,String Password) {

        new SupplierLoginPage(driver, test)
                .enterUserName(UserID)
                .enterPassword(Password)
                .clickLoginButton()
                .clickRoomTypeTab()
                .clickArchiveRoomType()
                .clickConfirmArchiveRoomType()
                .clickArchiveTab()
                .verifyArchiveRoomDisplayed()
                .clickArchieveRoomRetrieve()
                .clickConfirmArchieveRoomRetrieve();
    }
}