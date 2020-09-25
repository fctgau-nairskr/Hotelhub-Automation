package Supplierportalpages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import wrappers.GenericWrappers;

public class SupplierHomePage extends GenericWrappers {
    public SupplierHomePage(RemoteWebDriver driver, ExtentTest test){
        this.driver=driver;
        this.test=test;
    }
    public  SupplierHomePage clickOnHomeTab(){
        clickByXpath(objprop.getProperty("SupplierHomePage.clickOnHomeTab"));
        return this;
    }
    public SupplierHomePage selectRoomType(String text){
        selectVisibleTextByXpath(objprop.getProperty("SupplierHomePage.selectRoomType"),text);
        return this;

    }
    public SupplierHomePage enterRoomRate(String roomrate){
        enterByXpath(objprop.getProperty("SupplierHomePage.enterRoomRate"),roomrate);
        return this;

    }
    public SupplierHomePage enterRoomAllocation(String roomalloc) {
        enterByXpath(objprop.getProperty("SupplierHomePage.enterRoomAllocation"), roomalloc);
        return this;
    }
    public SupplierHomePage enterExtraAdultRate(String extraadultrate) {
        enterByXpath(objprop.getProperty("SupplierHomePage.enterExtraAdultRate"), extraadultrate);
        return this;
    }
    public SupplierHomePage enterExtraChild1Rate(String extrachil1drate) {
        enterByXpath(objprop.getProperty("SupplierHomePage.enterExtraChild1Rate"), extrachil1drate);
        return this;
    }
    public SupplierHomePage enterExtraChild2Rate(String extrachil2drate) {
        enterByXpath(objprop.getProperty("SupplierHomePage.enterExtraChild2Rate"), extrachil2drate);
        return this;
    }
    public SupplierHomePage clickNoChangesToAvailability() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickNoChangesToAvailability"));
        return this;
    }
    public SupplierHomePage clickMakeSelectedDateToAvailabe() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickMakeSelectedDateToAvailabe"));
        return this;
    }
    public SupplierHomePage clickStopSellSelectedDate() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickStopSellSelectedDate"));
        return this;
    }
    public SupplierHomePage clickClosedToArrival() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickClosedToArrival"));
        return this;
    }
    public SupplierHomePage clickclosedToDepature() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickclosedToDepature"));
        return this;
    }
    public SupplierHomePage clickCheckinDate() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickCheckinDate"));
        return this;
    }
    public SupplierHomePage selectCheckinDate() {
        clickByXpath(objprop.getProperty("SupplierHomePage.selectCheckinDate"));
        return this;
    }
    public SupplierHomePage clickCheckoutDate() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickCheckoutDate"));
        return this;
    }
    public SupplierHomePage selectCheckoutDate() {
        clickByXpath(objprop.getProperty("SupplierHomePage.selectCheckoutDate"));
        return this;
    }
    public SupplierHomePage clickSaveChanges() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickSaveChanges"));
        return this;
    }
    public SupplierHomePage clickSaveChangesPopUpOk() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickSaveChangesPopUpOk"));
        return this;
    }

    public SupplierHomePage clickRate() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickRate"));
        return this;
    }

    public SupplierHomePage clickMinimumStay() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickMinimumStay"));
        return this;
    }
    public SupplierHomePage clickMaximumStay() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickMaximumStay"));
        return this;
    }
    public SupplierHomePage clickExtraAdultRate() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickExtraAdultRate"));
        return this;
    }
    public SupplierHomePage clickExtraChil1dRate() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickExtraChild1Rate"));
        return this;
    }
    public SupplierHomePage clickExtraChil2dRate() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickExtraChild2Rate"));
        return this;
    }
    public SupplierHomePage clickAllocation() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickAllocation"));
        return this;
    }
    public SupplierHomePage clickShowHideQuickRateEditor() {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickShowHideQuickRateEditor"));
        return this;
    }
    public SupplierHomePage verifyTextDisplayed () {
        verifyTextIsDisplayedByXpath(objprop.getProperty("SupplierHomePage.verifyTextDisplayed"));
        return this;
    }
    public SupplierRoomTypePage clickRoomDetailLink () {
        clickByXpath(objprop.getProperty("SupplierHomePage.clickRoomDetailLink"));
        return new SupplierRoomTypePage(driver,test);
    }
    public SupplierPropertyPage clickPropertyTab() {
        clickByXpath(objprop.getProperty("SupplierPropertyPage.clickPropertyTab"));
        return new SupplierPropertyPage(driver,test);

    }
    public SupplierBookingPage clickBookingTab() {
        clickByXpath(objprop.getProperty("SupplierBookingPage.clickBookingTab"));
        return new SupplierBookingPage(driver,test);
    }
    public SupplierInventoryMappingPage clickInventoryMappingTab() {
        clickByXpath(objprop.getProperty("SupplierInventoryMapping.clickInventoryMappingTab"));
        return new SupplierInventoryMappingPage(driver,test);
    }
    public SupplierRoomTypePage clickRoomTypeTab(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickRoomTypeTab"));
        return new SupplierRoomTypePage(driver,test);
    }
    public SupplierRoomTypePage roomPageScrollDown(){
        keysPageDownByXpath(objprop.getProperty("SupplierRoomTypePage.roomPageScrollDown"));
        return new SupplierRoomTypePage(driver,test);
    }
}
