package Functionaljiraendtoendregression;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CancellationPolicies;
import utils.DpOne;
import wrappers.ProjectWrappers;

public class PBD10785CancellationPolicies extends ProjectWrappers {
    @BeforeClass
    public void beforeClass(){
        testCaseName="PBD10785CancellationPolicies";
        testDescription="To Validate ened to end functionality of cancellation policies ";
        author="Reshma";
        category="Regression";
        browserName="chrome";
    }@Test(dataProvider="PBD10785CancellationPolicies",dataProviderClass= CancellationPolicies.class)
    public void cancellationpolicies(String UserID,String Password,
                                     String roomName,String roomCode,String referenceCode,String rateCode
            ,String cancellationFeePercentage,String cancelDaysBeforeArrival,String cancellationFee,
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
                .clickCancellationPolicySamedayArrival()
                .enterCancellationFeePercentage(cancellationFeePercentage)
                .clickCancellationPolicyDaysBeforeArrival()
                .enterNoOfDaysBeforeArrival(cancelDaysBeforeArrival)
                .clickCancellationFee()
                .enterCancellationFee(cancellationFee)
                .clickCancellationPolicyNoCancellation()
                .selectRoomCapacity(roomCapacity)
                .selectNoOfGuest(noOfGuest)
                .selectMaxAdult(maxAdult)
                .selectMaxChildren(maxChildren)
                .clickSaveRoom();
    }}
