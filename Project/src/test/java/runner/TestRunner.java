package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.ActionsPageAction;
import pages.FindDoctorPageActions;
import pages.FooterIconPageActions;
import pages.ForProvidersPageActions;
import pages.HealthAction;
import pages.HealthLibraryPageActions;
import pages.InstituteAndDepartmentPage;
import pages.OhioPageActions;
import pages.RespiratoryPageActions;
import pages.ScheduleNowPageActions;
import utils.Base;
import utils.Reporter;

public class TestRunner extends Base {
    public static ExtentReports reports;
    public static ExtentTest test;
    @BeforeClass
    public void report() {
        reports=Reporter.createReport("cleveland_Report");
    }

    @BeforeMethod
    public void open(){
        openBrowser();
    }
    /*
    * a. Method name : testCase01
    * b. Author : Dharen
    * c. Description : This test method creates a TestNG test report for "TestCase01" and executes the respiratory-related test actions from the RespiratoryPageActions class.
    * d. Return type : void
    * e. Parameter list : None
    */
    @Test
    public void testCase01() {
        test = reports.createTest("TestCase01");
        // Instantiate the RespiratoryPageActions object with the test instance
        RespiratoryPageActions respiratory = new RespiratoryPageActions(test);
        respiratory.respiratorytest();
    }
    /*
    * a. Method name : testCase02
    * b. Author : Dharen
    * c. Description : This test method creates a TestNG test report for "TestCase02" and executes Ohio-specific test actions from the OhioPageActions class.
    * d. Return type : void
    * e. Parameter list : None
    */
    @Test
    public void testCase02() {
        test = reports.createTest("TestCase02");
        // Instantiate the OhioPageActions object with the test instance
        OhioPageActions ohio = new OhioPageActions(test);
        ohio.ohiotest();
    }
    @Test
    public void testScheduleNow(){
        test = reports.createTest("TestCase03");
        ScheduleNowPageActions sna = new ScheduleNowPageActions(driver,test);
        sna.testScheduleNow();
    }
 
    @Test
    public void testFindDoctor(){
        test = reports.createTest("TestCase04");
        FindDoctorPageActions fda = new FindDoctorPageActions(driver,test);
        fda.testFindDoctor();
    }
    @Test
    public void FooterTestCase(){
        test = reports.createTest("Institute And Department Test");
        InstituteAndDepartmentPage institute = new InstituteAndDepartmentPage(driver,test);
        institute.mergeInstituteAndDepartment();
    }
    @Test
    public void FooterIconTestCase(){
        ExtentTest test = reports.createTest("TestCase07");
        FooterIconPageActions footer = new FooterIconPageActions(test);
        footer.footerTestCase();
    }
    @Test
    public void testCase1() {
        test = reports.createTest("TestCase05");
        HealthLibraryPageActions hpa = new HealthLibraryPageActions(test);
        hpa.HealthLibraryTestcase();
    }
 
    @Test
    public void testcase2() {
        test = reports.createTest("TestCase06");
        ForProvidersPageActions fpa=new ForProvidersPageActions(test);
        fpa.ForProvidersTestcase();
    }
    @Test
    public void healthTest(){
        test= reports.createTest("Testcase 09");
        HealthAction ha= new HealthAction(test);
        ha.allHealth();
    }
    @Test
    public void actionsTest(){
        test= reports.createTest("Testcase 08");
        ActionsPageAction ap= new ActionsPageAction(test);
        ap.allActions();
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
    @AfterClass
    public void flush() {
        reports.flush();
    }
}
