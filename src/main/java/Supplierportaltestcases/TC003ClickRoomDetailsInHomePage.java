package Supplierportaltestcases;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DpThree;
import utils.DpTwo;
import wrappers.ProjectWrappers;

public class TC003ClickRoomDetailsInHomePage extends ProjectWrappers {
    @BeforeClass
    public void beforeClass(){
        testCaseName="TC003 Click RoomDetails In HomePage";
        testDescription="To Validate room detail link s clicked in home page ";
        author="Reshma";
        category="Regression";
        browserName="chrome";
    }@Test(dataProvider="TC003ClickRoomDetailsInHomePage",dataProviderClass= DpThree.class)
    public void tc003(String UserID,String Password,String selectRoomType,
                      String enterRoomRate,String enterRoomAllocation,String enterExtraAdultRate,String enterExtraChildRate){

        new SupplierLoginPage(driver, test)
                .enterUserName(UserID)
                .enterPassword(Password)
                .clickLoginButton()
                .clickOnHomeTab()
                .selectRoomType(selectRoomType)
                .enterRoomRate(enterRoomRate)
                .enterRoomAllocation(enterRoomAllocation)
                .enterExtraAdultRate(enterExtraAdultRate)
                .enterExtraChild1Rate(enterExtraChildRate)
                .clickCheckinDate()
                .selectCheckinDate()
                .clickCheckoutDate()
                .selectCheckoutDate()
                .clickStopSellSelectedDate()
                .clickMaximumStay()
                .clickSaveChanges()
                .clickSaveChangesPopUpOk()
                .verifyTextDisplayed()
                .clickRoomDetailLink()
                .clickRoomTypeCancelButton();





    }}

