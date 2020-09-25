package Supplierportaltestcases;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DpEleven;
import utils.DpSeven;
import wrappers.ProjectWrappers;

public class TC011CreateRoomWithCancellationPolicySameDayOfArrival extends ProjectWrappers {
    @BeforeClass
    public void beforeClass() {
        testCaseName = "TC011 Create Room With Cancellation Policy as SameDayOfArrival";
        testDescription = "To create a new room type with Cancellation Policy as cancel on SameDayOfArrival ";
        author = "Reshma";
        category = "Regression";
        browserName = "chrome";
    }

    @Test(dataProvider="TC011CreateRoomWithCancellationPolicySameDayOfArrival",dataProviderClass= DpEleven.class)
    public void tc011(String userName,String passWord,
                      String roomName,String referenceCode,String roomCode,String rateCode
            ,String cancellationFee,String roomCapacity) {

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
                .clickCancellationPolicySamedayArrival()
                .clickCancellationFee()
                .enterCancellationFee(cancellationFee)
                .selectRoomCapacity(roomCapacity)
                .clickSaveRoom();

    }
}
