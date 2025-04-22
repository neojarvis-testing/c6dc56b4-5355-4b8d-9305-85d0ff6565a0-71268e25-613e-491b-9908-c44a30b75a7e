package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.FooterIconPageActions;
import utils.Base;
import utils.Reporter;


public class TestRunner extends Base{
    ExtentReports reports;
    ExtentTest test;

    @BeforeClass
    public void reportlaunch(){
        reports = Reporter.createReport("cleveland_Report");
    }

    @BeforeMethod
    public void launch(){
        openBrowser();
        
    }

    @Test
    public void FooterIconTestCase(){
        ExtentTest test = reports.createTest("TestCase 07");
        FooterIconPageActions footer = new FooterIconPageActions(test);
        footer.footerTestCase();
    }

    @AfterClass
    public void pushData(){
        reports.flush();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    
}
