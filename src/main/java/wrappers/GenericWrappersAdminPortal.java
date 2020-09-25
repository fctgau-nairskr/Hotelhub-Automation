package wrappers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.Reports;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class GenericWrappersAdminPortal extends Reports implements Wrappers {
    public RemoteWebDriver driver;//Making remote webdriver as public
    int i=1;
    public static Properties objprop;
    public String urladmin;

    public GenericWrappersAdminPortal(){

        Properties configprop = new Properties();
        try {

            configprop.load(new FileInputStream(new File(("./src/test/java/config.properties"))));
            urladmin = configprop.getProperty("urladmin");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }
    public void loadObjects(){

        objprop = new Properties();

        try {
            objprop.load(new FileInputStream(new File("./src/test/java/object.properties")));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public void unloadObjects(){
        objprop = null;
    }








    public void invokeApp(String browser, String urladmin) {
        // TODO Auto-generated method stub
        try {
            if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            }else if(browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
                driver = new FirefoxDriver();
            }else if(browser.equalsIgnoreCase("ie")){
                System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }

            driver.manage().window().maximize();
            driver.get(urladmin);
            //System.out.println("The browser "+browser+" is launched with URL: "+url);
            reportStep("The browser "+browser+" is launched with URL: "+urladmin, "PASS");
        } catch (WebDriverException e) {
            // TODO Auto-generated catch block
            //System.err.println("The browser "+browser+" is not launched due to unknown error");
            reportStep("The browser "+browser+" is launched with URL: "+urladmin, "FAIL");
        }finally {
            takeSnap();
        }

    }

    ///////////////////////////////////////////////////////////////////////////////////////

    public void enterById(String idValue, String data) {
        // TODO Auto-generated method stub
        try {
            driver.findElementById(idValue).sendKeys(data);
            //System.out.println("The element with id "+idValue+" is entered with data "+data);
            reportStep("The element with id "+idValue+" is entered with data "+data, "PASS");

        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with id "+idValue+" is not found in the DOM");
            reportStep("The element with id "+idValue+" is not found in the DOM", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with id "+idValue+" is not visible in Application");
            reportStep("The element with id "+idValue+" is not visible in Application","FAIL");
        }catch (ElementNotInteractableException e) {
            // TODO: handle exception
            //System.err.println("The element with id "+idValue+" is not interactable");
            reportStep("The element with id "+idValue+" is not interactable", "FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with id "+idValue+" is not Stable");
            reportStep("The element with id "+idValue+" is not Stable", "FAIL");

        }catch (WebDriverException e) {
            // TODO: handle exception
            //System.err.println("Browser got closed due to unknown error");
            reportStep("Browser got closed due to unknown error", "FAIL");

        }finally {
            takeSnap();
        }
    }

////////////////////////////////////////////////////////////////////////////////////////

    public void enterByName(String nameValue, String data) {
        // TODO Auto-generated method stub
        try {
            driver.findElementByName(nameValue).sendKeys(data);

            //System.out.println("The element with name "+nameValue+" is entered with data "+data);
            reportStep("The element with name "+nameValue+" is entered with data "+data, "PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with name "+nameValue+" is not found in the DOM");
            reportStep("The element with name "+nameValue+" is not found in the DOM", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with name "+nameValue+" is not visible in Application");
            reportStep("The element with name "+nameValue+" is not visible in Application","FAIL" );
        }catch (ElementNotInteractableException e) {
            // TODO: handle exception
            //System.err.println("The element with name "+nameValue+" is not interactable");
            reportStep("The element with name "+nameValue+" is not interactable", "FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with name "+nameValue+" is not Stable");
            reportStep("The element with name "+nameValue+" is not Stable", "FAIL");

        }catch (WebDriverException e) {
            // TODO: handle exception
            //System.err.println("Browser got closed due to unknown error");
            reportStep("Browser got closed due to unknown error", "FAIL");

        }finally {
            takeSnap();
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////
    public void enterByXpath(String xpathValue, String data) {
        // TODO Auto-generated method stub
        try {
            driver.findElementByXPath(xpathValue).sendKeys(data);
            //System.out.println("The element with xpath "+xpathValue+" is entered with data "+data);
            reportStep("The element with xpath "+xpathValue+" is entered with data "+data, "PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
            reportStep("The element with xpath "+xpathValue+" is not found in the DOM","FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with xpath "+xpathValue+" is not visible in Application");
            reportStep("The element with xpath "+xpathValue+" is not visible in Application", "FAIL");
        }catch (ElementNotInteractableException e) {
            // TODO: handle exception
            //System.err.println("The element with xpath "+xpathValue+" is not interactable");
            reportStep("The element with xpath "+xpathValue+" is not interactable","FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with xpath "+xpathValue+" is not Stable");
            reportStep("The element with xpath "+xpathValue+" is not Stable", "FAIL");
        }catch (WebDriverException e) {
            // TODO: handle exception
            //System.err.println("Browser got closed due to unknown error");
            reportStep("Browser got closed due to unknown error", "FAIL");
        }finally {
            takeSnap();
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////
    public void verifyTitle(String title) {
        // TODO Auto-generated method stub
        try {
            String temp=driver.getTitle();
            if(temp.equalsIgnoreCase(title)){
                //System.out.println(" The title" + temp+ "and " +title+ "is matched successfully");
                reportStep("The title" + temp+ "and " +title+ "is matched successfully", "PASS");
            }
        } catch (NoSuchWindowException e) {
            // TODO Auto-generated catch block
            //System.err.println("The title"+title+" is not found in the window");
            reportStep("The title"+title+" is not found in the window", "FAIL");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");

        }finally {
            takeSnap();
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    public void verifyTextById(String id, String text) {
        // TODO Auto-generated method stub
        try {
            String temp=driver.getTitle();
            if(temp.equalsIgnoreCase(text)){
                //System.out.println(" The title" + temp+ "and " +text+ "is matched successfully");
                reportStep(" The title" + temp+ "and " +text+ "is matched successfully","PASS");
            }
        } catch (NoSuchWindowException e) {
            // TODO Auto-generated catch block
            //System.err.println("The title"+text+" is not found in the window");
            reportStep("The title"+text+" is not found in the window", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with ID "+id+" is not visible in Application");
            reportStep("The element with ID "+id+" is not visible in Application","FAIL");
        }catch (ElementNotInteractableException e) {
            // TODO: handle exception
            //System.err.println("The element with ID "+id+" is not interactable");
            reportStep("The element with ID "+id+" is not visible in Application","FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with ID "+id+" is not Stable");
            reportStep("The element with ID "+id+" is not Stable", "FAIL");

        }catch (WebDriverException e) {
            // TODO: handle exception
            //System.err.println("The element with ID"+id+"and with the text"+text+" is not able to compare due to unknown error");
            reportStep("The element with ID"+id+"and with the text"+text+" is not able to compare due to unknown error","FAIL");
        }finally {
            takeSnap();
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    public void verifyTextByXpath(String xpath, String text) {
        // TODO Auto-generated method stub
        try {
            String temp=driver.findElementByXPath(xpath).getText();
            if(temp.equalsIgnoreCase(text)){
                //System.out.println("The text "+temp+"and"+text+" matched successfully");
                reportStep("The text "+temp+"and"+text+" matched successfully", "PASS");

            }
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpath+"is not found");
            reportStep("The element with xpath"+xpath+"is not found", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with xpath"+xpath+"is not visible");
            reportStep("The element with xpath"+xpath+"is not visible","FAIL");

        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with xpath"+xpath+"is not found because of StaleElementReferenceException");
            reportStep("The element with xpath"+xpath+"is not found because of StaleElementReferenceException", "FAIL");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }finally {
            takeSnap();
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    public void verifyTextContainsByXpath(String xpath, String text) {
        // TODO Auto-generated method stub
        try {
            String temp=driver.findElementByXPath(xpath).getText();
            if(text.contains(temp)){
                //System.out.println("Text"+temp+"and"+temp+"matched successfully");
                reportStep("Text"+temp+"and"+temp+"matched successfully","PASS");

            }
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpath+" is not found");
            reportStep("The element with xpath"+xpath+" is not found","FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with xpath"+xpath+" is not visible");
            reportStep("The element with xpath"+xpath+" is not visible", "FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with xpath"+xpath+" is not found because of StaleElementReferenceException ");
            reportStep("The element with xpath"+xpath+" is not found because of StaleElementReferenceException ","FAIL");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }finally {
            takeSnap();
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    public void clickById(String id) {
        // TODO Auto-generated method stub
        try {
            driver.findElementById(id).click();
            //System.out.println("The element with id"+id+"is clicked successfully");
            reportStep("The element with id"+id+"is clicked successfully","PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with id"+id+" is not found");
            reportStep("The element with id"+id+" is not found", "FAIL");

        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with id "+id+" is not visible");
            reportStep("The element with id "+id+" is not visible","FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with id "+id+" is not found because of StaleElementReferenceException");
            reportStep("The element with id "+id+" is not found because of StaleElementReferenceException", "FAIL");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }finally {
            takeSnap();
        }

    }
    //////////////////////////////////////////////////////////////////////////////////////////
    public void clickByClassName(String classVal) {
        // TODO Auto-generated method stub
        try {
            driver.findElementByClassName(classVal).click();
            //System.out.println("The element with className"+classVal+"is clicked successfully");
            reportStep("The element with className"+classVal+"is clicked successfully","PASS");

        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with className"+classVal+"is not found");
            reportStep("The element with className"+classVal+"is not found", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with className"+classVal+"is not visible");
            reportStep("The element with className"+classVal+"is not visible", "FAIL");

        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with className"+classVal+"is not found due to StaleElementReferenceException");
            reportStep("The element with className"+classVal+"is not found due to StaleElementReferenceException", "FAIL");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }finally {
            takeSnap();
        }


    }
    //////////////////////////////////////////////////////////////////////////////////
    public void clickByName(String name) {
        // TODO Auto-generated method stub
        try {
            driver.findElementByName(name).click();
            //System.out.println("The element with Name"+name+ "is clicked successfully");
            reportStep("The element with Name"+name+ "is clicked successfully","PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with Name"+name+ "is not found");
            reportStep("The element with Name"+name+ "is not found", "FAIL");

        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with Name"+name+ "is not visible");
            reportStep("The element with Name"+name+ "is not visible","FAIL");

        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with Name"+name+ "is not found due to StaleElementReferenceException ");
            reportStep("The element with Name"+name+ "is not found due to StaleElementReferenceException ", "FAIL");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error","FAIL");
        }finally {
            takeSnap();
        }
    }

    //////////////////////////////////////////////////////////////////////////////////
    public void clickByLink(String name) {
        // TODO Auto-generated method stub
        try {
            driver.findElementByLinkText(name).click();
            //System.out.println("The element with link text "+name+"is clicked successfully");
            reportStep("The element with link text "+name+"is clicked successfully", "PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with link text"+name+"is not found");
            reportStep("The element with link text"+name+"is not found","FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //			System.err.println("The element with link text"+name+"is not visible");
            reportStep("The element with link text"+name+"is not visible","FAIL");
        } catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with link text"+name+"is not found due to StaleElementReferenceException");
            reportStep("The element with link text"+name+"is not found due to StaleElementReferenceException","FAIL");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error","FAIL");
        }finally {
            takeSnap();
        }

    }
    ///////////////////////////////////////////////////////////////////////////////////
    public void clickByLinkNoSnap(String name) {
        // TODO Auto-generated method stub
        try {
            driver.findElementByLinkText(name).click();
            //System.out.println("The element with linktext"+name+"is clicked successfully");
            reportStep("The element with linktext"+name+"is clicked successfully","PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with linktext"+name+"is not found");
            reportStep("The element with linktext"+name+"is not found","FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with linktext"+name+"is not visible");
            reportStep("The element with linktext"+name+"is not visible","FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with linktext"+name+"is not found due to StaleElementReferenceException ");
            reportStep("The element with linktext"+name+"is not found due to StaleElementReferenceException ", "FAIL");
        }catch (Exception e) {
            // TODO Auto-generated catch block
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error","FAIL");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void clickByXpath(String xpathVal) {
        // TODO Auto-generated method stub
        try {
            driver.findElementByXPath(xpathVal).click();
            //System.out.println("The element with xpath"+xpathVal+"is clicked successfully");
            reportStep("The element with xpath"+xpathVal+"is clicked successfully","PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not found");
            reportStep("The element with xpath"+xpathVal+"is not found","FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not visible");
            reportStep("The element with xpath"+xpathVal+"is not visible", "FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not found due to StaleElementReferenceException");
            reportStep("The element with xpath"+xpathVal+"is not found due to StaleElementReferenceException", "FAIL");
        }catch (Exception e) {
            // TODO Auto-generated catch block
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error","FAIL");
        }finally {
            takeSnap();
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    public void clickByXpathNoSnap(String xpathVal) {
        // TODO Auto-generated method stub
        try {
            driver.findElementByXPath(xpathVal).click();
            //System.out.println("The element with xpath"+xpathVal+"is clicked successfully");
            reportStep("The element with xpath"+xpathVal+"is clicked successfully", "PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not found");
            reportStep("The element with xpath"+xpathVal+"is not found","FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not visible");
            reportStep("The element with xpath"+xpathVal+"is not visible","FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not found due to StaleElementReferenceException");
            reportStep("The element with xpath"+xpathVal+"is not found due to StaleElementReferenceException", "FAIL");
        }catch (Exception e) {
            // TODO Auto-generated catch block
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error","FAIL");

        }
    }
    //////////////////////////////////////////////////////////////////////////////////
    public String getTextById(String idVal) {
        // TODO Auto-generated method stub
        try {
            String reqtext=driver.findElementById(idVal).getText();
            System.out.println("The required text is"+reqtext);
            reportStep("The required text is"+reqtext,"PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with id"+idVal+"is not found");
            reportStep("The element with id"+idVal+"is not found", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with id"+idVal+"is not visible");
            reportStep("The element with id"+idVal+"is not visible","FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with id"+idVal+"is not found because of StaleElementReferenceException ");
            reportStep("The element with id"+idVal+"is not found because of StaleElementReferenceException ","FAIL");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error","FAIL");
        }finally {
            takeSnap();
        }
        return null;
    }
    //////////////////////////////////////////////////////////////////////////////////
    public String getTextByXpath(String xpathVal) {
        // TODO Auto-generated method stub
        try {

            String temp=driver.findElementByXPath(xpathVal).getText();
            //System.out.println("The required text is "+temp);
            reportStep("The required text is "+temp, "PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not found");
            reportStep("The element with xpath"+xpathVal+"is not found", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not visible");
            reportStep("The element with xpath"+xpathVal+"is not visible","FAIL");
        }catch (ElementNotSelectableException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not selectable");
            reportStep("The element with xpath"+xpathVal+"is not selectable","FAIL");
        }catch (Exception e) {
            // TODO Auto-generated catch block
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }finally {
            takeSnap();
        }
        return null;

    }
    /////////////////////////////////////////////////////////////////////////////////
    public void selectVisibileTextById(String id, String value) {
        // TODO Auto-generated method stub
        try {
            Select sel=new Select(driver.findElementById(id));
            sel.selectByVisibleText(value);
            //System.out.println("The element in the dropdown with visibletext"+value+"is selected successfully");
            reportStep("The element in the dropdown with visibletext"+value+"is selected successfully", "PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with id"+id+"is not found");
            reportStep("The element with id"+id+"is not found","FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with id"+id+"is not visible");
            reportStep("The element with id"+id+"is not visible","FAIL");
        }catch (ElementNotSelectableException e) {
            // TODO: handle exception
            //System.err.println("The element with id"+id+"is not selectable");
            reportStep("The element with id"+id+"is not selectable","FAIL");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error","FAIL");
        }finally {
            takeSnap();
        }
    }
    //////////////////////////////////////////////////////////////////////////////////
    public void selectIndexById(String id, int value) {
        // TODO Auto-generated method stub
        try {
            Select sel=new Select(driver.findElementById(id));
            sel.selectByIndex(value);
            //System.out.println("The element in the dropdown with index"+value+" is selected successfully");
            reportStep("The element in the dropdown with index"+value+" is selected successfully", "PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with id"+id+"is not found");
            reportStep("The element with id"+id+"is not found", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with id"+id+"is not visible");
            reportStep("The element with id"+id+"is not visible", "FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with id"+id+"is not found due to StaleElementReferenceException");
            reportStep("The element with id"+id+"is not found due to StaleElementReferenceException", "FAILED");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }finally {
            takeSnap();
        }
    }

    public void selectIndexByName(String name, int value) {
        try {
            Select sel=new Select(driver.findElementByName(name));
            sel.selectByIndex(value);
            //System.out.println("The element in the dropdown with index"+value+" is selected successfully");
            reportStep("The element in the dropdown with index"+value+" is selected successfully", "PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with id"+id+"is not found");
            reportStep("The element with id"+name+"is not found", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with id"+id+"is not visible");
            reportStep("The element with id"+name+"is not visible", "FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with id"+id+"is not found due to StaleElementReferenceException");
            reportStep("The element with id"+name+"is not found due to StaleElementReferenceException", "FAILED");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }finally {
            takeSnap();
        }
    }

    /////////////////////////////////////////////////////////////////////////////////
    public void switchToParentWindow() {
        // TODO Auto-generated method stub
        try {
            Set<String> allwinid=driver.getWindowHandles();
            for(String onewinid:allwinid){
                driver.switchTo().window(onewinid);
                System.out.println(onewinid);
                break;
            }
            //System.out.println("The driver is switched to parent window successfully");
            reportStep("The driver is switched to parent window successfully","PASS");
        } catch (NoSuchWindowException e) {
            // TODO Auto-generated catch block
            //System.err.println(" Parent Window is not found ");
            reportStep("Parent Window is not found","FAIL");
        }catch (WebDriverException e) {
            // TODO: handle exception
            //System.err.println(" The browser is closed due to unknown error ");
            reportStep(" The browser is closed due to unknown error ","FAIL");
        }finally {
            takeSnap();
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////
    public void switchToLastWindow() {
        // TODO Auto-generated method stub
        try {
            Set<String> allwinid=driver.getWindowHandles();
            for(String onewinid:allwinid){
                driver.switchTo().window(onewinid);
            }

            //System.out.println("The driver is switched to last window successfully which has id");
            reportStep("The driver is switched to last window successfully which has id","PASS");
        } catch (NoSuchWindowException e) {
            // TODO Auto-generated catch block
            //System.err.println(" Window is not found ");
            reportStep("Window is not found","FAIL");
        }catch (WebDriverException e) {
            // TODO: handle exception
            //System.err.println(" The browser is closed due to unknown error ");
            reportStep("The browser is closed due to unknown error ","FAIL");
        }finally {
            takeSnap();
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////
    public void acceptAlert() {
        // TODO Auto-generated method stub
        try {
            driver.switchTo().alert().accept();
            //System.out.println("Alert is accepted successfully");
            reportStep("Alert is accepted successfully","PASS");
        } catch (NoAlertPresentException e) {
            // TODO Auto-generated catch block
            //System.err.println("NoAlertPresentException is occured");
            reportStep("NoAlertPresentException is occured", "FAIL");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println(" The browser is closed due to unknown error ");
            reportStep("The browser is closed due to unknown error","FAIL");

        }finally {
            takeSnap();
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////
    public void dismissAlert() {
        // TODO Auto-generated method stub
        try {
            driver.switchTo().alert().dismiss();
            //System.out.println("Alert is dismisseded successfully");
            reportStep("Alert is dismisseded successfully","PASS");
        } catch (NoAlertPresentException e) {
            // TODO Auto-generated catch block
            //System.err.println("NoAlertPresentException is occured");
            reportStep("NoAlertPresentException is occured","FAIL");

        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println(" The browser is closed due to unknown error ");
            reportStep("The browser is closed due to unknown error","FAIL");
        }finally {
            takeSnap();
        }

    }
    ///////////////////////////////////////////////////////////////////////////////////
    public String getAlertText() {
        // TODO Auto-generated method stub
        try {
            String temp=driver.switchTo().alert().getText();
            //System.out.println("The required text"+temp+"is found");
            reportStep("The required text"+temp+"is found","PASS");
        } catch (NoAlertPresentException e) {
            // TODO Auto-generated catch block
            //System.err.println("No alert is found");
            reportStep("No alert is found", "FAIL");
        }catch (WebDriverException e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }
        return null;
    }

    public Void verifyTextIsDisplayedByXpath(String xpathval ) {
        try {
            WebElement textDemo1 = driver.findElementByXPath(xpathval);

            if(textDemo1.isDisplayed())
            {
                System.out.println("Element found using text");
                reportStep("The element "+textDemo1+" is found successfully", "PASS");
            }
            else
                System.out.println("Element not found");
            //System.out.println("The element in the dropdown with index"+value+" is selected successfully");
            reportStep("The element "+textDemo1+" is not found", "PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with id"+id+"is not found");
            reportStep("The element with xpathval"+xpathval+"is not found", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with id"+id+"is not visible");
            reportStep("The element with xpath"+xpathval+"is not visible", "FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO: handle exception
            //System.err.println("The element with id"+id+"is not found due to StaleElementReferenceException");
            reportStep("The element with id"+xpathval+"is not found due to StaleElementReferenceException", "FAILED");
        }catch (Exception e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }finally {
            takeSnap();
        }
        return null;
    }




//////////////////////////////////////////////////////////////////////////////////


    public String takeSnap() {
        // TODO Auto-generated method stub

        long number=100000l;

        try {
            number = (long) Math.floor(Math.random()*100000+ 100000L);
            File temp = driver.getScreenshotAs(OutputType.FILE);
//            String destination ="C:\\Users\\nairskr\\IdeaProjects\\Hotelhubautomation\\screenshots\\snap"+number+".png";
            String destination ="\\screenshots\\snap"+number+".png";
            File dest = new File(destination);
            FileUtils.copyFile(temp, dest);
            Thread.sleep(1000);
            return destination;

        } catch (WebDriverException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }




    /////////////////////////////////////////////////////////////////////////////////
    public void closeBrowser() {
        // TODO Auto-generated method stub
        try {
            driver.close();
            //System.out.println("Active window is closed successfully");
            reportStep("Active window is closed successfully","PASS");
        } catch (NoSuchWindowException e) {
            // TODO Auto-generated catch block
            //System.err.println("Window is not found");
            reportStep("Window is not found","FAIL");
        }
        catch (NotFoundException e1) {
            //System.err.println("Browsers are not active now");
            reportStep("Browsers are not active now","FAIL");
        } catch (WebDriverException e) {
            // TODO: handle exception
            //System.err.println("Browser not closed due to unknown error");
            reportStep("Browser not closed due to unknown error","FAIL");
        }finally {
            takeSnap();
        }
    }
    /////////////////////////////////////////////////////////////////////////////////
    public void closeAllBrowsers() {
        // TODO Auto-generated method stub
        try {
            driver.quit();
            //System.out.println("All windows are closed successfully");
            reportStep("All windows are closed successfully", "PASS");
        } catch (NoSuchWindowException e) {
            // TODO Auto-generated catch block
            //System.err.println("Window is not found");
            reportStep("Window is not found", "FAIL");
        }catch (NotFoundException e) {
            //System.err.println("Browsers are not active now");
            reportStep("Browsers are not active now","FAIL");
        } catch (WebDriverException e) {
            // TODO: handle exception
            //System.err.println("Browser not closed due to unknown error");
            reportStep("Browser not closed due to unknown error","FAIL");
        }finally {
            takeSnap();
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void selectVisibleTextByXpath(String xpathVal, String text) {
        // TODO Auto-generated method stub
        try {
            Select sel= new Select(driver.findElementByXPath(xpathVal));
            sel.selectByVisibleText(text);
            //System.out.println("The element with xpath "+ xpathVal + " is selected ");
            reportStep("The element with xpath "+ xpathVal + " is selected ", "PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println(" The element with xpath "+ xpathVal + " is not found");
            reportStep(" The element with xpath "+ xpathVal + " is not found", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("The element with xpath "+ xpathVal + " is not visible");
            reportStep("The element with xpath "+ xpathVal + " is not visible","FAIL");
        }catch (ElementNotSelectableException e) {
            // TODO: handle exception
            //System.err.println("The element with xpath "+ xpathVal + " is not selectable");
            reportStep("The element with xpath "+ xpathVal + " is not selectable","FAIL");
        }catch (WebDriverException e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error","FAIL");
        }finally {
            takeSnap();
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    public void sleep(long value) {
        // TODO Auto-generated method stub

        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
/////////////////////////////////////////////////////////////////////////////////////////////

    public void sendKeysTabByXpath(String xpathVal) {
        // TODO Auto-generated method stub
        try {
            driver.findElementByXPath(xpathVal).sendKeys(Keys.TAB);
            //System.out.println(" xpath"+xpathVal+"is tabbed successfully");
            reportStep(" xpath"+xpathVal+"is tabbed successfully", "PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not found");
            reportStep("The element with xpath"+xpathVal+"is not found", "FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not visible");
            reportStep("The element with xpath"+xpathVal+"is not visible", "FAIL");
        }catch (StaleElementReferenceException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not found due to StaleElementReferenceException");
            reportStep("The element with xpath"+xpathVal+"is not found due to StaleElementReferenceException","FAIL");
        }catch (Exception e) {
            // TODO Auto-generated catch block
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }finally {
            takeSnap();
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    public void mouseHoverByXpath(String xpathVal) {
        // TODO Auto-generated method stub
        try {
            Actions obj1=new Actions(driver);

            WebElement obj3=driver.findElementByXPath(xpathVal);

            obj1.moveToElement(obj3).perform();
            //System.out.println("The elemnt with xpathVal " + xpathVal + " is mouse hovered");
            reportStep("The elemnt with xpathVal " + xpathVal + " is mouse hovered","PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpathVal"+xpathVal+" is not found");
            reportStep("The element with xpathVal"+xpathVal+" is not found","FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO: handle exception
            //System.err.println("the element with xpathVal "+ xpathVal+ " is not visible");
            reportStep("the element with xpathVal "+ xpathVal+ " is not visible","FAIL");
        }catch (WebDriverException e) {
            // TODO: handle exception
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }finally {
            takeSnap();}
    }
    ////////////////////////////////////////////////////////////////////////
    public void keysPageDownByXpath(String xpathVal) {
        // TODO Auto-generated method stub
        try {
            driver.findElementByXPath(xpathVal).sendKeys(Keys.PAGE_DOWN);
            //System.out.println(" Page with"+xpathVal+"is moved down");
            reportStep(" Page with"+xpathVal+"is moved down","PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not found");
            reportStep("The element with xpath"+xpathVal+"is not found", "FAILED");
        }catch (ElementNotVisibleException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not visible");
            reportStep("The element with xpath"+xpathVal+"is not visible","FAILED");
        }catch (StaleElementReferenceException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathVal+"is not found due to StaleElementReferenceException");
            reportStep("The element with xpath"+xpathVal+"is not found due to StaleElementReferenceException", "FAIL");
        }catch (Exception e) {
            // TODO Auto-generated catch block
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "FAIL");
        }finally {
            takeSnap();
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////

    public String getAttributeByXpath(String xpathval) {
        // TODO Auto-generated method stub
        try {

            String temp=driver.findElementByXPath(xpathval).getAttribute(xpathval);
            //System.out.println("The required text is "+temp);
            reportStep( "The required text is "+temp,"PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathval+"is not found");
            reportStep("The element with xpath"+xpathval+"is not found","FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathval+"is not visible");
            reportStep("The element with xpath"+xpathval+"is not visible", "FAIL");
        }catch (ElementNotSelectableException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathval+"is not selectable");
            reportStep("The element with xpath"+xpathval+"is not selectable", "FAIL");
        }catch (Exception e) {
            // TODO Auto-generated catch block
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "Fail");
        }finally {
            takeSnap();
        }
        return null;

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String getAttributeById(String id, String value) {
        try {

            String temp=driver.findElementById(id).getAttribute(value);
            System.out.println("The required text is "+temp);
            reportStep( "The required text is "+temp,"PASS");
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathval+"is not found");
            reportStep("The element with xpath"+id+"is not found","FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathval+"is not visible");
            reportStep("The element with xpath"+id+"is not visible", "FAIL");
        }catch (ElementNotSelectableException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathval+"is not selectable");
            reportStep("The element with xpath"+id+"is not selectable", "FAIL");
        }catch (Exception e) {
            // TODO Auto-generated catch block
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "Fail");
        }finally {
            takeSnap();
        }
        return null;

    }

    public String printColumnValue(String xpathval) {
        try {
            List<WebElement> column5 = driver.findElementsByXPath(xpathval);
            System.out.println("NUMBER OF ROWS IN THIS TABLE = "+ column5 .size());


            for(int cnum=0;cnum<column5.size()-1;cnum++)
            {
                System.out.println("Booking number# ="+column5.get(cnum).getText());
                reportStep("Booking number#"+column5.get(cnum).getText(),"PASS");
            }

        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathval+"is not found");
            reportStep("The element with xpath"+xpathval+"is not found","FAIL");
        }catch (ElementNotVisibleException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathval+"is not visible");
            reportStep("The element with xpath"+xpathval+"is not visible", "FAIL");
        }catch (ElementNotSelectableException e) {
            // TODO Auto-generated catch block
            //System.err.println("The element with xpath"+xpathval+"is not selectable");
            reportStep("The element with xpath"+xpathval+"is not selectable", "FAIL");
        }catch (Exception e) {
            // TODO Auto-generated catch block
            //System.err.println("The browser is closed due to unknown error");
            reportStep("The browser is closed due to unknown error", "Fail");
        }finally {
            takeSnap();
        }
        return null;


    }}




///////////////////////////////////////////////////////////////////////////////////////////
