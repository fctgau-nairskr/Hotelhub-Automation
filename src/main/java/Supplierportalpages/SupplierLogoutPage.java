package Supplierportalpages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.remote.RemoteWebDriver;
import wrappers.GenericWrappers;

public class SupplierLogoutPage extends GenericWrappers {

    public SupplierLogoutPage(RemoteWebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }
}
