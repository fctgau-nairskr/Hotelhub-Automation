package Supplierportalpages;

import  Supplierportalpages.SupplierLoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import wrappers.GenericWrappers;

public class SupplierPropertyPage extends GenericWrappers {

    public SupplierPropertyPage(RemoteWebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    public SupplierPropertyPage getPropertyId() {
        getTextById(objprop.getProperty("SupplierPropertyPage.getPropertyId"));
        return this;
    }

    public SupplierPropertyPage getPropertyName(String value) {
        getAttributeById(objprop.getProperty("SupplierPropertyPage.getPropertyName"), value);
        return this;
    }

    public SupplierPropertyPage clickPropertySpecials() {
        clickByXpath(objprop.getProperty("SupplierPropertyPage.clickPropertySpecials"));
        return this;
    }
    public SupplierPropertyPage enterPropertyInclusions(String inclusion) {
        enterByXpath(objprop.getProperty("SupplierPropertyPage.enterPropertyInclusions"),inclusion);
        return this;
    }
    public SupplierPropertyPage getPropertyInclusions() {
        getTextById(objprop.getProperty("SupplierPropertyPage.getPropertyInclusions"));
        return this;
    }
    public SupplierPropertyPage clickPropertyContact() {
        clickByXpath(objprop.getProperty("SupplierPropertyPage.clickPropertyContact"));
        return this;
    }
    public SupplierPropertyPage getPropertyReservationName(String value) {
        getAttributeById(objprop.getProperty("SupplierPropertyPage.getPropertyReservationName"),value);
        return this;
    }
    public SupplierPropertyPage getPropertyReservationPhone(String value) {
        getAttributeById(objprop.getProperty("SupplierPropertyPage.getPropertyReservationPhone"),value);
        return this;
    }
    public SupplierPropertyPage getPropertyReservationEmail(String value) {
        getAttributeById(objprop.getProperty("SupplierPropertyPage.getPropertyReservationEmail"),value);
        return this;
    }
    public SupplierPropertyPage clickPropertyAddChild2() {
        clickByXpath(objprop.getProperty("SupplierPropertyPage.clickPropertyAddChild2"));
        return this;
    }
    public SupplierPropertyPage selectPropertyAccepts(String selectPropertyAccepts){
        selectVisibileTextById(objprop.getProperty("SupplierPropertyPage.selectPropertyAccepts"),selectPropertyAccepts);
        return this;
    }

    public SupplierPropertyPage selectPropertyMaxChild1Age(String selectPropertyMaxChild1Age){
        selectVisibileTextById(objprop.getProperty("SupplierPropertyPage.selectPropertyMaxChild1Age"),selectPropertyMaxChild1Age);
        return this;
    }
    public SupplierPropertyPage selectPropertyMaxInfantAge(String selectPropertyMaxInfantAge){
        selectVisibileTextById(objprop.getProperty("SupplierPropertyPage.selectPropertyMaxInfantAge"),selectPropertyMaxInfantAge);
        return this;
    }
    public SupplierPropertyPage selectPropertyMaxChild2Age(String selectPropertyMaxChild2Age){
        selectVisibileTextById(objprop.getProperty("SupplierPropertyPage.selectPropertyMaxChild2Age"),selectPropertyMaxChild2Age);
        return this;
    }
    public SupplierPropertyPage clickPropertySaveChangesTab() {
        clickByXpath(objprop.getProperty("SupplierPropertyPage.clickPropertySaveChangesTab"));
        return this;
    }
    public SupplierPropertyPage clickPropertySaveChanges() {
        clickByXpath(objprop.getProperty("SupplierPropertyPage.clickPropertySaveChanges"));
        return this;
    }
    public SupplierPropertyPage clickPropertySaveChangesNow() {
        clickByXpath(objprop.getProperty("SupplierPropertyPage.clickPropertySaveChangesNow"));
        return this;
    }
    public SupplierPropertyPage acceptPropertySaveChanges() {
        clickByXpath(objprop.getProperty("SupplierPropertyPage.acceptPropertySaveChanges"));
        return this;
    }
    public SupplierBookingPage clickBookingTab() {
        clickByXpath(objprop.getProperty("SupplierBookingPage.clickBookingTab"));
        return new SupplierBookingPage(driver,test);
    }
    public SupplierRoomTypePage clickRoomTypeTab(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickRoomTypeTab"));
        return new SupplierRoomTypePage(driver,test);
    }
}

