package Functionaljiraendtoendregression;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CancellationPolicies;
import utils.StayPays;
import wrappers.ProjectWrappers;

public class PBD10791StayPays extends ProjectWrappers {
    @BeforeClass
    public void beforeClass(){
        testCaseName="PBD10791StayPays";
        testDescription="To Validate ened to end functionality of stay pays ";
        author="Reshma";
        category="Regression";
        browserName="chrome";
    }@Test(dataProvider="PBD10791StayPays",dataProviderClass= StayPays.class)
    public void StayPays(String UserID,String Password,
                                     String roomName,String roomCode,String referenceCode,String rateCode
            ,String stayNight,String payNight,String maxFreeNight,
                                     String roomCapacity,String noOfGuest,String maxAdult,String maxChildren){

        new SupplierLoginPage(driver, test)
                .enterUserName(UserID)
                .enterPassword(Password)
                .clickLoginButton()
                .clickRoomTypeTab()
                .clickCreateNewRoomType()
                .enterNewRoomName(roomName)
                .enterInternalReferenceCode(referenceCode)
                .enterRoomCode(roomCode)
                .enterRateCode(rateCode)
                .enterStayNight(stayNight)
                .enterPayNight(payNight)
                .enterMaxFreeNight(maxFreeNight)
                .clickLastNightlyStayRadio()
                .clickCancellationPolicySamedayArrival()
                .clickCancellationPolicyNoCancellation()
                .selectRoomCapacity(roomCapacity)
                .selectNoOfGuest(noOfGuest)
                .selectMaxAdult(maxAdult)
                .selectMaxChildren(maxChildren)
                .clickSaveRoom();
    }}
