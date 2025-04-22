package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.FindDoctorActions;
import pages.ScheduleNowPageActions;
import utils.Base;
import utils.Reporter;

public class TestRunner extends Base{
    ExtentReports report;
    ExtentTest test;

    @BeforeClass
    public void generateReport(){
        report = Reporter.createReport("Cleveland Clinic");
    }

    @BeforeMethod
    public void launch(){
        openBrowser();
    }

    @Test
    public void testScheduleNow(){
        test = report.createTest("Schedule Now");
        ScheduleNowPageActions sna = new ScheduleNowPageActions(driver,test);
        sna.testScheduleNow();
    }

    @Test
    public void testFindDoctor(){
        test = report.createTest("Find a Doctor");
        FindDoctorActions fda = new FindDoctorActions(driver,test);
        fda.testFindDoctor();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @AfterClass
    public void pushData(){
        report.flush();
    }
}
