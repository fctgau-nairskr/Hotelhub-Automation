package Adminportalpages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import wrappers.GenericWrappersAdminPortal;

public class AdminLoginPage extends GenericWrappersAdminPortal {
    public AdminLoginPage(RemoteWebDriver driver, ExtentTest test){
        this.driver=driver;
        this.test=test;
    }
    public AdminLoginPage enterUserName(String username){
        enterByXpath(objprop.getProperty("AdminLoginPage.enterUserName"),username);
        // reportStep("desc","PASS");
        return this;

    }
    public AdminLoginPage enterPassword(String password){
        enterByXpath(objprop.getProperty("AdminLoginPage.enterPassword"),password);
        return this;
    }
    public AdminHomePage clickLoginButton(){
        clickByXpath(objprop.getProperty("AdminLoginPage.clickOnLogin"));
        return new AdminHomePage(driver,test);
    }



}



