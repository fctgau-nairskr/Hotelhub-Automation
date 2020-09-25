package Supplierportalpages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import wrappers.GenericWrappers;

public class SupplierBookingPage extends GenericWrappers {

    public SupplierBookingPage(RemoteWebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }
    public SupplierBookingPage selectBookingStatus(String bookingstatus) {
        selectVisibileTextById(objprop.getProperty("SupplierBookingPage.selectBookingStatus"),bookingstatus);
        return this;
    }
    public SupplierBookingPage clickDisplayBookings() {
       clickByXpath (objprop.getProperty("SupplierBookingPage.clickDisplayBookings"));
        return this;
    }
    public SupplierBookingPage printBookingNumber() {
        printColumnValue (objprop.getProperty("SupplierBookingPage.printBookingNumber"));
        return this;
    }
    public SupplierBookingPage clickBookings() {
        clickByXpath (objprop.getProperty("SupplierBookingPage.clickBookings"));
        return this;
    }
    public SupplierInventoryMappingPage clickInventoryMappingTab() {
        clickByXpath(objprop.getProperty("SupplierInventoryMapping.clickInventoryMappingTab"));
        return new SupplierInventoryMappingPage(driver,test);
    }

}