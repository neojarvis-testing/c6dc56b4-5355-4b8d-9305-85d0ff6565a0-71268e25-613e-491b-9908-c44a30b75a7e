package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.ActionsPageAction;
import pages.HealthAction;
import utils.Base;
import utils.Reporter;

public class TestRunner extends Base {
    ExtentReports reports;
    ExtentTest test;
 
    @BeforeClass
    public void generateReport(){
        reports = Reporter.createReport("Cleveland Clinic");
    }
    @BeforeMethod
    public void launch(){
        openBrowser();
    }
    @Test
    public void healthTest(){
        test= reports.createTest("Testcase 09");
        HealthAction ha= new HealthAction();
        ha.allHealth();
    }
    @Test
    public void actionsTest(){
        test= reports.createTest("Testcase 08");
        ActionsPageAction ap= new ActionsPageAction(test);
        ap.allActions();
    }
    @AfterMethod
    public void tear(){
        driver.quit();
    }
   @AfterClass
   public void  saveReports()
   {
    reports.flush();
   }
}
