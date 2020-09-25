package Supplierportalpages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import wrappers.GenericWrappers;

public class SupplierLoginPage extends GenericWrappers {

    public SupplierLoginPage(RemoteWebDriver driver, ExtentTest test){
        this.driver=driver;
        this.test=test;
    }
    public SupplierLoginPage enterUserName(String username){
        enterByXpath(objprop.getProperty("SupplierLoginPage.enterUserName"),username);
       // reportStep("desc","PASS");
        return this;

    }
    public SupplierLoginPage enterPassword(String password){
        enterByXpath(objprop.getProperty("SupplierLoginPage.enterPassword"),password);
        return this;
    }
    public SupplierHomePage clickLoginButton(){
        clickByXpath(objprop.getProperty("SupplierLoginPage.clickOnLogin"));
        return new SupplierHomePage(driver,test);
    }



}

