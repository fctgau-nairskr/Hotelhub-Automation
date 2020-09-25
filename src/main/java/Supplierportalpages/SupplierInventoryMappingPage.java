package Supplierportalpages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import wrappers.GenericWrappers;

public class SupplierInventoryMappingPage extends GenericWrappers {

    public SupplierInventoryMappingPage(RemoteWebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }
    public SupplierInventoryMappingPage verifyRoomInInventoryNoMapping() {
        verifyTextIsDisplayedByXpath(objprop.getProperty("SupplierInventoryMappingPage.verifyRoomInInventoryNoMapping"));
        return this;
    }
    public SupplierInventoryMappingPage clickMapAvailabityLink() {
        clickByXpath(objprop.getProperty("SupplierInventoryMappingPage.clickMapAvailabityLink"));
        return this;
    }
    public SupplierInventoryMappingPage selectRoomToMap(String text) {
        selectVisibileTextById(objprop.getProperty("SupplierInventoryMappingPage.selectRoomToMap"),text);
        return this;
    }
    public SupplierInventoryMappingPage clickSaveMapping() {
        clickByXpath(objprop.getProperty("SupplierInventoryMappingPage.clickSaveMapping"));
        return this;
    }
    public SupplierInventoryMappingPage clickMappingUpdate() {
        clickByXpath(objprop.getProperty("SupplierInventoryMappingPage.clickMappingUpdate"));
        return this;
    }

    public SupplierInventoryMappingPage clickMappingUpdateCancel() {
        clickByXpath(objprop.getProperty("SupplierInventoryMappingPage.clickMappingUpdateCancel"));
        return this;
    }
    public SupplierInventoryMappingPage clickUnmapRoom() {
        clickByXpath(objprop.getProperty("SupplierInventoryMappingPage.clickUnmapRoom"));
        return this;
    }
    public SupplierLogoutPage clickLogout() {
        clickByXpath(objprop.getProperty("SupplierLogoutPage.clickLogout"));
        return new SupplierLogoutPage(driver,test);
    }
}