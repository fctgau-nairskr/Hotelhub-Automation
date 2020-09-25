package Supplierportaltestcases;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DpEight;
import utils.DpNine;
import wrappers.ProjectWrappers;

public class TC009SupplierPortalEndToEndTestcase extends ProjectWrappers {
    @BeforeClass
    public void beforeClass() {
        testCaseName = "TC009 SupplierPortal End To End Testcase";
        testDescription = "To Validate end to end flow of hotel hub supplier portal ";
        author = "Reshma";
        category = "Regression";
        browserName = "chrome";
    }

    @Test(dataProvider="TC009SupplierPortalEndToEndTestcase",dataProviderClass= DpNine.class)
    public void tc007(String UserID,String Password,
                      String PropertyName,String PropertyReservationName,String PropertyReservationPhone
    ,String PropertyReservationEmail,String NewRoomName,
                      String InternalReferenceCode,
                      String RoomCode,String RateCode,
                      String DaysBeforeArrival,String RoomCapacity,String BookingStatus,String RoomToMap ) {

        new SupplierLoginPage(driver, test)
                .enterUserName(UserID)
                .enterPassword(Password)
                .clickLoginButton()
                .clickPropertyTab()
                .getPropertyId()
                .getPropertyName(PropertyName)
                .clickPropertySpecials()
                .getPropertyInclusions()
                .clickPropertyContact()
                .getPropertyReservationName(PropertyReservationName)
                .getPropertyReservationPhone(PropertyReservationPhone)
                .getPropertyReservationEmail(PropertyReservationEmail)
                .clickRoomTypeTab()
                .clickCreateNewRoomType()
                .enterNewRoomName(NewRoomName)
                .enterInternalReferenceCode(InternalReferenceCode)
                .enterRoomCode(RoomCode)
                .enterRateCode(RateCode)
                .clickCancellationPolicyDaysBeforeArrival()
                .enterNoOfDaysBeforeArrival(DaysBeforeArrival)
                .selectRoomCapacity(RoomCapacity)
                .clickSaveRoom()
                .clickEditRoomType()
                .clickRoomTypeCancelButton()
                .clickArchiveRoomType()
                .clickConfirmArchiveRoomType()
                .clickArchiveTab()
                .verifyArchiveRoomDisplayed()
                .clickArchieveRoomRetrieve()
                .clickConfirmArchieveRoomRetrieve()
                .clickBookingTab()
                .clickInventoryMappingTab()
                .verifyRoomInInventoryNoMapping()
                .clickMapAvailabityLink()
                .selectRoomToMap(RoomToMap)
                .clickSaveMapping()
                .clickMappingUpdate()
                .clickMappingUpdateCancel()
                .clickUnmapRoom()
                .clickLogout();
    }
}
