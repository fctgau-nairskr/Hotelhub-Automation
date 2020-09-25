package Supplierportaltestcases;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DpEight;
import utils.DpSeven;
import wrappers.ProjectWrappers;

public class TC007CreateRoomType extends ProjectWrappers {
    @BeforeClass
    public void beforeClass() {
        testCaseName = "TC007CreateRoomType";
        testDescription = "To create a new room type";
        author = "Reshma";
        category = "Regression";
        browserName = "chrome";
    }

    @Test(dataProvider="TC007CreateRoomType",dataProviderClass= DpSeven.class)
    public void tc007(String userName,String passWord,
                      String roomName,String referenceCode,String roomCode,String rateCode
    ,String daysBeforeArrival,String roomCapacity) {

        new SupplierLoginPage(driver, test)
                .enterUserName(userName)
                .enterPassword(passWord)
                .clickLoginButton()
                .clickRoomTypeTab()
                .clickCreateNewRoomType()
                .enterNewRoomName(roomName)
                .enterInternalReferenceCode(roomCode)
                .enterRoomCode(referenceCode)
                .enterRateCode(rateCode)
                .clickCancellationPolicyDaysBeforeArrival()
                .enterNoOfDaysBeforeArrival(daysBeforeArrival)
                .selectRoomCapacity(roomCapacity)
                .clickSaveRoom();


    }
}