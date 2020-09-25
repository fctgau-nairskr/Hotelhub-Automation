package Supplierportalpages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import wrappers.GenericWrappers;

public class SupplierRoomTypePage extends GenericWrappers {

    public SupplierRoomTypePage(RemoteWebDriver driver, ExtentTest test){
        this.driver=driver;
        this.test=test;
    }
    public SupplierRoomTypePage clickRoomTypeTab(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickRoomTypeTab"));
        return this;
    }
    public SupplierRoomTypePage clickCreateNewRoomType(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickCreateNewRoomType"));
        return this;
    }
    public SupplierRoomTypePage enterNewRoomName(String roomname){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterNewRoomName"),roomname);
        return this;
    }
    public SupplierRoomTypePage enterInternalReferenceCode(String referencecode){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterInternalReferenceCode"),referencecode);
        return this;
    }
    public SupplierRoomTypePage enterRoomCode(String roomcode){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterRoomCode"),roomcode);
        return this;
    }
    public SupplierRoomTypePage enterRateCode(String ratecode){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterRateCode"),ratecode);
        return this;
    }
    public SupplierRoomTypePage enterRoomInclusion(String RoomInclusion){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterRoomInclusion"),RoomInclusion);
        return this;
    }
    public SupplierRoomTypePage getDefaultInclusion(){
        getTextById(objprop.getProperty("SupplierRoomTypePage.getDefaultInclusion"));
        return this;
    }
    public SupplierRoomTypePage getRoomInclusion(){
        getTextById(objprop.getProperty("SupplierRoomTypePage.getRoomInclusion"));
        return this;
    }
    public SupplierRoomTypePage clickCancellationPolicySamedayArrival(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickCancellationPolicySamedayArrival"));
        return this;
    }
    public SupplierRoomTypePage clickCancellationPolicyDaysBeforeArrival(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickCancellationPolicyDaysBeforeArrival"));
        return this;
    }
    public SupplierRoomTypePage enterNoOfDaysBeforeArrival(String days){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterNoOfDaysBeforeArrival"),days);
        return this;
    }
    public SupplierRoomTypePage clickCancellationPolicyNoCancellation(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickCancellationPolicyNoCancellation"));
        return this;
    }
    public SupplierRoomTypePage clickCancellationFee(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickCancellationFee"));
        return this;
    }

    public SupplierRoomTypePage clickRoomTypeCancelButton(){
        clickById(objprop.getProperty("SupplierRoomTypePage.clickRoomTypeCancelButton"));
        return this;
    }
    public SupplierRoomTypePage clickRoomGuestPolicy(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickRoomGuestPolicy"));
        return this;
    }
    public SupplierRoomTypePage clickAddChild2(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickAddChild2"));
        return this;
    }
    public SupplierRoomTypePage selectInfantMaxAge(String InfantMaxAge){
        selectVisibileTextById(objprop.getProperty("SupplierRoomTypePage.selectInfantMaxAge"),InfantMaxAge);
        return this;
    }
    public SupplierRoomTypePage selectChild1MaxAge(String Child1MaxAge){
        selectVisibileTextById(objprop.getProperty("SupplierRoomTypePage.selectChild1MaxAge"),Child1MaxAge);
        return this;
    }
    public SupplierRoomTypePage selectChild2MaxAge(String Child2MaxAge){
        selectVisibileTextById(objprop.getProperty("SupplierRoomTypePage.selectChild2MaxAge"),Child2MaxAge);
        return this;
    }
    public SupplierRoomTypePage selectRoomCapacity(String capacity){
        selectVisibileTextById(objprop.getProperty("SupplierRoomTypePage.selectRoomCapacity"),capacity);
        return this;
    }
    public SupplierRoomTypePage selectNoOfGuest(String NoOfGuest){
        selectVisibileTextById(objprop.getProperty("SupplierRoomTypePage.selectNoOfGuest"),NoOfGuest);
        return this;
    }
    public SupplierRoomTypePage selectMaxAdult(String MaxAdult){
        selectVisibileTextById(objprop.getProperty("SupplierRoomTypePage.selectMaxAdult"),MaxAdult);
        return this;
    }
    public SupplierRoomTypePage selectMaxChildren(String MaxChildren){
        selectVisibileTextById(objprop.getProperty("SupplierRoomTypePage.selectMaxChildren"),MaxChildren);
        return this;
    }
    public SupplierRoomTypePage selectMaxInfant(String MaxInfant){
        selectVisibileTextById(objprop.getProperty("SupplierRoomTypePage.selectMaxInfant"),MaxInfant);
        return this;
    }
    public SupplierRoomTypePage clickSaveRoom(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickSaveRoom"));
        return this;
    }
    public SupplierRoomTypePage clickEditRoomType(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickEditRoomType"));
        return this;
    }
    public SupplierRoomTypePage clickCloseEditRoomType(){
        clickById(objprop.getProperty("SupplierRoomTypePage.clickCloseEditRoomType"));
        return this;
    }
    public SupplierRoomTypePage clickAcceptEditRoomTypeAlert(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickAcceptEditRoomTypeAlert"));
        return this;
    }
    public SupplierRoomTypePage clickArchiveRoomType(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickArchiveRoomType"));
        return this;
    }
    public SupplierRoomTypePage clickConfirmArchiveRoomType(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickConfirmArchiveRoomType"));
        return this;
    }

