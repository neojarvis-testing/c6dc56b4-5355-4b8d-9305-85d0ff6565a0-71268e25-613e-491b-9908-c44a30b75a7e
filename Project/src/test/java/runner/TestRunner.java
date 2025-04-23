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
    @Test
    public void testCase01() {
        test=reports.createTest("TestCase01");
        RespiratoryPageActions respiratory=new RespiratoryPageActions(test);
        respiratory.respiratorytest();
    }
    @Test
    public void testCase02() {
        test=reports.createTest("TestCase02");
        OhioPageActions ohio=new OhioPageActions(test);
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
    public void footerTestCase(){
        test = reports.createTest("Institute And Department Test");
        InstituteAndDepartmentPage institute = new InstituteAndDepartmentPage(driver,test);
        institute.mergeInstituteAndDepartment();
    }
    @Test
    public void footerIconTestCase(){
        ExtentTest test = reports.createTest("TestCase07");
        FooterIconPageActions footer = new FooterIconPageActions(test);
        footer.footerTestCase();
    }
    @Test
    public void testCase1() {
        test = reports.createTest("TestCase05");
        HealthLibraryPageActions hpa = new HealthLibraryPageActions(test);
        hpa.test1();
    }
 
    @Test
    public void testcase2() {
        test = reports.createTest("TestCase06");
        ForProvidersPageActions fpa=new ForProvidersPageActions(test);
        fpa.test2();
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
