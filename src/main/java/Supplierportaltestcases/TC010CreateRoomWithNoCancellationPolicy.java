package Supplierportaltestcases;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DpTen;
import wrappers.ProjectWrappers;

public class TC010CreateRoomWithNoCancellationPolicy extends ProjectWrappers {
    @BeforeClass
    public void beforeClass() {
        testCaseName = "TC010 Create Room With No Cancellation Policy";
        testDescription = "To create a new room type with no cancellation policy in supplier portal ";
        author = "Reshma";
        category = "Regression";
        browserName = "chrome";
    }

    @Test(dataProvider="TC010CreateRoomWithNoCancellationPolicy",dataProviderClass= DpTen.class)
    public void tc010(String userName,String passWord,
                      String roomName,String referenceCode,String roomCode,String rateCode
           ,String roomCapacity,String guestcount,String maxadult,String maxchildren) {

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
                .clickCancellationPolicyNoCancellation()
                .selectRoomCapacity(roomCapacity)
                .selectNoOfGuest(guestcount)
                .selectMaxAdult(maxadult)
                .selectMaxChildren(maxchildren)
                .clickSaveRoom();

    }
}