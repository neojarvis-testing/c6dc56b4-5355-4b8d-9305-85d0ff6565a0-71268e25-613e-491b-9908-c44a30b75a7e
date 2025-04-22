package runner;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.InstituteAndDepartmentPage;
import utils.Base;
import utils.Reporter;
 
 
public class TestRunner extends Base{
    InstituteAndDepartmentPage institute;
    ExtentReports report;
    ExtentTest test;
 
    @BeforeClass
    public void reportlaunch(){
        report = Reporter.createReport("cleveland_Report");
        test = report.createTest("Cleveland Test");
    }
 
    @BeforeMethod
    public void launch(){
        openBrowser();
    }
 
    @Test
    public void FooterTestCase(){
        test = report.createTest("Institute And Department Test");
        institute = new InstituteAndDepartmentPage(driver,test);
        institute.mergeInstituteAndDepartment();
    }
 
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @AfterClass
    public void pushData(){
        report.flush();
    }
 
   
}
