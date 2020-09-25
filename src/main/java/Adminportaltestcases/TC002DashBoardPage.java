package Adminportaltestcases;

import Adminportalpages.AdminLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import wrappers.ProjectWrappersAdminPortal;

public class TC002DashBoardPage extends ProjectWrappersAdminPortal {
    @BeforeClass
    public void beforeClass(){
        testCaseName="TC001 Admin Portal Login";
        testDescription="To Validate login of admin portal ";
        author="Reshma";
        category="Regression";
        browserName="chrome";
    }@Test
    public void tc001(){

        new AdminLoginPage(driver, test)
                .enterUserName("tcstester")
                .enterPassword("Tcstester1")
                .clickLoginButton()
                .clickDashboard()
                .clickBookingViewDetails()
                .selectBookingStatus("Confirmed")
                .clickBookingStartDate()
                .selectBookingStartDate()
                .clickBookingEndDate()
                .selectBookingEndDate()
                .clickSearchButton()
                .clickManageButton()
                .clickRoomDetails()
                .clickGuestsDetails()
                .clickComments()
                .commentPageDown()
                .clickResendNotificationEmail()
                .getEmailId("value")
                .clickResendEmail()
                .acceptSendEmail()
                .clickAdditionalDetails()
                .clickDashboard()
                .clickPropertyRegistrationViewDetails()
                .selectCountry("Australia")
                .selectChannelManager("tcs test cm")
                .clickPropertySearch()
                .clickPropertyAction()
                .propertySearchPageDown()
                .propertySearchPageDown()
                .propertySearchPageDown()
                .clickManageProperty()
                .clickPropertySetup()
                .clickPropertyRoomDetails()
                .clickPropertySupplierConnectivity()
                .clickPropertyCommentHistory()
                .clickPropertyHistory()
                .clickPropertyActionLogs()
                .clickPropertyActionLogsFromDate()
                .clickActionLogsFromDate()
                .clickPropertyActionLogsToDate()
                .clickActionLogsToDate()
                .clickActionLogsSearch()
                .clickActionLogsExcelCheckbox()
                .clickActionLogsGetLogs()
                .clickPropertyLoginLogs()
                .clickPropertyLoginLogsFromDate()
                .clickLoginLogsFromDate()
                .clickPropertyLoginLogsToDate()
                .clickLoginLogsToDate()
                .clickLoginLogsExcelCheckbox()
                .clickLoginLogsGetLogs()
                .clickPropertyPopupClose();


    }}