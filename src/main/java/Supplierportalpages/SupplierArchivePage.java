package Supplierportalpages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import wrappers.GenericWrappers;

public class SupplierArchivePage extends GenericWrappers {

    public SupplierArchivePage(RemoteWebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    public SupplierArchivePage verifyArchiveRoomDisplayed() {
        verifyTextIsDisplayedByXpath(objprop.getProperty("SupplierArchivePage.verifyArchiveRoomDisplayed"));
        return this;
    }
    public SupplierArchivePage clickArchieveRoomRetrieve() {
        clickByXpath(objprop.getProperty("SupplierArchivePage.clickArchieveRoomRetrieve"));
        return this;
    }
    public SupplierArchivePage clickConfirmArchieveRoomRetrieve() {
        clickByXpath(objprop.getProperty("SupplierArchivePage.clickConfirmArchieveRoomRetrieve"));
        return this;
    }
    public SupplierBookingPage clickBookingTab() {
        clickByXpath(objprop.getProperty("SupplierBookingPage.clickBookingTab"));
        return new SupplierBookingPage(driver,test);
    }
}
