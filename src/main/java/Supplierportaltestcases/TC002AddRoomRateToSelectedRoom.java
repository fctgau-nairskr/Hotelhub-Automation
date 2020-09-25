package Supplierportaltestcases;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DpTwo;
import wrappers.ProjectWrappers;

public class TC002AddRoomRateToSelectedRoom extends ProjectWrappers {
    @BeforeClass
    public void beforeClass(){
        testCaseName="TC002 Add RoomRate To Selected Room";
        testDescription="To validate room rate is added for respective hotel room ";
        author="Reshma";
        category="Regression";
        browserName="chrome";
    }@Test(dataProvider="TC002AddRoomRateToSelectedRoom",dataProviderClass= DpTwo.class)
    public void tc002(String UserID,String Password,String selectRoomType,
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
                .clickSaveChangesPopUpOk();





    }}