    public SupplierRoomTypePage enterStayNight(String enterStayNight){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterStayNight"),enterStayNight);
        return this;
    }
    public SupplierRoomTypePage enterPayNight(String enterPayNight){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterPayNight"),enterPayNight);
        return this;
    }
    public SupplierRoomTypePage enterMaxFreeNight(String enterMaxFreeNight){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterMaxFreeNight"),enterMaxFreeNight);
        return this;
    }
    public SupplierRoomTypePage clickLowestNightrateRadio(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickLowestNightrateRadio"));
        return this;
    }
    public SupplierRoomTypePage clickHighestNightrateRadio(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickHighestNightrateRadio"));
        return this;
    }
    public SupplierRoomTypePage clickFirstNightlyStayRadio(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickFirstNightlyStayRadio"));
        return this;
    }
    public SupplierRoomTypePage clickLastNightlyStayRadio(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickLastNightlyStayRadio"));
        return this;
    }
    public SupplierRoomTypePage selectRoomAccepts(String selectRoomAccepts){
        selectVisibileTextById(objprop.getProperty("SupplierRoomTypePage.selectRoomAccepts"),selectRoomAccepts);
        return this;
    }
    public SupplierRoomTypePage enterAdultRate(String enterAdultRate){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterAdultRate"),enterAdultRate);
        return this;
    }
    public SupplierRoomTypePage enterChild1Rate(String enterChild1Rate){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterChild1Rate"),enterChild1Rate);
        return this;
    }
    public SupplierRoomTypePage enterChild2Rate(String enterChild2Rate){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterChild2Rate"),enterChild2Rate);
        return this;
    }
    public SupplierRoomTypePage clickDeleteRoomType(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickDeleteRoomType"));
        return this;
    }
    public SupplierRoomTypePage selectCancellationNightCharge(String selectCancellationNightCharge){
        selectVisibileTextById(objprop.getProperty("SupplierRoomTypePage.selectCancellationNightCharge"),selectCancellationNightCharge);
        return this;
    }
    public SupplierRoomTypePage enterCancellationFee(String enterCancellationFee){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterCancellationFee"),enterCancellationFee);
        return this;
    }
    public SupplierRoomTypePage enterCancellationFeePercentage(String enterCancellationFeePercentage){
        enterByXpath(objprop.getProperty("SupplierRoomTypePage.enterCancellationFeePercentage"),enterCancellationFeePercentage);
        return this;
    }
    public SupplierRoomTypePage clickCancellationFeePercentage(){
        clickByXpath(objprop.getProperty("SupplierRoomTypePage.clickCancellationFeePercentage"));
        return this;
    }
    public SupplierRoomTypePage roomPageScrollDown(){
        keysPageDownByXpath(objprop.getProperty("SupplierRoomTypePage.roomPageScrollDown"));
        return this;
    }
    public SupplierPropertyPage clickPropertyTab() {
        clickByXpath(objprop.getProperty("SupplierPropertyPage.clickPropertyTab"));
        return new SupplierPropertyPage(driver,test);

    }
    public SupplierArchivePage clickArchiveTab() {
        clickByXpath(objprop.getProperty("SupplierArchivePage.clickArchiveTab"));
        return new SupplierArchivePage(driver,test);

    }
    public  SupplierHomePage clickOnHomeTab(){
        clickByXpath(objprop.getProperty("SupplierHomePage.clickOnHomeTab"));
        return new SupplierHomePage(driver,test);
    }
}

