package Functionaljiraendtoendregression;

import Supplierportalpages.SupplierLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.CancellationPolicies;
import utils.ServiceJira;
import wrappers.ProjectWrappers;

public class PBD10790ServiceJira extends ProjectWrappers {
    @BeforeClass
    public void beforeClass(){
        testCaseName="PBD10790ServiceJira";
        testDescription="To Validate end to end functionality of service policies ";
        author="Reshma";
        category="Regression";
        browserName="chrome";
    }@Test(dataProvider="PBD10790ServiceJira",dataProviderClass= ServiceJira.class)
    public void serviceJira(String UserID,String Password,
                                     String roomName,String roomCode,String referenceCode,String rateCode,
                                 String roomCapacity){

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
                .selectRoomCapacity(roomCapacity)
                 .clickSaveRoom();
    }}
