package Functionaljiraendtoendregression;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ChildAgeRestriction;
import wrappers.ProjectWrappers;

public class PBD10788ChildAgeRestriction extends ProjectWrappers {
    @BeforeClass
    public void beforeClass(){
        testCaseName="PBD10788ChildAgeRestriction";
        testDescription="To Validate end to end functionality of childage restriction ";
        author="Reshma";
        category="Regression";
        browserName="chrome";
    }@Test(dataProvider="PBD10788ChildAgeRestriction",dataProviderClass=ChildAgeRestriction.class)
    public void childAgeRestriction(String UserID,String Password,String getPropertyName,String selectPropertyAccepts,String maxInfantAge,String maxChild1Age,String maxChild2Age,
                                 String getPropertyReservationName,
                                    String getPropertyReservationPhone,String getPropertyReservationEmail,
                                    String roomAccepts,String infantMaxAge,String child1MaxAge,String child2maxage
            ,String roomCapacity,String selectRoomType,
                                    String enterRoomRate,String enterRoomAllocation,String enterExtraAdultRate,String enterExtraChild1Rate,String enterExtraChild2Rate ){

        new SupplierLoginPage(driver, test)
                .enterUserName(UserID)
                .enterPassword(Password)
                .clickLoginButton()
                .clickPropertyTab()
                .getPropertyId()
                .getPropertyName(getPropertyName)
                .selectPropertyAccepts(selectPropertyAccepts)
                .clickPropertyAddChild2()
                .selectPropertyMaxInfantAge(maxInfantAge)
                .selectPropertyMaxChild1Age(maxChild1Age)
                .selectPropertyMaxChild2Age(maxChild2Age)
                .clickPropertySpecials()
                .clickPropertyContact()
                .getPropertyReservationName(getPropertyReservationName)
                .getPropertyReservationPhone(getPropertyReservationPhone)
                .getPropertyReservationEmail(getPropertyReservationEmail)
                .clickPropertySaveChangesTab()
                .clickPropertySaveChangesNow()
                .acceptPropertySaveChanges()
                .clickRoomTypeTab()
                .clickEditRoomType()
                .roomPageScrollDown()
                .clickRoomGuestPolicy()
                .selectRoomAccepts(roomAccepts)
                .selectInfantMaxAge(infantMaxAge)
                .selectChild1MaxAge(child1MaxAge)
                .selectChild2MaxAge(child2maxage)
                .clickCancellationPolicyNoCancellation()
                .selectRoomCapacity(roomCapacity)
                .clickSaveRoom()
                .clickAcceptEditRoomTypeAlert()
                .clickOnHomeTab()
                .selectRoomType(selectRoomType)
                .enterRoomRate(enterRoomRate)
                .enterRoomAllocation(enterRoomAllocation)
                .enterExtraAdultRate(enterExtraAdultRate)
                .enterExtraChild1Rate(enterExtraChild1Rate)
                .enterExtraChild2Rate(enterExtraChild2Rate)
                .clickCheckinDate()
                .selectCheckinDate()
                .clickCheckoutDate()
                .selectCheckoutDate()
                .clickStopSellSelectedDate()
                .clickExtraChil2dRate()
                .clickSaveChanges()
                .clickSaveChangesPopUpOk();

    }}

