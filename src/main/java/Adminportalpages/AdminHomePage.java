package Adminportalpages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import wrappers.GenericWrappersAdminPortal;

public class AdminHomePage extends GenericWrappersAdminPortal {
    public AdminHomePage(RemoteWebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    public AdminHomePage clickDashboard() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickDashboard"));
        return this;

    }

    public AdminHomePage clickBookingViewDetails() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickBookingViewDetails"));
        return this;

    }

    public AdminHomePage selectBookingStatus(String bookingstatus) {
        selectVisibleTextByXpath(objprop.getProperty("AdminHomePage.selectBookingStatus"), bookingstatus);
        return this;

    }

    public AdminHomePage clickSearchButton() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickSearchButton"));
        return this;

    }

    public AdminHomePage clickBookingStartDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickBookingStartDate"));
        return this;

    }

    public AdminHomePage selectBookingStartDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.selectBookingStartDate"));
        return this;

    }

    public AdminHomePage clickBookingEndDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickBookingEndDate"));
        return this;

    }

    public AdminHomePage selectBookingEndDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.selectBookingEndDate"));
        return this;

    }

    public AdminHomePage clickManageButton() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickManageButton"));
        return this;

    }

    public AdminHomePage clickRoomDetails() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickRoomDetails"));
        return this;

    }

    public AdminHomePage clickGuestsDetails() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickGuestsDetails"));
        return this;

    }

    public AdminHomePage clickComments() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickComments"));
        return this;

    }

    public AdminHomePage clickViewEmail() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickViewEmail"));
        return this;

    }

    public AdminHomePage closeViewEmail() {
        clickByXpath(objprop.getProperty("AdminHomePage.closeViewEmail"));
        return this;

    }

    public AdminHomePage commentPageDown() {
        keysPageDownByXpath(objprop.getProperty("AdminHomePage.commentPageDown"));
        return this;

    }

    public AdminHomePage clickResendNotificationEmail() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickResendNotificationEmail"));
        return this;

    }

    public AdminHomePage getEmailId(String value) {
        getAttributeById(objprop.getProperty("AdminHomePage.getEmailId"), value);
        return this;

    }

    public AdminHomePage clickResendEmail() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickResendEmail"));
        return this;

    }

    public AdminHomePage acceptSendEmail() {
        clickByXpath(objprop.getProperty("AdminHomePage.acceptSendEmail"));
        return this;

    }

    public AdminHomePage clickAdditionalDetails() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickAdditionalDetails"));
        return this;

    }

    public AdminHomePage clickPropertyRegistrationViewDetails() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyRegistrationViewDetails"));
        return this;

    }

    public AdminHomePage selectCountry(String country) {
        selectVisibleTextByXpath(objprop.getProperty("AdminHomePage.selectCountry"), country);
        return this;

    }

    public AdminHomePage selectChannelManager(String channelmanager) {
        selectVisibleTextByXpath(objprop.getProperty("AdminHomePage.selectChannelManager"), channelmanager);
        return this;

    }

    public AdminHomePage clickPropertySearch() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertySearch"));
        return this;

    }

    public AdminHomePage propertySearchPageDown() {
        keysPageDownByXpath(objprop.getProperty("AdminHomePage.propertySearchPageDown"));
        return this;

    }

    public AdminHomePage clickPropertyAction() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyAction"));
        return this;

    }

    public AdminHomePage clickManageProperty() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickManageProperty"));
        return this;

    }

    public AdminHomePage clickPropertySetup() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertySetup"));
        return this;

    }

    public AdminHomePage clickPropertyRoomDetails() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyRoomDetails"));
        return this;

    }

    public AdminHomePage clickPropertySupplierConnectivity() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertySupplierConnectivity"));
        return this;

    }

    public AdminHomePage clickPropertyCommentHistory() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyCommentHistory"));
        return this;

    }

    public AdminHomePage clickPropertyHistory() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyHistory"));
        return this;

    }

    public AdminHomePage clickPropertyActionLogs() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyActionLogs"));
        return this;

    }

    public AdminHomePage clickPropertyActionLogsFromDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyActionLogsFromDate"));
        return this;

    }

    public AdminHomePage clickPropertyActionLogsToDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyActionLogsToDate"));
        return this;

    }

    public AdminHomePage clickActionLogsFromDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickActionLogsFromDate"));
        return this;

    }

    public AdminHomePage clickActionLogsToDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickActionLogsToDate"));
        return this;

    }
    public AdminHomePage clickActionLogsSearch() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickActionLogsSearch"));
        return this;

    }

    public AdminHomePage clickActionLogsExcelCheckbox() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickActionLogsExcelCheckbox"));
        return this;

    }

    public AdminHomePage clickActionLogsGetLogs() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickActionLogsGetLogs"));
        return this;

    }

    public AdminHomePage clickPropertyLoginLogs() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyLoginLogs"));
        return this;
    }

    public AdminHomePage clickPropertyLoginLogsToDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyLoginLogsToDate"));
        return this;
    }
    public AdminHomePage clickPropertyLoginLogsFromDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyLoginLogsFromDate"));
        return this;
    }
    public AdminHomePage clickLoginLogsFromDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickLoginLogsFromDate"));
        return this;
    }
    public AdminHomePage clickLoginLogsToDate() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickLoginLogsToDate"));
        return this;
    }
    public AdminHomePage clickLoginLogsExcelCheckbox() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickLoginLogsExcelCheckbox"));
        return this;
    }
    public AdminHomePage clickLoginLogsGetLogs() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickLoginLogsGetLogs"));
        return this;
    }
    public AdminHomePage clickPropertyPopupClose() {
        clickByXpath(objprop.getProperty("AdminHomePage.clickPropertyPopupClose"));
        return this;
    }
}