package Supplierportaltestcases;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DpSix;
import wrappers.ProjectWrappers;

public class TC006InventoryMapping extends ProjectWrappers {
    @BeforeClass
    public void beforeClass() {
        testCaseName = "TC006 InventoryMapping";
        testDescription = "To Validate child room is mapped and unmapped to parent room ";
        author = "Reshma";
        category = "Regression";
        browserName = "chrome";
    }

    @Test(dataProvider="TC006InventoryMapping",dataProviderClass= DpSix.class)
    public void tc006(String UserID,String Password,String Text
                      ) {

        new SupplierLoginPage(driver, test)
                .enterUserName(UserID)
                .enterPassword(Password)
                .clickLoginButton()
                .clickInventoryMappingTab()
                .verifyRoomInInventoryNoMapping()
                .clickMapAvailabityLink()
                .selectRoomToMap(Text)
                .clickSaveMapping()
                .clickMappingUpdate()
                .clickMappingUpdateCancel()
                .clickUnmapRoom();
    }
}