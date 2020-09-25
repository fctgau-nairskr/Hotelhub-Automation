package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public abstract class Reports {


    public static ExtentReports report;

    public ExtentTest test;

    public String testCaseName, testDescription;
    WebDriver driver;
    public String author, category;
    public int i = 1;

    public void startReport() {
        report = new ExtentReports("./Reports/Result" + i + ".html", false);
        //false to override result in report
        i++;
    }


    public void startTest(String testCaseName, String testDescription) {
        test = report.startTest(testCaseName, testDescription);
        test.assignAuthor(author);
        test.assignCategory(category);

    }

    public abstract String takeSnap() throws InterruptedException;


    public void reportStep(String status, String Description, boolean snap) {

        if (!snap) {
            if (status.equalsIgnoreCase("Pass")) {
                test.log(LogStatus.PASS, Description);
            } else if (status.equalsIgnoreCase("fail")) {
                test.log(LogStatus.FAIL, Description);
            } else if (status.equalsIgnoreCase("info")) {
                test.log(LogStatus.INFO, Description);
            }
        }
    }


    public void reportStep(String desc, String status)  {

        String snapNumber= null;
        try {
            snapNumber = takeSnap();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        if (status.equalsIgnoreCase("PASS")) {
          //String  ScreenShotPath = GetScreenshot.capture(driver,"screenshotForExtentreport");
          //test.log(LogStatus.PASS,desc+ test.addScreenCapture(ScreenShotPath));
            test.log(LogStatus.PASS, desc+test.addScreenCapture(snapNumber));
           // test.log(LogStatus.PASS, test.addScreenCapture(snapNumber));
           // test.log(LogStatus.PASS, test.addScreenCapture("C:\\Users\\nairskr\\IdeaProjects\\Hotelhubautomation\\screenshots\\snap139445.png"));
            //test.addScreenCapture("C:\\Users\\nairskr\\IdeaProjects\\Hotelhubautomation\\screenshots\\snap139445.png");
            //test.log(LogStatus.PASS, desc+test.addScreenCapture(".././reports/images/"+snapNumber+".png"));
        } else if (status.equalsIgnoreCase("FAIL")) {
           test.log(LogStatus.FAIL, desc+test.addScreenCapture(snapNumber));
        } else if (status.equalsIgnoreCase("INFO")) {
            test.log(LogStatus.INFO, desc+test.addScreenCapture(snapNumber));
        } else if (status.equalsIgnoreCase("WARN")) {
            test.log(LogStatus.WARNING, desc+test.addScreenCapture(snapNumber));
        }
    }



    public void endTest() {
        report.endTest(test);
    }

    public void endReport() {
        report.flush();
    }



    }