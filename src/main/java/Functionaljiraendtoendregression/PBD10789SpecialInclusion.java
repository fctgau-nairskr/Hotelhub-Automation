package Functionaljiraendtoendregression;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CancellationPolicies;
import utils.SpecialInclusion;
import wrappers.ProjectWrappers;

public class PBD10789SpecialInclusion extends ProjectWrappers {
    @BeforeClass
    public void beforeClass(){
        testCaseName="PBD10789SpecialInclusion";
        testDescription="To Validate ened to end functionality of special inclusion ";
        author="Reshma";
        category="Regression";
        browserName="chrome";
    }@Test(dataProvider="PBD10789SpecialInclusion",dataProviderClass= SpecialInclusion.class)
    public void SpecialInclusion(String UserID,String Password,String getPropertyName,String enterInclusion,
                                    String getPropertyReservationName,String getPropertyReservationPhone,String getPropertyReservationEmail,String roomName,String referenceCode,String roomCode,String rateCode,String enterRoomInclusion
            ,String daysBeforeArrival,String roomCapacity ){

        new SupplierLoginPage(driver, test)
                .enterUserName(UserID)
                .enterPassword(Password)
                .clickLoginButton()
                .clickPropertyTab()
                .getPropertyId()
                .getPropertyName(getPropertyName)
                .clickPropertySpecials()
                .enterPropertyInclusions(enterInclusion)
                .getPropertyInclusions()
                .clickPropertyContact()
                .getPropertyReservationName(getPropertyReservationName)
                .getPropertyReservationPhone(getPropertyReservationPhone)
                .getPropertyReservationEmail(getPropertyReservationEmail)
                .clickPropertySaveChangesTab()
                .clickPropertySaveChangesNow()
                .acceptPropertySaveChanges()
                .clickRoomTypeTab()
                .clickCreateNewRoomType()
                .enterNewRoomName(roomName)
                .enterInternalReferenceCode(roomCode)
                .enterRoomCode(referenceCode)
                .enterRateCode(rateCode)
                .enterRoomInclusion(enterRoomInclusion)
                .clickCancellationPolicyDaysBeforeArrival()
                .enterNoOfDaysBeforeArrival(daysBeforeArrival)
                .selectRoomCapacity(roomCapacity)
                .clickSaveRoom();

    }}
